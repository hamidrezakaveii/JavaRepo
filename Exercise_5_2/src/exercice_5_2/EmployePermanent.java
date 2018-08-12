/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_5_2;

/**
 *
 * @author 1795545
 */
public class EmployePermanent extends Employe {
    
    private double salaireAnnuel;
    private int nbHeurersExtra;

    public double getSalaireAnnuel() {
        return salaireAnnuel;
    }

    public void setSalaireAnnuel(double salaireAnnuel) {
        this.salaireAnnuel = salaireAnnuel;
    }

    public int getNbHeurersExtra() {
        return nbHeurersExtra;
    }

    public void setNbHeurersExtra(int nbHeurersExtra) {
        this.nbHeurersExtra = nbHeurersExtra;
    }
    
    
    public EmployePermanent(String nom, String prenom){
        super(nom, prenom);
    }
    
    public double calculerTauxExtra(){
        return (this.salaireAnnuel/2000)*2;
    }
    
    public double calculerSalaireMensuel(){
        double resultat=0;
        resultat += this.salaireAnnuel/12;
        resultat += this.nbHeurersExtra * calculerTauxExtra();
        return resultat;
    }
    
}
