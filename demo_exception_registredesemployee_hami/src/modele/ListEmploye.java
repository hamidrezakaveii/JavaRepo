/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import utils.EmployeDejaPresentException;
import java.util.ArrayList;

/**
 *
 * @author 1795545
 */
public class ListEmploye extends ArrayList<Employe> {
    
    
    
    
    
    //ArrayList<Employe> listEmploye = new ArrayList<Employe>();
    
    
    public void ajouterEmploye(Employe e) throws EmployeDejaPresentException{
        
        if(!verifierDoublen(e))
            this.add(e);
        else
            throw new EmployeDejaPresentException("Doublen!",e);
        
    }
    
    /*public boolean verifierDoublen(Employe e) throws EmployeDejaPresentException{
        boolean trouver = true; 
        for (int i = 0; i< listEmploye.size();i++){
            if (e.getNom() == listEmploye.get(i).getNom()){
                //System.out.println(e.getNom());
                //System.out.println(listEmploye.get(i).getNom());
                trouver = false;
                throw new EmployeDejaPresentException("Repetetive employe!",e);
            }
        }
        return trouver;
    }*/
    
    public boolean verifierDoublen(Employe e){
        
        for (Employe tmp: this){
            if (tmp.equals(e))
                return true;
        }
            return false;
    }
    
    public void listerEmploye(){
        for(Employe tmp:this){
            System.out.println(tmp);
        }
        
        //Literateur
    }
    
}
