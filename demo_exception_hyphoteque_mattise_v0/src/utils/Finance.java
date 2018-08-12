/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modele.Hypoteque;

/**
 *
 * @author 1795545
 */
public class Finance {
    
    public static double calculMontantMensuel(Hypoteque hyphoteque){
        System.out.println("Bienveneu sur l`hypoteque");
        double montantHypot = hyphoteque.getMontenteHepotequeDemande();
        double tim = hyphoteque.getTauxInteretAnuuuel()/12;
        int nbreAnn = hyphoteque.getNbreAnnuel();
        double d =Math.pow(1+tim, 12*nbreAnn);
        return((montantHypot * tim)/ (1- (1/d)));
    }
}
