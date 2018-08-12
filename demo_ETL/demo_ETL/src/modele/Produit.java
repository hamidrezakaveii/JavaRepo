/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author 1795545
 */
public class Produit {
    private String nom;
    private int qtt;
    private double prix;

    public Produit(String nom, int qtt, double prix) {
        this.nom = nom;
        this.qtt = qtt;
        this.prix = prix;
    }

    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQtt() {
        return qtt;
    }

    public void setQtt(int qtt) {
        this.qtt = qtt;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
}
