/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudeplateau;

/**
 *
 * @author HAMIDREZA
 */
public  abstract class Case {
    
    private String position;
    
    public Case(String position){
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public abstract double calculation(double v1, double v2);
    
}
