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
    
    
    
    public static void modifierChaine(JTextField txtNom) {
            txtNom.setText(txtNom.getText().toUpperCase());
    }

    public static int calculLangueur(JTextField txtChaine) {
//                int counter = 0;
//                String str = txtChaine.getText();
                //dans le cas de count la letter
//                for (int i = 0; i < str.length(); i++){
//                if (Character.isLetter(str.charAt(i)))
//                counter++;}
                return txtChaine.getText().length();
    }

    public static void calculInversion(JTextField txtChaine) {
        
            String str = txtChaine.getText();
            String result="";
            for(int i=str.length()-1; i>=0; i--) {
                result = result + str.charAt(i);
            }
                txtChaine.setText(result);

    }
}
