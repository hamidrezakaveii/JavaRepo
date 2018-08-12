/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modele.Produit;

/**
 *
 * @author 1795545
 */
public class Utilitaire {
    
    public static Produit splitLigne(String ligne){
        String string = ligne;
        String[] parts = string.split(" ");
        String nom = parts[0]; // 
        int qtt = Integer.parseInt(parts[1]); //
        double prix = Double.parseDouble(parts[2]);
        
        return new Produit(nom, qtt, prix);
    }
}
