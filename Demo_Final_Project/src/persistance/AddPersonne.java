/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import model.Personne;

/**
 *
 * @author HAMIDREZA
 */
public class AddPersonne {
    
    public static Personne addPersonne(String line){
        Personne p;
        String[] parts = new String[4];
        parts = line.split(";");
        String nom = parts[0];
        String prenom = parts[1];
        int age = Integer.parseInt(parts[2]);
        String telephone = parts[3];
        p = new Personne(nom, prenom, age, telephone);     
        return p;
    }
    
    
}
