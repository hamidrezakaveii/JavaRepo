/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 1795545
 */
public class Utilitaire {
    
    public static String modifierNom(String nom){
        return nom.toUpperCase();
    }

    public static void modifierNom(JTextField txtNom) {
        txtNom.setText(txtNom.getText().toUpperCase());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void modifierPrenom(JTextField txtPrenom) {
        txtPrenom.setText(txtPrenom.getText().toUpperCase());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void calculSpecial(JTextField txtValeur1, JTextField txtValeur2, JTextField txtResultat) {
        try{
        int val1, val2;
        val1 = Integer.parseInt(txtValeur1.getText());
        val2 = Integer.parseInt(txtValeur2.getText());
        txtResultat.setText(String.valueOf(val1 * val2));
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Invalid texte et/ou champ est vide!", "Errour de saisir", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
