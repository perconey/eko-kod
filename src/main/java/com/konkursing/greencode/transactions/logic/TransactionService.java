package com.konkursing.greencode.transactions.logic;

import org.springframework.stereotype.Service;

import com.konkursing.greencode.transactions.model.Account;
import com.konkursing.greencode.transactions.model.Transaction;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    public List<Account> processTransactions(List<Transaction> transactions) {
        Map<String, Account> accountMap = new ConcurrentHashMap<>();

        transactions.parallelStream().forEach(transaction -> {
            String debitAccount = transaction.getDebitAccount();
            String creditAccount = transaction.getCreditAccount();
            BigDecimal amount = transaction.getAmount();

            accountMap.putIfAbsent(debitAccount, new Account(debitAccount));
            accountMap.putIfAbsent(creditAccount, new Account(creditAccount));

            Account debit = accountMap.get(debitAccount);
            Account credit = accountMap.get(creditAccount);

            synchronized (debit) {
                debit.setDebitCount(debit.getDebitCount() + 1);
                debit.setBalance(debit.getBalance().subtract(amount));
            }

            synchronized (credit) {
                credit.setCreditCount(credit.getCreditCount() + 1);
                credit.setBalance(credit.getBalance().add(amount));
            }
        });

        return accountMap.values().stream()
                .sorted((a1, a2) -> a1.getAccount().compareTo(a2.getAccount()))
                .collect(Collectors.toList());
    }
}