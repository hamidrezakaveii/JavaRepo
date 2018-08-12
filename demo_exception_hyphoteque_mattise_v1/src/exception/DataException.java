/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import modele.Hypoteque;

/**
 *
 * @author 1795545
 */
public class DataException extends Exception{
    
    private Hypoteque hypoteque;

    public DataException(Hypoteque hypoteque, String message) {
        super(message);
        this.hypoteque = hypoteque;
    }

    
    public Hypoteque getHypoteque() {
        return hypoteque;
    }

    public void setHypoteque(Hypoteque hypoteque) {
        this.hypoteque = hypoteque;
    }


    
}
