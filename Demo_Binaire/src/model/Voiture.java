/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 1795162
 */
public class Voiture implements Serializable{
    private static final long serialVersionUID = 4463223966911611056L;


    private String nom ;
    private String model;
     private double kg ;

    @Override
    public String toString() {
        return "Voiture{" + "nom=" + nom + ", model=" + model + ", kg=" + kg + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }
   

    public Voiture(String nom, String model, double kg) {
        this.nom = nom;
        this.model = model;
        this.kg = kg;
    }
   
    
}
