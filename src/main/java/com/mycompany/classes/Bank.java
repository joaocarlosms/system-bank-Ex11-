/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.components.ManagerListAccounts;
import com.mycompany.components.ManagerListTransactions;

/**
 *
 * @author 12289319686
 */
public class Bank {
    private String name;
    private ManagerListAccounts listAccounts;
    private ManagerListTransactions listTransactions;
    
    public Bank() {
        this.name = "";
        this.listAccounts = new ManagerListAccounts();
        this.listTransactions = new ManagerListTransactions();
    }

    public Bank(String name, ManagerListAccounts listAccounts, ManagerListTransactions listTransactions) {
        this.name = name;
        this.listAccounts = listAccounts;
        this.listTransactions = listTransactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManagerListAccounts getListAccounts() {
        return listAccounts;
    }

    public void setListAccounts(ManagerListAccounts listAccounts) {
        this.listAccounts = listAccounts;
    }

    public ManagerListTransactions getListTransactions() {
        return listTransactions;
    }

    public void setListTransactions(ManagerListTransactions listTransactions) {
        this.listTransactions = listTransactions;
    }
    
    public void addNewAccounts(Account newAccount) {
        this.listAccounts.addAccount(newAccount);
    }
    
    public void addNewTransactions(Transaction newTransactions) {
        this.listTransactions.addTransactions(newTransactions);
    }
    
    public void removeAccounts(String numberAccountWanted) {
        boolean accountRemoved = this.listAccounts.removeAccount(numberAccountWanted);
        
        if(!accountRemoved)
            System.out.println("Conta não encontrada");
        else
            System.out.println("Conta removida com sucesso!");
    }
    
    public void removeTransactions(String id_wanted) {
        boolean transactionRemoved = this.listTransactions.removeTranasaction(id_wanted);
        
        if(!transactionRemoved) 
            System.out.println("Transação não encontrada");
        else
            System.out.println("Transação removida com sucesso");
    }
    
    public void printAccountsAndTransactions() {
        System.out.println("---- LISTA DE CONTAS ----");
        System.out.println(listAccounts);
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        
        System.out.println("---- LISTA DE TRANSAÇÕES ----");
        System.out.println(listTransactions);
    } 
}
