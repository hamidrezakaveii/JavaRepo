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
public class Hypoteque {
    
    private double tauxInteretAnuuuel;
    private int nbreAnnee;
    private double montenteHepotequeDemande;

    public Hypoteque(double tauxInteretAnuuuel, int nbreAnnuel, double montenteHepotequeDemande) {
        this.tauxInteretAnuuuel = tauxInteretAnuuuel;
        this.nbreAnnee = nbreAnnuel;
        this.montenteHepotequeDemande = montenteHepotequeDemande;
    }

    public double getTauxInteretAnuuuel() {
        return tauxInteretAnuuuel;
    }

    public void setTauxInteretAnuuuel(double tauxInteretAnuuuel) {
        this.tauxInteretAnuuuel = tauxInteretAnuuuel;
    }

    public int getNbreAnnuel() {
        return nbreAnnee;
    }

    public void setNbreAnnuel(int nbreAnnuel) {
        this.nbreAnnee = nbreAnnuel;
    }

    public double getMontenteHepotequeDemande() {
        return montenteHepotequeDemande;
    }

    public void setMontenteHepotequeDemande(double montenteHepotequeDemande) {
        this.montenteHepotequeDemande = montenteHepotequeDemande;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.tauxInteretAnuuuel) ^ (Double.doubleToLongBits(this.tauxInteretAnuuuel) >>> 32));
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
        final Hypoteque other = (Hypoteque) obj;
        if (Double.doubleToLongBits(this.tauxInteretAnuuuel) != Double.doubleToLongBits(other.tauxInteretAnuuuel)) {
            return false;
        }
        if (this.nbreAnnee != other.nbreAnnee) {
            return false;
        }
        if (Double.doubleToLongBits(this.montenteHepotequeDemande) != Double.doubleToLongBits(other.montenteHepotequeDemande)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hypoteque{" + "tauxInteretAnuuuel=" + tauxInteretAnuuuel + ", nbreAnnee=" + nbreAnnee + ", montenteHepotequeDemande=" + montenteHepotequeDemande + '}';
    }
    
    
}
