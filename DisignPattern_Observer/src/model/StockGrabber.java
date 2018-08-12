/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HAMIDREZA
 */
public class StockGrabber implements Subject {
    
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        this.notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        this.notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        this.notifyObserver();
    }
    
    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }
    
    @Override
    public void register(Observer newObserver) {
        
        observers.add(newObserver);
        
    }

    @Override
    public void unRegistre(Observer deleteObserver) {
        
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer "+(observerIndex+1)+" deleted!");
        
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
         for(Observer o: observers){
             o.update(ibmPrice, applePrice, googlePrice);
         }
    }
    
}
