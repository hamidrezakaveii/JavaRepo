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
public class Execrcice_I_2 {
    
    public static void main(String[]args){
        
        double cellesious,fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veullez saisit le degre de Fahrenheit");
        fahrenheit = sc.nextInt();
        
        cellesious = (fahrenheit -32)/1.8;
        System.out.println("Le degre de Cellesious est: "+cellesious);        
    }
    
}
