/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.ListPersonne;
import persistance.ManipulationFichier;
import vue.MainWindow;

/**
 *
 * @author HAMIDREZA
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListPersonne lp = new ListPersonne();
        String filename = "ListPersonne.txt";
        ManipulationFichier.lireFichier(filename, lp);
        

        
        //run MainWindow 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow(lp).setVisible(true);
            }
        });

    }

}
