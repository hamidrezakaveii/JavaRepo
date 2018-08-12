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
public class Gestionnaire extends EmployePermanent {
    
    private Employe [] employeACharge;
    private int nbEmploye=0;
        
    /*
    private ArrayList<Employe> employeAcharge = new ArrayList<Employe>();
    
    public void ajouterEmploye2(Employe e){
        this.employeAcharge.add(e);
    }
    
    public double calculerSalaireMensuel2(){                                 
        double salaireDeBase = super.calculerSalaireMensuel();
        for(Employe e:employeAcharge){
            salaireDeBase += e.calculerSalaireMensuel()*0.01;   //Methode polymorphisme
        }
        return salaireDeBase;
    }
    */
    
    public Gestionnaire(String nom, String prenom){
        super(nom, prenom);
        this.employeACharge = new Employe[10];
    }

    public void ajouterEmploye(Employe e){
        this.employeACharge[nbEmploye]= e;
        nbEmploye ++;
    }
    
    public double calculerSalaireMensuel(){                                 
        double salaireDeBase = super.calculerSalaireMensuel();
        for(int i = 0;i< nbEmploye; i++){
            salaireDeBase += this.employeACharge[i].calculerSalaireMensuel()*0.01;   //Methode polymorphisme
        }
        return salaireDeBase;
    }
    

    @Override
    public String toString(){
       String conversion = "";
        conversion += "Gestionare Avec Nom: "+this.getNom();
        conversion += " Et Prenom: "+this.getPrenom();
        conversion += " Avoir le Salaire mensuele de: "+this.calculerSalaireMensuel();
       return conversion;
    }
}
