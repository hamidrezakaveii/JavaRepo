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
public class SUV extends Vehicule {
    
    private int nbPlaces;
    private boolean quatreRouesMotrice;
    
    public SUV(String marque, String modele, int nbPlaces, Boolean quatreRous){
        super(marque, modele);
        this.nbPlaces = nbPlaces;
        this.quatreRouesMotrice = quatreRous; 
        
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public boolean isQuatreRouesMotrice() {
        return quatreRouesMotrice;
    }

    public void setQuatreRouesMotrice(boolean quatreRouesMotrice) {
        this.quatreRouesMotrice = quatreRouesMotrice;
    }
    
        public String toString(){               //tous les class herite le class object
         String conversion="";
         conversion += "Marque : " +this.getMarque();
         conversion += "Modele : " +this.getModele();
         conversion += "Places : " +this.getNbPlaces();
         conversion += "AWD: "+(this.isQuatreRouesMotrice()?"Oui":"Non");  // (condition? valeur_true : valeur_false)
         return conversion;                                                //     .operateur terndire
    }
    
}
