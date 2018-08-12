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
public class Division extends Case {
    
    
    public Division(String position){
        super(position);
    }
    
    @Override
    public double calculation(double v1, double v2){
        return ((int)(v1/v2));
    }
    
    @Override
    public String toString(){
        String conversion="";
        conversion += "Calculate Division of Value 1 and Value 2 ";
        return conversion;
    }
}
