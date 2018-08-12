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
public class Execrcice_I_4 {
        
    public static void main(String[] args){
       
       int nombre;
       Scanner sc = new Scanner(System.in);
       System.out.println("Veullez saisit le nombre de cotes :");
       nombre = sc.nextInt();
       
       switch (nombre){
           case 3:System.out.println("Triangle");
                break;
           case 4:System.out.println("Carré");
                break;
           case 5:System.out.println("Pentagone");
                break;
           case 6:System.out.println("Hexagone");
                break;
           case 7:System.out.println("Heptagone");
                break;
           case 8:System.out.println("Octogone");
                break;
           case 9:System.out.println("Enneagone");
                break;
           default: System.out.println("Figure inconnue!");
    }
      
    }
}

