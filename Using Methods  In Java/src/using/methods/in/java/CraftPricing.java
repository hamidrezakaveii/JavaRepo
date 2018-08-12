/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.methods.in.java;
import java.util.Scanner;
public class CraftPricing {
    public static void main (String[] args)
    {
        String productname;
        double cost;
        int hour;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter product name :");
        productname = keyboard.nextLine();
        System.out.println("Please enter cost of material:");
        cost = keyboard.nextDouble();
        System.out.println("Please enter number of hours of work required:");
        hour = keyboard.nextInt();
        System.out.println("Final price for product"+ productname+ "is "+finalPrice (cost,hour)+"$" );
                           
    }
    public static double finalPrice (double c,int h)
    {
        double price;
        price = (((c+12)*h)+7);
        return price;
    }
}
