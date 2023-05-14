package com.konkursing.greencode.onlinegame.logic;

import org.springframework.stereotype.Service;

import com.konkursing.greencode.onlinegame.model.Clan;
import com.konkursing.greencode.onlinegame.model.Group;
import com.konkursing.greencode.onlinegame.model.Order;
import com.konkursing.greencode.onlinegame.model.Players;

import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

@Service
public class OnlineGameService {

    public Order calculate(Players players) {
        int groupCount = players.getGroupCount();
        Comparator<Clan> clanComparator = Comparator
                .comparing(Clan::getPoints)
                .thenComparing(Clan::getNumberOfPlayers, Comparator.reverseOrder())
                .reversed();

        Queue<Clan> clans = new PriorityBlockingQueue<>(players.getClans().size(), clanComparator);

        ExecutorService executor = Executors.newFixedThreadPool(10); 

        for (Clan clan : players.getClans()) {
            executor.submit(() -> {
                synchronized (clans) {
                    clans.offer(clan);
                }
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Order result = new Order();
        while (!clans.isEmpty()) {
            Group group = new Group();
            int currentGroupSize = 0;

            Queue<Clan> tempQueue = new PriorityBlockingQueue<>(players.getClans().size(), clanComparator);

            while (!clans.isEmpty()) {
                Clan clan = clans.poll();
                if (currentGroupSize + clan.getNumberOfPlayers() <= groupCount) {
                    group.getClans().add(clan);
                    currentGroupSize += clan.getNumberOfPlayers();
                } else {
                    tempQueue.offer(clan);
                }
            }

            clans.addAll(tempQueue);

            result.getGroups().add(group);
        }
        return result;
    }
}
