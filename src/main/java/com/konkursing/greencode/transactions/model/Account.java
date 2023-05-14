package com.konkursing.greencode.transactions.model;

import java.math.BigDecimal;

public class Account {
    private String account;
    public Account(String debitAccount) {
        account = debitAccount;
        debitCount = 0;
        creditCount = 0;
        balance = BigDecimal.ZERO;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    private int debitCount;
    public int getDebitCount() {
        return debitCount;
    }
    public void setDebitCount(int debitCount) {
        this.debitCount = debitCount;
    }

    private int creditCount;
    public int getCreditCount() {
        return creditCount;
    }
    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    private BigDecimal balance;
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
