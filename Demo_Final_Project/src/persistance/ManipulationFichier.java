/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ListPersonne;
import model.Personne;
import static persistance.AddPersonne.addPersonne;

/**
 *
 * @author HAMIDREZA
 */
public class ManipulationFichier {

    public static void lireFichier(String filename, ListPersonne lp) {

        FileReader fw = null;
        BufferedReader bw = null;

        try {
            fw = new FileReader(filename);
            bw = new BufferedReader(fw);
            String line;
            while ((line = bw.readLine()) != null) {
                lp.put(addPersonne(line).getNom(), addPersonne(line));
            }

        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    
    public static void ecrireFichier(String filename, Personne p){
        
        FileWriter fw =null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(filename, true);
            bw = new BufferedWriter(fw);
            bw.write(p.toString());
            bw.newLine();
            bw.flush();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
}
