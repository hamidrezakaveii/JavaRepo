/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import control.AppCtr;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1795545
 */
public class ManipulationFichier {

    public static void lireFichier(String fichier) {
        // lecture
        File file = new File(fichier);
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            int c = 0;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);

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
        }
    }

    public static void ecrireFichier(String fichierOutput, String ligne) {
        File file = new File(fichierOutput);
        FileWriter fw = null;

        try {
            fw = new FileWriter(file);
            fw.write(ligne);
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void ecrireFichier(String fichierOutput, String data, boolean statut) {
        File file = new File(fichierOutput);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            fw.write(data);
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (bw != null) {
                        bw.close();
                    }

                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void lireFichier(String ficherInput, boolean statut) {

        File file = new File(ficherInput);
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.print(ligne);

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
