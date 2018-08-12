/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Timestamp;
import java.util.Date;
import modele.Usager;

/**
 *
 * @author HBenteftifa
 */
public class IntrusionException extends Exception {

    private Usager user;
    private String machine;
    private Timestamp timeStamp;
    
    public IntrusionException() {
    }

    public IntrusionException(Usager user) {
        this.user = user;
    }

    public IntrusionException(Usager user,String machine) {
        this.user = user;
        this.machine = machine;
    }

    public IntrusionException(Usager user, String machine, Timestamp timeStamp) {
        this.user = user;
        this.machine = machine;
        this.timeStamp = timeStamp;
    }
    
    public Usager getUser() {
        return user;
    }

    public void setUser(Usager user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "IntrusionException{" + "user=" + user + "\n" + machine + "\n timeStamp=" + timeStamp + '}';
    }

     

    
    
    
    
}
