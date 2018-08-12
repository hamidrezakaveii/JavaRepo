/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.methods.in.java;
import java.util.Scanner;
public class NumbersDemo {
    public static void main(String[] args){
   int i ;
   int j ;
   Scanner keyBoard=new Scanner(System.in);
    System.out.println("Enter frist num:");
    i=keyBoard.nextInt();
    System.out.println("Enter second num:");
    j=keyBoard.nextInt();
   displayTwiceTheNumber(i);
   displayNumberPlusFive(i);
   displayNumberSquared(i);
   displayTwiceTheNumber(j);
   displayNumberPlusFive(j);
   displayNumberSquared(j);
    }
   public static void displayTwiceTheNumber(int i)
   {
       System.out.println("Twice the number "+i+"is "+(2*i));
   }
   public static void displayNumberPlusFive(int i)    
   {
       System.out.println("Display Number "+i+"Plus Five is "+(5+i));
   }
   public static void displayNumberSquared(int i)
   {
       System.out.println("Display Number "+i+" Squared is "+(i*i));
   }
           }
