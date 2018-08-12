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
public class Execrcice_I_5 {
    
       public static void main(String[] args){
       int nombre;
       Scanner sc = new Scanner(System.in);
       System.out.println("Veullez saisit le nombre de anné :");
       nombre = sc.nextInt();
       
       if (nombre % 400 == 0){
           System.out.println("Anné est bissextiles");
       } 
       else if (((nombre % 400)%100) == 0){
           System.out.println("Anné n`est pas bissextiles");           
       }
       else if ((((nombre % 400)%100)%4) == 0){
           System.out.println("Anné bissextiles");           
       }
       else {
           System.out.println("Anné n`est pas bissextiles");           
       }
       
       }
}
