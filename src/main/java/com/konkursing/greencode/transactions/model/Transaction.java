package com.konkursing.greencode.transactions.model;

import java.math.BigDecimal;

public class Transaction {

    private String debitAccount;
    public String getDebitAccount() {
        return debitAccount;
    }
    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    private String creditAccount;
    public String getCreditAccount() {
        return creditAccount;
    }
    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

    private BigDecimal amount;
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
