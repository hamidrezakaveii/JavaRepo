/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;
import modele.Usager;
import javax.swing.JOptionPane;

/**
 *
 * @author 1795545
 */
public class Utilitaire {
    

//    ValiderUsager():Boolean;
    public Usager saisirUsager(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom:");
        String nom = sc.nextLine();
        System.out.println("Entrer le mot de pass:");
        String motDePass = sc.nextLine();
        sc.close();
//         String nom = JOptionPane.showInputDialog("Enter le nom: ");
//         String motDePass = JOptionPane.showInputDialog("Entrer le mot de pass: ");
         
        return (new Usager(nom,motDePass));
    }
    
    public boolean validerUsager(Usager u){
        
        //Usager userAdmin = new Usager("flouflou","admin1234");
        if (u.equals(new Usager("flouflou","admin1234")))
            return true;
        else
            return false;
        
    }

    
    
}
