/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author 1795545
 */
public class Employe {
    
    private String nom;
    private int age;

    
    public Employe() {

    }
    
    public Employe(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    @Override
    public String toString(){
        String composition="";
        
        composition = "Nom: "+ this.getNom()+" Age: "+this.getAge();
        
        return composition;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nom);
        hash = 89 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    

    
}
