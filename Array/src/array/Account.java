/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.time.*;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;
    
    public Account(){
    id = 0;
    balance = 0;
    annualInterestRate =0;
    dateCreated = LocalDate.now();
    }
    public Account (int ide,double bal){
        id=ide;
        if (bal < 50) balance=50 ;
                else balance =bal;
        annualInterestRate = 0;
        dateCreated = LocalDate.now();
    }
    public  void setId (int ide){
        id= ide;
    }
    public void setBalance (double bal){
        balance=bal;
    }
    public void setAnnualInterestRate (double rate){
        annualInterestRate=rate;
    } 
        public int getId (){
        return id;
        }
        public double getBalance (){
        return balance;
        }
        public double getInterestRate (){
        return annualInterestRate;
        }
        public LocalDate getDateCreated (){
        return dateCreated;
        }
        public double getMonthlyInterestRate(){
            return annualInterestRate/1200; }
        public double getMonthlyInterest(){
            
            return balance*annualInterestRate/1200;}

        public void withdraw(double amount){
        balance -= amount;
         }
        public void deposit(double amount){
        balance += amount;
         }        
}




