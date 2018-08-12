/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdeb;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 1795545
 */
public class Execrcice_I_9 {
    
    public static void main(String[] args){
        
        int n,nombre,diff;
        int count = 1;
        Random rand = new Random();
        n = rand.nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veullez devinez le nombre entre 0 et 10!");
        nombre = sc.nextInt();
        diff = java.lang.Math.abs(nombre-n);
        
        if (n == nombre)
            System.out.println("Vous devinez le nombre est: "+nombre+" Avec "+count+" essaie!");
        else{
            while(n != nombre){
            System.out.println("Veullez devinez le nombre entre 0 et 10!");
            nombre = sc.nextInt();
            count += 1;
            if (n == nombre)
                System.out.println("Vous devinez le nombre est: "+nombre+" Avec "+count+" essaie!");
                else if (diff > java.lang.Math.abs(nombre-n)){
                    System.out.println("Plus chaude!");
                    diff = java.lang.Math.abs(nombre-n);
                }
                else if (diff < java.lang.Math.abs(nombre-n)){
                    System.out.println("Plus frois!");
                    diff = java.lang.Math.abs(nombre-n);
                }
            }  
        }
    }
    
}    
