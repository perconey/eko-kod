package com.konkursing.greencode.onlinegame.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konkursing.greencode.onlinegame.model.Order;
import com.konkursing.greencode.onlinegame.model.Players;

@RestController
@RequestMapping("/onlinegame")
public class OnlineGameController {

    @Autowired
    private OnlineGameService onlineGameService;

    @PostMapping("/calculate")
    public ResponseEntity<Order> calculateOrder(@RequestBody Players players) {
        Order result = onlineGameService.calculate(players);
        return new ResponseEntity<Order>(result, HttpStatus.OK);
    }
}
