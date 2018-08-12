/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.methods.in.java;

/**
 *
 * @author cstuser
 */
import java.util.Scanner;
public class Eggs {
    public static void main (String[]args){
        Scanner keyBoard=new Scanner(System.in);
    int number;
    int dozen;
    int individual;
    final double pricedozen = 3.25;
    final double priceindividual = 0.45;
    double total;
    double pricedozenfinal;
    double priceindividualfinal;
    System.out.println("Number of eggs in the order:");
    number=keyBoard.nextInt();
    dozen = (number / 12);
    individual = (number % 12);
    pricedozenfinal = (dozen * pricedozen);
    priceindividualfinal = (individual * priceindividual);
    total = pricedozenfinal + priceindividualfinal;
    System.out.println("You ordered "+ number +" eggs.That’s "+ dozen+ " dozen at" +pricedozen +" $ per dozen and " +individual+ " loose eggs at " + priceindividual+" cents each for a total of "+total);
    
    
    }
    
}
