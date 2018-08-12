/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import utils.Utilitaire;
import static utils.Utilitaire.*;

/**
 *
 * @author 1795545
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> registreS = new ArrayList<>();
        registreS.add("Alain");  //fire Boxing pour ajoutet primitive type to object registre.add(new String("Alain")); 
        registreS.add("Albert");
        registreS.add("Annie");

        ArrayList<Integer> registreI = new ArrayList<>();
        registreI.add(1);
        registreI.add(2);
        registreI.add(3);
        
        //afficher sans methodes
        for (String s : registreS) {
            System.out.println(s);
        }

        for (Integer i : registreI) {
            System.out.println(i);
        }
        
        //afficher avec le methode generic
        afficheo(registreS);
        afficheo(registreI);        

        //afficher avec les methodes 
        afficherRegistreS(registreS);
        afficherRegistreI(registreI);


    }

}
