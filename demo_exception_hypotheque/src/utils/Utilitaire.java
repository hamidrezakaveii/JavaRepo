/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;
import java.lang.*;
import java.util.InputMismatchException;

/**
 *
 * @author HAMIDREZA
 */
public class Utilitaire {
    
    private double nbreAnn;
    private double tauxAnnuel;
    private double montantHypot;
    private double map;
    
    Scanner sc = new Scanner(System.in);
    
    
    public boolean setNombreDeAnnee() {

        System.out.println("Saisir le nombre d’années pour cette hypothèque:");
        if(!sc.hasNextInt()){
            sc.nextLine();  // clears the buffer
            throw new InputMismatchException("Mauvaise entrée!");            
        }
        else
            nbreAnn = sc.nextInt();
        if (nbreAnn < 0)
            throw new IllegalArgumentException("Le nombre d’années ne doit pas être négatif!");
        else 
        return false;
    }
    
    
    public boolean setTauxInteretAnnuel(){
        
        System.out.println("Saisir le taux d’intérêt annuel pour cette hypothèque: ");
        if(!sc.hasNextDouble()){
            sc.nextLine();  // clears the buffer
            throw new InputMismatchException("Mauvaise entrée!");            
        }
        else
            tauxAnnuel = sc.nextDouble();
        if (tauxAnnuel < 0)
            throw new IllegalArgumentException("Le taux d’intérêt annuel ne doit pas être négatif!");
        else 
        return false;
    }
    
    
    public boolean setMontantHypotheque(){
        
        System.out.println("Saisir le montant emprunté pour cette hypothèque: ");
        if(!sc.hasNextDouble()){
            sc.nextLine();  // clears the buffer
            throw new InputMismatchException("Mauvaise entrée!");            
        }
        else
            montantHypot = sc.nextDouble();
        if (montantHypot == 0)
            throw new IllegalArgumentException("Le montant emprunté pour l’hypothèque ne doit pas être égal à zéro!");
        else 
        return false;
    }
    
    public void calculerMontant(){
        double tim = tauxAnnuel/100/12;
        map = (tim*montantHypot)/(1-(1/Math.pow((1+tim), (12*nbreAnn))));
    }
    
    @Override
    public String toString(){
        
        String composition="";
        composition += "*** LES INFORMATION SUR L'HYPOTHÉQUE ***\n";
        composition += "LE TAUX D'INTÉRÊT ANNEUL: "+tauxAnnuel+" %\n";
        composition += "LE MONTANT DE L'HYPOTHÉQUE: "
                +(double)Math.round(montantHypot * 100) / 100+" C$\n";
        composition += "LE MONTANT À PAYER CHAQUE MOIS: "
                +(double)Math.round(map * 100) / 100+" C$\n";
        composition += "LE MONTANT TOTAL QUI SERA PAYÉ À LA FIN DE L'HYPOTHÉQUE: "
                +(double)Math.round((map*nbreAnn*12) * 100) / 100+" C$";
        return composition;
    }
    
    
}
