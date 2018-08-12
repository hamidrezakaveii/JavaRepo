/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modele.ListProduit;
import persistance.ManipulationFichier;

/**
 *
 * @author 1795545
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichierInput = "listeproduit.txt";
//        ManipulationFichier.lireFichier(fichierInput);
//        
//        String FichierOutput = "dataout.txt";
//        String ligne = "La sortie est aussi facile que l`entreé!";
//        ManipulationFichier.ecrireFichier(FichierOutput, ligne);
        
        //String fichierInput2 = "datain.txt";
        ListProduit registre = new ListProduit();
        ManipulationFichier.lireFichier(fichierInput, true, registre);
        
//        String FichierOutput = "dataout2.txt";
//        String ligne = "La sortie est aussi facile que l`entreé!";
//        ManipulationFichier.ecrireFichier(FichierOutput, fichierInput);

    }
    
}
