/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.methods.in.java;

import java.util.Scanner;
public class MetricConversion
{
public static void main(String[] args)
{
    Scanner keyBoard=new Scanner(System.in);
    double d;
    System.out.println(" Enter number:");
    d = keyBoard.nextDouble();
    inchConvertor(d);
    gallonConverter(d);
    }
public static void inchConvertor (double n){
System.out.println("Result of inch to number is : "+ String.format("%.2f",n*2.54));
      
}
public static void gallonConverter (double n){
System.out.println("Result of gallons to liters is : "+ String.format("%.2f",n*3.78541));
}
}
  