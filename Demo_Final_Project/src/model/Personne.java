/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HAMIDREZA
 */
public class Personne {
    
    private String nom;
    private String prenom;
    private int age;
    private String telephone;

    public Personne(String nom, String prenom, int age, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return nom+";"+prenom+";"+age+";"+telephone;
    }
    
    
    
    
}

