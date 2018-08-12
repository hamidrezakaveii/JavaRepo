/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author HAMIDREZA
 */
public class Business {
    
    public void throwsException(){
        throw new RuntimeException("I throw exception!");
    }
    
    public double multiply(double a, double b){
        return a*b;
    }
    
}
