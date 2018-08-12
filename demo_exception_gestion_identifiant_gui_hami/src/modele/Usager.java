/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Objects;

/**
 *
 * @author HAMIDREZA
 */
public class Usager {
    
    private String motPasse, identifiant;

    public Usager() {
    }

    public Usager(String identifiant, String motPasse) {
        this.identifiant = identifiant;
        this.motPasse = motPasse;

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

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Usager other = (Usager) obj;
        if (!Objects.equals(this.motPasse, other.motPasse)) {
            return false;
        }
        if (!Objects.equals(this.identifiant, other.identifiant)) {
            return false;
        }
        return true;
    }
    
    
    
}
