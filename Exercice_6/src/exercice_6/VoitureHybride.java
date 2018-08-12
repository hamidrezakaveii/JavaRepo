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
public class VoitureHybride extends Voiture implements VehiculeElectrique, VehiculeEssence{
    
    private int autonmie;
    private double consumation;
    private double co2;
    
    public VoitureHybride(String marque, String modele, int nbPlaces){
        super(marque, modele, nbPlaces);
    }
    
    @Override
    public int getAutonomie(){
        return autonmie;
    }
    
    @Override
    public double getConsumation(){
        return consumation;
    }
    @Override
    public double getCo2Emis(){
        return co2;
    }

    public void setAutonmie(int autonmie) {
        this.autonmie = autonmie;
    }

    public void setConsumation(double consumation) {
        this.consumation = consumation;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }
    
}
