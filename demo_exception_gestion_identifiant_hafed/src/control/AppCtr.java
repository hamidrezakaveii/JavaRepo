package control;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.Usager;
import utils.IntrusionException;
import utils.Utilitaire;


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

        Usager user = Utilitaire.saisieInfos();//changer pour GUI

        boolean resultat = Utilitaire.verifierInfos(user);

        //Approche sans exception
        if (resultat) {
            System.out.println("Bienvenue sur le systeme");
        } else {
            System.out.println("Mauvaise connexion");
        }

        //Approche avec exception
        try {
            Utilitaire.traiterLogin(resultat, user);
        } catch (IntrusionException ex) {
            JOptionPane.showMessageDialog(null, "Intrusion Système" + ex.toString(), "Connexion non autorisée",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

}
