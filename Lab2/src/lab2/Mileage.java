/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author cstuser
 */
import java.util.Scanner;
public class Mileage
{
	public static void main(String[] args)
	{
            double miles;
            double gallons;
            String stringmiles;
            String stringgallons;
            double per;
		// Add your declaration and code here.
            System.out.println("this program will calculate mileage");
            Scanner inputDevice = new Scanner(System.in);
      System.out.print("enter your mailes driven >>");
      stringmiles = inputDevice.nextLine();
      miles = Double.parseDouble(stringmiles);
      System.out.print("enter your gallons used >>");
      stringgallons = inputDevice.nextLine();
      gallons = Double.parseDouble(stringgallons);
      per = miles / gallons ;
      System.out.print("miles per gallons " + per);
      
	}
}

