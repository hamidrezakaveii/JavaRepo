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
public class VoitureEssance extends Voiture implements VehiculeEssence{
    
    private double cosomation;
    private double emissions;
            
    public VoitureEssance(String marque, String modele, int nbPlaces){
        super(marque, modele, nbPlaces);
    }
    
    public double getConsumation(){
        return cosomation;
    }
    public double getCo2Emis(){
        return emissions;
    }

    public void setCosomation(double cosomation) {
        this.cosomation = cosomation;
    }

    public void setEmissions(double emissions) {
        this.emissions = emissions;
    }
    
}
