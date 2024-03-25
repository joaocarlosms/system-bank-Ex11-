/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.components;

import com.mycompany.classes.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 12289319686
 */
public class ManagerListTransactions {
    private List<Transaction> listTransactions;
    
    public ManagerListTransactions() {
        this.listTransactions = new ArrayList<>();
    }

    public ManagerListTransactions(List<Transaction> listTransactions) {
        this.listTransactions = listTransactions;
    }

    public List<Transaction> getListTransactions() {
        return listTransactions;
    }

    public void setListTransactions(List<Transaction> listTransactions) {
        this.listTransactions = listTransactions;
    }

    @Override
    public String toString() {
        return "ManagerListTransactions{" + "listTransactions=" + listTransactions + '}';
    }
    
    public void addTransactions(Transaction newTransaction) {
        this.listTransactions.add(newTransaction);
    }
    
    public boolean removeTranasaction(String id_wanted) {
        for(Transaction transaction : listTransactions) {
            if(transaction.getId().equals(id_wanted)) {
                this.listTransactions.remove(transaction);
                return true;
            }
        }
        return false;
    }
}
