/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author 1795545
 */
public class Utilitaire {

    public static void afficherRegistreS(ArrayList<String> registre) {
        for (int i = 0; i < registre.size(); i++) {
            System.out.println(registre.get(i));
        }
    }

    public static void afficherRegistreI(ArrayList<Integer> registre) {
        for (int i = 0; i < registre.size(); i++) {
            System.out.println(registre.get(i));
        }
    }
    /**
     * Methode generic pour afficher les ArrayList
     * @param <T> collection
     * @param registreo itteration 
     */
    public static <T> void afficheo(ArrayList<T> registreo) {
        for (T tmp : registreo) {
            System.out.println(tmp);
        }
    }
}
