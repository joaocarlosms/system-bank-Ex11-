/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 12289319686
 */
public class Account {
    private String numberAccount;
    private String holderAccount;
    private double balanceCurrent;
    
    public Account() {
        this.numberAccount = "";
        this.holderAccount = "";
        this.balanceCurrent = 0.0;
    }
    
    public Account(String numberAccount, String holderAccount, double balanceCurrent) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        this.balanceCurrent = balanceCurrent;
    }
    
    public Account(Account orig) {
        this.numberAccount = orig.getNumberAccount();
        this.holderAccount = orig.getHolderAccount();
        this.balanceCurrent = orig.getBalanceCurrent();
    }
    
    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getBalanceCurrent() {
        return balanceCurrent;
    }

    public void setBalanceCurrent(double balanceCurrent) {
        this.balanceCurrent = balanceCurrent;
    }

    @Override
    public String toString() {
        return "Account{" + "numberAccount=" + numberAccount + 
                ", holderAccount=" + holderAccount + 
                ", balanceCurrent=" + balanceCurrent + '}';
    }  
    
    public void accomplishDeposit(Account accountMakeDeposit, Account accountReceiveDeposit) {
         Scanner reader = new Scanner(System.in);

         System.out.println("Informe o valor do depósito: ");
         double valueDeposit = reader.nextDouble();
            
         if(valueDeposit <= 0) {
                System.out.println("Deposito invalido!");
          }
         if(accountMakeDeposit.getBalanceCurrent() <=  valueDeposit) {
                System.out.println("Saldo insuficiente!");
         }
         else {
                accountReceiveDeposit.setBalanceCurrent(accountReceiveDeposit.getBalanceCurrent() + valueDeposit);
                accountMakeDeposit.setBalanceCurrent(accountMakeDeposit.getBalanceCurrent() - valueDeposit);              
            }
    }
    
    public void accomplishServe(Account accountMakeServe) {
        if(accountMakeServe != null) {
            Scanner reader = new Scanner(System.in);
        
            System.out.println("Informe o valor do saque: ");
            double valueServe = reader.nextDouble();     
            
            if(valueServe <= 0) {
                System.out.println("Saque invalido");
            }            
            if(accountMakeServe.getBalanceCurrent() >=  valueServe) {
                System.out.println("Saldo insuficiente");
            }
            else {
                accountMakeServe.setBalanceCurrent(accountMakeServe.getBalanceCurrent() - valueServe);
            }
        }
        else {
            System.out.println("Conta invalida");
        }
    }
    
    public void attBalancePosTransaction(Account accountMakeDeposit, Account accountReceiveDeposit) {
        System.out.println("Saldo de quem recebeu a transação: "+ 
                accountReceiveDeposit.getBalanceCurrent());
         
        System.out.println("Saldo de quem realizou a transação: "+ 
                accountMakeDeposit.getBalanceCurrent());
    }
}
