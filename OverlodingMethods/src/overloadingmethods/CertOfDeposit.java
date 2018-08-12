/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingmethods;

import java.time.*;
public class CertOfDeposit {
    private int cernum;
    private String lname;
    private LocalDate issuedate;
    private LocalDate enddate;
    private double balance;
    
    public CertOfDeposit (int c,String l,double b,LocalDate i){
    setCernum(c);
    setLname (l);
    setIssueDate (i);
    setBalance(b);
    setEndDate( issuedate.plusYears(1));
        
    }
    public void setCernum(int cn){
        cernum=cn;}
    public void setLname(String ln){
        lname=ln;}
    public void setIssueDate(LocalDate d){
        issuedate =d;}
    public void setEndDate(LocalDate ed){
        enddate=ed;}
    public void setBalance(double b){
        balance=b;}
    public int getCernum(){
        return cernum;
    } 
    public String getLname(){
        return lname;
    } 
    public LocalDate getIssueDate(){
        return issuedate;
    }
    public LocalDate getEndDate (){
        return enddate;
    }
        public double getBalance (){
        return balance;
    }
     
}
