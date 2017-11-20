/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PRAC
 */
public class Bank extends Reader {
    
    public static void main(String[] args){
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        BankAccount customer1 = new BankAccount(1,1000);
        BankAccount customer2 = new BankAccount(2,2000);
        accounts.add(customer1);
        accounts.add(customer2);
        Iterator itr = accounts.iterator();
        while(itr.hasNext())
        {
            BankAccount ba=(BankAccount)itr.next();  
            System.out.println(ba.getAccountNO()+"\n"+ba.getBalance()+"\n");
        }
        new Bank().getAccMinMax(accounts);
        new Bank().totalBalance(accounts,customer1);
        new Bank().findAccount(accounts);
        new Bank().countFor(accounts);
    }
    public ArrayList<BankAccount> addAccount(){
        
        int ano;
        System.out.println("Enter a new account number: ");
        ano=reader.nextInt();
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        BankAccount customer1 = new BankAccount(ano);
        accounts.add(customer1);
        return accounts;
    }
    public float totalBalance(ArrayList<BankAccount> a1, BankAccount ba){
        float balance=0;
        if(a1.contains(ba)){
            balance=ba.getBalance();
        }
        else{
            System.out.println("Not found\n");
        }
        System.out.println("\nBalance "+balance+"\n");
        return balance;
    }
    public void countFor(ArrayList<BankAccount> a1){
        float balance=reader.nextFloat();
        Iterator itr = a1.iterator();
        while(itr.hasNext())
        {
            BankAccount ba=(BankAccount)itr.next();  
            if(balance<=ba.getBalance())
            {
                System.out.println(ba.getAccountNO()+"\n"+ba.getBalance()+"\n");
            }
            break;
        }
    }
    public void findAccount(ArrayList<BankAccount> a1){
        int ano=reader.nextInt();
        Iterator itr = a1.iterator();
        while(itr.hasNext())
        {
            BankAccount ba=(BankAccount)itr.next();  
            if(ano==ba.getAccountNO())
            {
                System.out.println("Balance of give account number "+ano+": "+ba.getBalance());
            }
            break;
        }
    }
    public void getAccMinMax(ArrayList<BankAccount> a1){
        float min,max;
        min=1000;
        max=1000;
        Iterator itr = a1.iterator();
        while(itr.hasNext())
        {
            BankAccount ba=(BankAccount)itr.next();  
            if(min>ba.getBalance()){
                min=ba.getBalance();
            }
            if(max<ba.getBalance()){
                max=ba.getBalance();
            }
        }
        System.out.println("Minimum Balance: "+min+" maximum balance: "+max+"\n");
    }
}
