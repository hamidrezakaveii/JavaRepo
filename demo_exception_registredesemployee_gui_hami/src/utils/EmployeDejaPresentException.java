/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modele.Employe;

/**
 *
 * @author 1795545
 */
public class EmployeDejaPresentException extends Exception {
    
    private Employe individu;

    public EmployeDejaPresentException(){

    }

    public EmployeDejaPresentException(String message, Employe individu){
        super(message);
        this.individu = individu;
    }

    public Employe getIndividu() {
        return individu;
    }

    public void setIndividu(Employe individu) {
        this.individu = individu;
    }
    
    
    
    
    
    
    
}
