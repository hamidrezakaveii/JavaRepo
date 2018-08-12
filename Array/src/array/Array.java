/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
public class Array {

    
    public static void main(String[] args) {
        String car;
        String[] vowels = {"a","e","i","o","u"};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter caracther :");
        car = keyboard.nextLine();
        for(int i=0;i<vowels.length;i++)
            if (car == vowels[i])
            System.out.println("You enter vowel !"+vowels[i]);
               // else 
                //System.out.println("You enter non vowel !");
            
        
    }
    
}
