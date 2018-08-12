/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import control.AppCtr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.ListProduit;
import utils.Utilitaire;

/**
 *
 * @author 1795545
 */
public class ManipulationFichier {

    public static void lireFichier(String ficherInput, boolean statut, ListProduit registre) {

        File file = new File(ficherInput);
        FileReader fr = null;
        BufferedReader br = null;


        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                //System.out.println(ligne);
//                registre.add(Utilitaire.splitLigne(ligne));
                registre.ajouterProduit(Utilitaire.splitLigne(ligne));

            }
        } catch (IOException ex) {
            Logger.getLogger(AppCtr.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(AppCtr.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                if (br != null) {
                    br.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
