/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculerspacecamion;

import java.util.Scanner;

/**
 *
 * @author HAMIDREZA
 */
public class CalculerSpaceCamion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Camion ca = new Camion();
       //int longeur, largeur;
       Scanner sc = new Scanner(System.in);
       boolean notFinish=true;
       
       
        /*while(ca.estPlein() && notFinish){

            
            System.out.println("Veuillez saisir les dimentions d'une boite:");
            System.out.print("Longeur: ");
            longeur = sc.nextInt();
            System.out.print("Largeur: ");
            largeur = sc.nextInt();
            if (longeur == 0 && largeur == 0){
                notFinish = false;
            }
            if (notFinish){
                ca.ajouterBoite(new Boite(longeur, largeur));
            }            
        }*/
        
        while(ca.estPlein() && notFinish){

            Boite b = new Boite();
            System.out.println("Veuillez saisir les dimentions d'une boite:");
            System.out.print("Longeur: ");
            b.setLargeur(sc.nextInt());
            System.out.print("Largeur: ");
            b.setLongeur(sc.nextInt());
            if (b.getLongeur() == 0 && b.getLargeur() == 0){
                notFinish = false;
            }
            if (notFinish){
                ca.ajouterBoite(b);
            }            
        }
        
        System.out.println(ca);
    }
    
}
