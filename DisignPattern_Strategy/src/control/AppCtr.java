/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.MountainDuck;
import model.Duck;
import model.FlySlow;
import model.IFlyBehavior;

/**
 *
 * @author HAMIDREZA
 */
public class AppCtr {

    public static void main(String[] args) {

        Duck md = new MountainDuck();

        System.out.println("Mountain Duck: " + md.flyBehavior() + " " + md.quackBehavior());
        
        
        //Set new behavoir
        md.setFb(new FlySlow());
        
        System.out.println("Mountain Duck: " + md.flyBehavior() + " " + md.quackBehavior());

    }
}
