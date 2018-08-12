/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;



/**
 *
 * @author HAMIDREZA
 */
public class Utilitaire {
    
    private double nbreAnn;
    private double tauxAnnuel;
    private double montantHypot;
    private double map;

    public Utilitaire() {
        nbreAnn = -1;
        tauxAnnuel = -1;
        montantHypot = 0;
    }
    
    
    public double getNbreAnn() {
        return nbreAnn;
    }

    public void setNbreAnn(double nbreAnn) {
        this.nbreAnn = nbreAnn;
    }

    public double getTauxAnnuel() {
        return tauxAnnuel;
    }

    public void setTauxAnnuel(double tauxAnnuel) {
        this.tauxAnnuel = tauxAnnuel;
    }

    public double getMontantHypot() {
        return montantHypot;
    }

    public void setMontantHypot(double montantHypot) {
        this.montantHypot = montantHypot;
    }
    
    

    
    public void calculerMontant(){
        double tim = tauxAnnuel/100/12;
        map = (tim*montantHypot)/(1-(1/Math.pow((1+tim), (12*nbreAnn))));
    }
    
    @Override
    public String toString(){
        
        String composition="";
        composition += "*** LES INFORMATION SUR L'HYPOTHÉQUE ***\n";
        composition += "LE TAUX D'INTÉRÊT ANNEUL: "+tauxAnnuel+" %\n";
        composition += "LE MONTANT DE L'HYPOTHÉQUE: "
                +(double)Math.round(montantHypot * 100) / 100+" C$\n";
        composition += "LE MONTANT À PAYER CHAQUE MOIS: "
                +(double)Math.round(map * 100) / 100+" C$\n";
        composition += "LE MONTANT TOTAL QUI SERA PAYÉ À LA FIN DE L'HYPOTHÉQUE: "
                +(double)Math.round((map*nbreAnn*12) * 100) / 100+" C$";
        return composition;
    }
    
    
}
