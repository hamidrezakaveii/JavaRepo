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
public class Camion extends Vehicule {
    
    private double chargeMax;
    
    public Camion(String marque, String modele, double chargeMax){
        super(marque, modele);
        this.chargeMax = chargeMax;
    }

    public double getChargeMax() {
        return chargeMax;
    }

    public void setChargeMax(double chargeMax) {
        this.chargeMax = chargeMax;
    }

        public String toString(){               //tous les class herite le class object
         String conversion="";
         conversion += "Marque : " +this.getMarque();
         conversion += "Modele : " +this.getModele();
         conversion += "charge Max : " +this.getChargeMax();
         return conversion;
    }
}
