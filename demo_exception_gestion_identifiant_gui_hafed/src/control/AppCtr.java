package control;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.Usager;
import utils.IntrusionException;
import utils.Utilitaire;
import vue.GuiConnexion;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HBenteftifa
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int width = 500, height = 300;
        // initialiser frame
        Utilitaire objU = new Utilitaire();
        GuiConnexion objGui = new GuiConnexion(objU);

        // Note: on n'utilise pas de thread pour le moment.
        objGui.run();
        // indiquer le titre du frame
        objGui.setTitle("Écran de connexion");
        // Donner une taille de la frame pour  affichage
        objGui.setSize(width, height);
        // Afficher la frame et donc le Panel
        objGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objGui.setLocationRelativeTo(null);
        objGui.setResizable(false);
        objGui.setVisible(true);


        

    }

}
