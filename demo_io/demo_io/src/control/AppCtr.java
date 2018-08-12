/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.ManipulationFichier;

/**
 *
 * @author 1795545
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichierInput = "datain.txt";
//        ManipulationFichier.lireFichier(fichierInput);
//        
//        String FichierOutput = "dataout.txt";
//        String ligne = "La sortie est aussi facile que l`entreé!";
//        ManipulationFichier.ecrireFichier(FichierOutput, ligne);
        
        String fichierInput2 = "datain.txt";
        ManipulationFichier.lireFichier(fichierInput, true);
        
        String FichierOutput = "dataout2.txt";
        String ligne = "La sortie est aussi facile que l`entreé!";
        ManipulationFichier.ecrireFichier(FichierOutput, fichierInput);

    }



}
