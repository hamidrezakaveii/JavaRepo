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
public class Execrcice_I_6 {
       
    public static void main(String[] args){
        
        int nombre,somme;
        somme =0;
        System.out.println("Veullez entrer le nombre pour la somme arithmetique:");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();
        
       for (int i=1; i <= nombre; i++){
           somme +=i;          
       }
       System.out.println("Le resultat est: "+somme);
    }
}
