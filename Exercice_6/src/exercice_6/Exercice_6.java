/*
Interfaces:
1. Pour regrouper les class 
2. Pour implments le smethodes
- Ne peut pas avoir de atributes.
- Peut seulment de avoir des methodes abstraites.
- Est un type.
- Est un contrat que doit etre réaliser chaque classe qui l'implemente.
 */
package exercice_6;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author 1795545
 */
public class Exercice_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Vehicule> vehiculeElectrique = new ArrayList<Vehicule>();
        HashSet<Vehicule> vehicules = new HashSet<Vehicule>();

        Voiture v1 = new Voiture("Toyota", "Yaris", 5);
        Voiture v2 = new Voiture("Honda", "Accord", 5);
        SUV suv1 = new SUV("Acura", "MDX", 5, true);
        Camion camion1 = new Camion("Dodge", "RAM", 2000);
        Camion camion2 = new Camion("Ford", "F-150", 3000);
        
        vehicules.add(v1);
        vehicules.add(v2);        
        vehicules.add(suv1);            
        vehicules.add(camion1);    
        vehicules.add(camion2);
        vehicules.add(v1);   // Dans HashSet n'ajoute pas v1 deux fois parce que dans HashSet on ne peux poas avoir de doublons.        
        
        //1.Premier facon de montrer 
        System.out.println(v1.getMarque()+" "+v1.getModele()+" "+ v1.getNbPlaces()+" Places");
        System.out.println(v2.getMarque()+" "+v2.getModele()+" "+ v2.getNbPlaces()+" Places");
        System.out.println("****************************************************************");
        
        //2.dousieme facon de montrer 
        System.out.println(v1); // ou System.out.println(v1.toString());
        System.out.println(v2);
        System.out.println(suv1);
        System.out.println("****************************************************************");
        
        //3.Troisieme facon de montrer
        for(Vehicule v: vehicules){
            System.out.println(v);
        }
        System.out.println("****************************************************************");
        
        VoitureElectrique vElectric = new VoitureElectrique("Tesla", "T-2017", 5);
        vehicules.add(vElectric);
        
        for (Vehicule v: vehicules){
            if (v instanceof VoitureElectrique){
                vehiculeElectrique.add(v);
            }
        }
        
        for(Vehicule v: vehiculeElectrique){
            System.out.println(v);
        }
    }
    
}
