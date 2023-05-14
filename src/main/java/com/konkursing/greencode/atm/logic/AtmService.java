package com.konkursing.greencode.atm.logic;

import org.springframework.stereotype.Service;

import com.konkursing.greencode.atm.model.ATM;
import com.konkursing.greencode.atm.model.Task;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AtmService {

    public List<ATM> getAtms(List<Task> serviceTasks) {
        List<Task> sortedTasks = serviceTasks.parallelStream()
                .sorted(Comparator.comparing(Task::getRegion)
                        .thenComparing(task -> task.getRequestType().getValue()))
                .toList();

        Set<Task> uniqueTasks = sortedTasks.parallelStream()
                .collect(Collectors.toCollection(() -> new LinkedHashSet<>(sortedTasks.size(), 1.0f)));

        List<ATM> orderedAtms = uniqueTasks.parallelStream()
                .map(task -> {
                    ATM atm = new ATM();
                    atm.setRegion(task.getRegion());
                    atm.setAtmId(task.getAtmId());
                    return atm;
                })
                .collect(Collectors.toList());
        return orderedAtms;
    }
}