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
public class Bond extends Case {
    
    public Bond(String position){
        super(position);
    }
    
    @Override
    public double calculation(double v1, double v2){
        return 1;
    }
}
