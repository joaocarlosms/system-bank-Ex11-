/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author 12289319686
 */
public class Transaction {
    private String id;
    private String typeTransaction;
    private double value;
    private String date;
    private Account account;
    
    public Transaction() {
        this.id = "";
        this.typeTransaction = "";
        this.value = 0.0;
        this.date = "00/00/00";
        this.account = new Account();
    }

    public Transaction(String id, String typeTransaction, double value, String date, Account account) {
        this.id = id;
        this.typeTransaction = typeTransaction;
        this.value = value;
        this.date = date;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" + "id=" + id + 
                ", typeTransaction=" + typeTransaction + 
                ", value=" + value + ", date=" + date +
                ", account=" + account + '}';
    }   
}
