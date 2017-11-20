/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author PRAC
 */
public class BankAccount {
    private int accountNo;
    private float balance;
    
    BankAccount(int accountNo){
        this.accountNo=accountNo;
        balance=0f;
    }
    BankAccount(int accountNo, float balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
            
    public float deposit(float x){
        balance=balance+x;
        return balance;
    }
    
    public float withdraw(float x){
        balance=balance-x;
        return balance;
    }
    
    public int getAccountNO(){
        return accountNo;
    }
    
    public float getBalance(){
        return balance;
    }
    
    public void taxDeduction(){
        balance=(float) (balance*(0.95));// tax deducted is 5%
    }
    
}
