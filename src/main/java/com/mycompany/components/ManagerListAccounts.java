/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.components;

import com.mycompany.classes.Account;
import com.mycompany.classes.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 12289319686
 */
public class ManagerListAccounts {
    private List<Account> listAccounts;
    
    public ManagerListAccounts() {
        this.listAccounts = new ArrayList<>();
    }

    public ManagerListAccounts(List<Account> listAccounts) {
        this.listAccounts = listAccounts;
    }

    @Override
    public String toString() {
        return "ManagerListAccounts{" + "listAccounts=" + listAccounts + '}';
    }
    
    public void addAccount(Account newAccount) {
        this.listAccounts.add(newAccount);
    }
    
    public boolean removeAccount(String numberAccount_wanted) {
        for(Account account : listAccounts) {
            if(account.getNumberAccount().equals(numberAccount_wanted)) {
                this.listAccounts.remove(account);
                return true;
            }
        }
        return false;
    }
    
    public Account accountsHigherBalance() {
        double maxBalance = 0.0;
        Account accountHigherBalance = null;
        
        for(Account acc : listAccounts) {
            if(acc.getBalanceCurrent() > maxBalance) {
                maxBalance = acc.getBalanceCurrent();
                accountHigherBalance = acc;
            }
        }
        return accountHigherBalance;
    }
    
    public Account accountsSmallerBalance() {
        double minBalance = 9999999;
        Account accountSmallerBalance = null;
        
        for(Account acc : listAccounts) {
            if(acc.getBalanceCurrent() < minBalance) {
                minBalance = acc.getBalanceCurrent();
                accountSmallerBalance = acc;
            }
        }
        return accountSmallerBalance;
    }
}
