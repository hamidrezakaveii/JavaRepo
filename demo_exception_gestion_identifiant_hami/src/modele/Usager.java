/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Objects;

/**
 *
 * @author 1795545
 */
public class Usager {
    
    private String nom;
    private String motDePass;

    public Usager(String nom, String motDePass) {
        this.nom = nom;
        this.motDePass = motDePass;
    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 89 * hash + Objects.hashCode(this.nom);
//        hash = 89 * hash + Objects.hashCode(this.motDePass);
//        return hash;
//    }

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
        final Usager other = (Usager) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.motDePass, other.motDePass)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        String composition="";
        
        composition += "\nUsager nom: "+this.getNom();
        composition += "\nUsager mot de pass: "+this.motDePass;
        
        return composition;
        
    }
    
    
    
    
}
