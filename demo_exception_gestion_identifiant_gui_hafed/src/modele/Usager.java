/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author HBenteftifa
 */
public class Usager {
    private String motPasse, identifiant;

    public Usager() {
    }

    public Usager(String motPasse, String identifiant) {
        this.motPasse = motPasse;
        this.identifiant = identifiant;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    @Override
    public String toString() {
        return "Usager{" + "motPasse=" + motPasse + ", identifiant=" + identifiant + '}';
    }
    
    
    
}
