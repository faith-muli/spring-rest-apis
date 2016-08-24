package com.user.domain;


import javax.persistence.*;

/**
 * Created by faith on 8/24/16.
 */

@Entity
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String bankName;
    String accountNumber;
    String balance;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public Bank(String bankName, String accountNumber, String balance, User user) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user=user;
    }

    private Bank() {

    }


    public long getId() {
        return id;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
