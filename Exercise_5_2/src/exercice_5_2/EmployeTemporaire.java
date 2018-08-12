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
public  class EmployeTemporaire extends Employe {
    
    private int nombreTravailles;
    private double tauxHeurers;

    public int getNombreTravailles() {
        return nombreTravailles;
    }

    public void setNombreTravailles(int nombreTravailles) {
        this.nombreTravailles = nombreTravailles;
    }

    public double getTauxHeurers() {
        return tauxHeurers;
    }

    public void setTauxHeurers(double tauxHeurers) {
        this.tauxHeurers = tauxHeurers;
    }
    

    
    
    
    public double calculerSalaireMensuel(){
        return nombreTravailles * tauxHeurers;
    }
    
}
