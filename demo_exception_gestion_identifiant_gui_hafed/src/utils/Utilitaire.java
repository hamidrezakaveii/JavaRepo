/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.Usager;

/**
 *
 * @author HBenteftifa
 */
public class Utilitaire {

    public static Usager saisieInfos() {
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Saisir identifiant:");
        String identifiant = lecteur.nextLine();
        System.out.println("Saisir mot de passe:");
        String motPasse = lecteur.nextLine();
        return new Usager(motPasse, identifiant);
    }

    public static boolean verifierInfos(Usager user) {

//        if (user.getIdentifiant().equals("flouflou") && user.getMotPasse().equals("admin1234")) {
//            return true;
//        }
//        return false;
        return (user.getIdentifiant().equals("flouflou") && user.getMotPasse().equals("admin1234"));

    }

    public static void traiterLogin(boolean resultat, Usager user) throws IntrusionException {

        if (resultat) {
            JOptionPane.showMessageDialog(null, "Bienvenue sur le systeme", "Connexion autorisée",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Intrusion Système", "Connexion non autorisée",
                    JOptionPane.ERROR_MESSAGE);
            //Obtenir le nom de la machine et autres infos
            String machine = getInfosMachine();
            Timestamp stamp = new Timestamp(System.currentTimeMillis());
            throw new IntrusionException(user, machine, stamp);
            // System.exit(0);

        }
    }

    private static String getInfosMachine() {
        StringBuilder sb = new StringBuilder();
        java.net.InetAddress localMachine = null;
        try {
            localMachine = java.net.InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        sb.append("\nCode usager:");
        sb.append(System.getProperty("user.name"));
        sb.append("\nMachine:");
        sb.append(localMachine.getHostName());
        return sb.toString();
    }

}
