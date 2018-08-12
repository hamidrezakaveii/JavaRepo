/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdeb;

import java.util.Scanner;

/**
 *
 * @author 1795545
 */
public class Execrcice_I_7 {
    
    public static void main(String[] args){
    
        int devidned,divisor;
        int quotient=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veullez entrer devidned:");
        devidned = sc.nextInt();
        System.out.println("Veullez entrer divisor:");
        divisor = sc.nextInt();

        while(devidned > divisor){
            devidned -= divisor;
            quotient += 1;
        }
        System.out.println("Le quotient est : "+quotient+"\nLe reste de la division est :"+devidned);
        
    }
    
}
