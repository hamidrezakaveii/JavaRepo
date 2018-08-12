/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 1795545
 */
public class Utilitaire {

    public static String trouverInterpretation(double img, int sexe) {
        String interpretation = "";

        if (sexe == 0) {
            if (img < 25) {
                interpretation = "trop maigre";
            } else if (25 >= img && img <= 30) {
                interpretation = "normal";
            } else {
                interpretation = "trop de graisse";
            }
        } else {
            if (img < 15) {
                interpretation = "trop maigre";
            } else if (15 >= img && img <= 20) {
                interpretation = "normal";
            } else {
                interpretation = "trop de graisse";
            }
        }

        return interpretation;
    }

    public static String calculMass(double masse, double taille, int age, int sexe) {

        DecimalFormat df2 = new DecimalFormat(".##");
        double img;
        double tailleCarre = Math.pow(taille, 2);

        img = ((1.2 * masse) / tailleCarre) + (0.23 * age) - (10.8 * sexe) - 5.4;
        Math.round(img);
        return (df2.format(Math.round(img)));

    }

}
