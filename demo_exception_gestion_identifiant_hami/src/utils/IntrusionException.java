/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modele.Usager;

/**
 *
 * @author 1795545
 */
public class IntrusionException extends Exception{
    
    private Usager user;
    
    public IntrusionException(){
        
    }
 
    
    public IntrusionException(String m, Usager u){
        super(m);
        this.user = u;
        
    }

    public Usager getUser() {
        return user;
    }
    
    
}
