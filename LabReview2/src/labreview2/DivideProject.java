/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreview2;

import java.util.*;  
import java.io.*;
public class DivideProject 
{
static Scanner console = new Scanner (System.in);
public static void main(String[] args) throws FileNotFoundException
{
int numberl;      // This is an integer declaration and assignment
int number2;
String str;		
	

PrintWriter outFile = new PrintWriter("divide.out"); // Output Object associated to divide.out File 
str = "The division of two numbers";	// This is string assignment
System.out.println(str);
System.out.println("Enter two integers separated by spaces");
numberl = console.nextInt(); 
number2 = console.nextInt();
System.out.println("The division of "+ numberl + " by " + number2 + " is " + (double)(numberl)/number2+"\n"); 
outFile.println("The division of "+ numberl + " by " + numberl + "is" + (double)(numberl)/number2+"\n");
System.out.println("Enter two integers separated by spaces");
numberl = console.nextInt(); 
number2 = console.nextInt();
System.out.println("The division of "+ numberl + " by " + number2 + " is " + (double)(numberl)/number2);  
outFile.println("The division of "+ numberl + " by " + number2 + " is " + (double)(numberl)/number2+"\n");
outFile.close();
  
       }

    }
