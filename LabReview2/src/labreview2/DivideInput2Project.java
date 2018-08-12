/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreview2;

import java.util.*;  
import java.io.*;
public class DivideInput2Project 
{

public static void main(String[] args) throws FileNotFoundException
{
int numberl;      // This is an integer declaration and assignment
int number2;
String str;		
	
Scanner inFile = new Scanner(new FileReader("divide.in")); // Input object asscociated to divide.in File
PrintWriter outFile = new PrintWriter("divide.out"); // Output Object associated to divide.out File 
str = "The division of two numbers";	// This is string assignment
System.out.println(str);
outFile.println(str);
while (inFile.hasNextLine())
{
numberl = inFile.nextInt(); 
number2 = inFile.nextInt();
System.out.println("The division of "+ numberl + " by " + number2 + " is " + (double)(numberl)/number2+"\n"); 
outFile.println("The division of "+ numberl + " by " + numberl + "is" + (double)(numberl)/number2+"\n");
}
outFile.close();
inFile.close();
  
       }

    }

