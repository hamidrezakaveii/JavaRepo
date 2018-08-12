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
public class VoitureElectrique extends Voiture implements VehiculeElectrique{
    
    public int autonomie;
    
    public VoitureElectrique(String marque, String modele, int nbPlaces){
        super(marque, modele, nbPlaces);
    }
    
    @Override
    public int getAutonomie(){
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
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
