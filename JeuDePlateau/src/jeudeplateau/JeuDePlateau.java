/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudeplateau;

import java.util.Scanner;

/**
 *
 * @author HAMIDREZA
 */
public class JeuDePlateau {

    public static void main(String[] args){
        
       boolean play = true;
       Plateau p = new Plateau();
       Scanner sc = new Scanner(System.in);
       
       System.out.println((char)27 +"[35m***** Wellcome to the new Board Game *****");
       
       Joueur joueur1 = new Joueur();
       System.out.println("Player 1: please enter your name:");
       joueur1.setNom(sc.nextLine());
       joueur1.setPosition(p.cases.get(0));
       
       Joueur joueur2 = new Joueur();
       System.out.println("Player 2: please enter your name:");
       joueur2.setNom(sc.nextLine());
       joueur2.setPosition(p.cases.get(0));
       
       
       
       while(play){
           if (p.playGame(joueur1,joueur2) == true){
               play = false;
           }
           else if(p.playGame(joueur2,joueur1) == true){
               play = false;
           } 
       }
    }
}
