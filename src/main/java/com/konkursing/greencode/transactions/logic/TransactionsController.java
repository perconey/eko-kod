package com.konkursing.greencode.transactions.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konkursing.greencode.transactions.model.Account;
import com.konkursing.greencode.transactions.model.Transaction;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/report")
    public ResponseEntity<List<Account>> generateReport(@RequestBody List<Transaction> transactions) {
        List<Account> accounts = transactionService.processTransactions(transactions);
        return ResponseEntity.ok(accounts);
    }
}
