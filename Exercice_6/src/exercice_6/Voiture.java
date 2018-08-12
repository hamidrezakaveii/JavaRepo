/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_6;

/**
 *
 * @author 1795545
 */
public class Voiture extends Vehicule {
    
    private int nbPlaces;
    
    
    public Voiture(String marque, String modele, int nbPlaces){
        super(marque, modele);
        this.nbPlaces = nbPlaces;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }
    

    @Override
    public String toString(){               //tous les class herite le class object
         String conversion="";
         conversion += "Marque : " +this.getMarque();
         conversion += "Modele : " +this.getModele();
         conversion += "Places : " +this.getNbPlaces();
         return conversion;
    }
    
}
