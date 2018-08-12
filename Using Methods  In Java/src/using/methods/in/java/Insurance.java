/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package using.methods.in.java;
import java.util.Scanner;
public class Insurance {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your current year :");
        int currentyear;
        currentyear = keyboard.nextInt();
        System.out.println("Enter your birth year :");
        int birthyear;
        birthyear = keyboard.nextInt();
        System.out.println("You must pay : "+premiumAmount ( currentyear ,birthyear)+"$");
        
    }
            public static int premiumAmount (int c,int b)
            {
                int premium;
                premium = (((c - b )/ 10)+15)*20;
                return premium;
                
               
            }
    
    
}
