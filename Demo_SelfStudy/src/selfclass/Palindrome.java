/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfclass;

import java.util.Scanner;
public class Palindrome {
    static String orginal,reverse = "";
    public static void main (String[] args){

    
    Scanner in = new  Scanner(System.in);
    
    System.out.println("Please enter you string : ");
    orginal = in.next();
    System.out.println("Palindrom check is :" + palindrom(orginal));

    }
    
    static boolean palindrom(String org){
      int lenght = org.length();
        for (int i = lenght - 1;i >= 0;i--)
            reverse = reverse + orginal.charAt(i);
        if (orginal.equals(reverse))
                return true;
        else
                return false;
        
    }
    
}
