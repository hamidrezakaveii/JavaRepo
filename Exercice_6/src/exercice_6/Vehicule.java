package exercice_6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1795545
 */
public abstract class Vehicule {
    
    private String marque;
    private String modele;
    private double prixParJour;
    private double prixParSemaine;
    
    public Vehicule(String marque, String model){
        this.marque = marque;
        this.modele = model;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(double prixParJour) {
        this.prixParJour = prixParJour;
    }

    public double getPrixParSemaine() {
        return prixParSemaine;
    }

    public void setPrixParSemaine(double prixParSemaine) {
        this.prixParSemaine = prixParSemaine;
    }
    
    //public abstract double calculerPrix(); 
    
    
}
