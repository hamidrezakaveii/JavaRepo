/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modele.Employe;
import modele.ListEmploye;
import utils.EmployeDejaPresentException;
import java.util.Scanner;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author 1795545
 */
public class AppCtr {
    /**
     * @param args the command line arguments
     * @throws utils.EmployeDejaPresentException
     */
    public AppCtr() {
    }
    
    public static void main(String[] args) throws EmployeDejaPresentException {
        
        ListEmploye registre = new ListEmploye();
        Employe emp = new Employe();
        Scanner sc = new Scanner(System.in);
        
        while (true){        
            try{
                   System.out.println("Veuillez entrer le nom: ");
                   String nom = sc.nextLine();
                   emp.setNom(nom);
                   System.out.println("Veillez entrer l'age: ");
                   int age = sc.nextInt();
                   emp.setAge(age);
                   sc.nextLine();
                   if (!registre.verifierDoublen(emp))
                       registre.ajouterEmploye(emp);
                   else
                       throw new EmployeDejaPresentException("Repetetive employe:",emp);


            }catch(EmployeDejaPresentException ex){
                System.err.println(ex.getMessage()+ex.getIndividu().getNom());
                break;
            }
        }
        
//        System.out.println("Bienvenu");
//        // Creer un Empolye
//        ListEmploye registre = new ListEmploye();
//        try{
//            Employe emp1 = new Employe("Fluflu",25);
//            registre.ajouterEmploye(emp1);
//            
//            Employe emp2 = new Employe("Fluflu",25);
//            registre.ajouterEmploye(emp2);
//
//            
//            //Afficher le contenu des registre
//            registre.listerEmploye();
//        }catch(EmployeDejaPresentException e){
//            System.out.println(e);
//        }

        
    }
    
}
