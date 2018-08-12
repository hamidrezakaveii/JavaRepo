/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author cstuser
 */
// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/
import java.util.Scanner;
public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output
 
      // TASK #2 declare variables used here
      String firstName;
      String lastName;
      String fullName;
      // TASK #3 declare variables used here
      char firstInitial;
      // TASK #4 declare variables used here
      double diameter;
      String stringdiameter;
      double volume;

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / (double)NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (5 * (BOILING_IN_F - 32))/9;
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
      // Read the user's first name
      // Prompt the user for last name
      // Read the user's last name
      // Concatenate the user's first and last names
      // Print out the user's full name
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("enter your name >>");
      firstName = inputDevice.nextLine();
      System.out.print("enter your family >>");
      lastName = inputDevice.nextLine();
      fullName = firstName +" "+ lastName;
      System.out.println("your full name is " + fullName);
      

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      firstInitial = firstName.charAt(0);
      System.out.println("user's first initial is " + firstInitial);
      fullName = fullName.toUpperCase();
      System.out.println("your full name in upper case is :" +fullName+" and the length is :" + fullName.length());
      
      // Get the first character from the user's first name
      // Print out the user's first initial
      // Convert the user's full name to uppercase
      // Print out the user's full name in uppercase

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      System.out.print("enter your diameter >>");
      stringdiameter = inputDevice.nextLine();
      diameter = Double.parseDouble(stringdiameter);
      volume = (4 * Math.PI * Math.pow(diameter/2, 3))/3;
      System.out.println("the volume is :"+ volume);
      
      // Prompt the user for a diameter of a sphere
      // Read the diameter
      // Calculate the radius
      // Calculate the volume
      // Print out the volume
   }
}
