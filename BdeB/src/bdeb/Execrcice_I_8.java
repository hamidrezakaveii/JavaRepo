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
public class Execrcice_I_8 {
    
    public static void main(String[] args){
        
        int n,nombre;
        int count = 0;
        Random rand = new Random();
        n = rand.nextInt(10);
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Veullez devinez le nombre entre 0 et 10");
        nombre = sc.nextInt();
        count += 1;
        if (n > nombre)
            System.out.println("Plus bas");
        else if (n < nombre)
            System.out.println("Plus haut");
        else if (n == nombre)
            System.out.println("Vous devinez le nombre est: "+nombre+" Avec "+count+" essaie");
        
        }while (n != nombre);   
        
    }
    
}
