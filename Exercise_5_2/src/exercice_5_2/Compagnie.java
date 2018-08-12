/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_5_2;

import java.util.ArrayList;

/**
 *
 * @author 1795545
 */
public class Compagnie {
    private String nomCompany;
    private Employe[] listEmployes;
    private int nbEmploye=0;
    /*
    private ArrayList<Employe> tabEmployes = new ArrayList<Employe>();  //for adding same objects
   
    public void ajouterEmploye2(Employe e){
        this.tabEmployes.add(e);
    }
    
     public double calculerSalaireDu2(){
         double totalSalaire=0;
         for(Employe e: tabEmployes){
             totalSalaire += e.calculerSalaireMensuel();
        }
        return totalSalaire; 
    }
    */
    
    public Compagnie(){
        listEmployes = new Employe[10];
    }
    
    public String getNomDeCompany() {
        return nomCompany;
    }

    public void setNomDeCompany(String nomDeCompany) {
        this.nomCompany = nomDeCompany;
    }
    

    
    public void ajouterEmploye(Employe e){
            this.listEmployes[nbEmploye]= e;
            nbEmploye++;
    } 
    
    
    public double calculerSalaireDu(){
        double totalSalaire=0;
        for (int i=0; i<nbEmploye; i++){
            totalSalaire += listEmployes[i].calculerSalaireMensuel();    //methode polymorphm
        }
        return totalSalaire; 
    }
    
    
}
