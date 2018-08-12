/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HAMIDREZA
 */
public interface Observer {
  
    public void update(double ibmPrice, double applePrice, double googlePrice);
}
