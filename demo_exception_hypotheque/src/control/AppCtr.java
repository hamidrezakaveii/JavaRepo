/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.InputMismatchException;
import utils.Utilitaire;


/**
 *
 * @author HAMIDREZA
 */
public class AppCtr {


    
    public static void main(String[] args) {
        
        boolean loop;
        Utilitaire u = new Utilitaire();
        
        loop = true;
        while(loop){
            try{
                loop = u.setNombreDeAnnee();
            }catch(IllegalArgumentException | InputMismatchException e){
                System.err.println(e.getMessage());
            }
        }
        
        
        loop = true;
        while(loop){
            try{
                loop = u.setTauxInteretAnnuel();
            }catch(IllegalArgumentException | InputMismatchException e){
                System.err.println(e.getMessage());
            }
        }
        
        
        loop = true;
        while(loop){
            try{
                loop = u.setMontantHypotheque();
            }catch(IllegalArgumentException | InputMismatchException e){
                System.err.println(e.getMessage());
            }
        }
        
        u.calculerMontant();
        System.out.println(u);
        
  
        
        
        
        
        
    }

}

