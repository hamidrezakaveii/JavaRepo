/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.StockGrabber;
import model.StockObserver;

/**
 *
 * @author HAMIDREZA
 */
public class AppCtr {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockobserver1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(124.32);
        stockGrabber.setApplePrice(764.65);
        stockGrabber.setGooglePrice(965.46);

        StockObserver stockobserver2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(125.33);
        stockGrabber.setApplePrice(765.66);
        stockGrabber.setGooglePrice(966.47);

    }
}
