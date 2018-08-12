/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Etud;
import modele.ListProduit;
import modele.Produit;

/**
 *
 * @author 1795545
 */
public class ManipulationFichierBinaire {

//        FileOutputStream fos = new FileOutputStream("t.tmp"); 
//        ObjectOutputStream oos = new ObjectOutputStream(fos); 
//        oos.writeInt(12345); 
//        oos.writeObject("Today"); 
//        oos.writeObject(new Date()); 
//        oos.close(); 
    public static void ecrireFichier(String fichierOutput, ListProduit lp, boolean statut) {

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(fichierOutput);
            oos = new ObjectOutputStream(fos);

            Produit p1 = new Produit("hamid", 12, 11.5);
            Produit p2 = new Produit("Amr", 12, 11.5);
            Produit p3 = new Produit("Se", 12, 11.5);

            Etud e1 = new Etud("hafed", 10, 55.5);
            Etud e2 = new Etud("sorya", 10, 55.5);

            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.writeObject(e1);
            oos.writeObject(e2);

//            for (Produit p : lp) {
//                oos.writeObject(p);
//            }
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichierBinaire.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ManipulationFichierBinaire.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void lireFichier(String fichierinput, boolean statut) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fichierinput);
            ois = new ObjectInputStream(fis);
            Produit p1 = (Produit) ois.readObject();
            Produit p2 = (Produit) ois.readObject();
            Produit p3 = (Produit) ois.readObject();
            Etud e1 = (Etud) ois.readObject();
            Etud e2 = (Etud) ois.readObject();

            System.out.println(p1+ "  "+p2+" "+p3+" "+" "+e1+" "+e2);
            
//            while ((fis.available() > 0)) {
//
//                String x = (String) ois.readObject();
//
//                System.out.println(x);
//            Produit p = (Produit)ois.readObject();
//            System.out.println(p);            
            //           }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipulationFichierBinaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichierBinaire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManipulationFichierBinaire.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
