package control;

import modele.Hypoteque;
import utils.Finance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1795545
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hypoteque hypoteque = new Hypoteque(0.05, 25, 100000);
        
        System.out.println(Finance.calculMontantMensuel(hypoteque));
    }
    
}
