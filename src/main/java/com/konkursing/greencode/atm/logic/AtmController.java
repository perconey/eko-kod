package com.konkursing.greencode.atm.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konkursing.greencode.atm.model.ATM;
import com.konkursing.greencode.atm.model.Task;


@RestController
@RequestMapping("/atms")
public class AtmController {

    @Autowired
    private AtmService atmService;

    @PostMapping("/calculateOrder")
    public ResponseEntity<List<ATM>> calculateOrder(@RequestBody List<Task> serviceTasks) {

        List<ATM> orderedAtms = atmService.getAtms(serviceTasks);

        return new ResponseEntity<>(orderedAtms, HttpStatus.OK);
    }


}
