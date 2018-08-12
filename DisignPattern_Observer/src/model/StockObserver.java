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
public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;
    
    private static int observerIDTracker;
    private int observerID;
    
    private Subject stockGrabber;
    
    
    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        
        this.observerID = ++observerIDTracker;
        
        System.out.println("New Observer "+ this.observerID+" added successfully!");
        
        stockGrabber.register(this);
        
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        
        printThePrices();
    }

    private void printThePrices() {
        System.out.println("Observer ID: "+observerID+"\nIBM price: "+ibmPrice+
                "\nApple Price: "+applePrice+"\nGoogle Price: "+googlePrice);
    }
    
}
