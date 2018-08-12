/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lists;
import model.Personne;
import model.Voiture;

/**
 *
 * @author 1795162
 */
public class Mainp {

    public static <T, U> void ecrireFicher(T t, U u) {


        boolean exists = new File((String) u).exists();
        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream((String) u, true);
             oos = exists
                    ? new ObjectOutputStream(fos) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            } : new ObjectOutputStream(fos);
            
            oos.writeObject(t);
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static <U> void lire(U u,Lists ls) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            ois = new ObjectInputStream(fis = new FileInputStream((String) u));

            while (fis.available()>0){
            Object p1 = ois.readObject();
            ls.add(p1);

            }
 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Mainp.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

    }



}
