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
public interface Subject {
    
    
    public void register(Observer o);
    public void unRegistre(Observer o);
    public void notifyObserver();
    
}
