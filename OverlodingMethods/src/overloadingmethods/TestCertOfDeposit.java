/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingmethods;

import java.time.LocalDate;

import java.util.Scanner;
import java.time.*;
public class TestCertOfDeposit {
    public static void main(String[] args){
    int cernum;
    String lname;
    int y ;
    int m ;
    int d;
    double balance;
    CertOfDeposit c1;
    CertOfDeposit c2;
    Scanner keyboard=new Scanner(System.in);
    for (int i =0; i < 2;i++){
    System.out.println("enter certificate number :");
    cernum = keyboard.nextInt();
    System.out.println("Type year: ");
    y =keyboard.nextInt();
    System.out.println("Type month: ");
    m =keyboard.nextInt();
    System.out.println("Type day: ");
    d = keyboard.nextInt();
    System.out.println("Enter last name :");
    lname = keyboard.next();
    System.out.println("Enter Balance :");
    balance = keyboard.nextDouble();
    switch (i){
    case 0 :  c1 = new CertOfDeposit(cernum,lname,balance,LocalDate.of(y,m,d)) ;
        display(c1);break;
    case 1 :  c2 = new CertOfDeposit(cernum,lname,balance,LocalDate.of(y,m,d)) ;
        display(c2);break;
               }
                                 }

                                                     }
    public static void display(CertOfDeposit c){
      System.out.println("Certificate  Number is : "+ c.getCernum()+" Last name  is : "+c.getLname()+" Balance is : "+c.getBalance()+" Issue date is : "+c.getIssueDate()+
                " Maturity date is : "+c.getEndDate());  
                                               }
  
}
