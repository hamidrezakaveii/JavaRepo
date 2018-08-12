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
public class Execrcice_I_3 {
    
    public static void main(String[] args){
       
       int nombre,m;
       Scanner sc = new Scanner(System.in);
       System.out.println("Veullez saisit le nombre :");
       nombre = sc.nextInt();
       
       m = nombre % 2;
       if (m == 0)
          System.out.println("Le nombre est pair");
       else
          System.out.println("Le nombre est impair");
      
    }
}
