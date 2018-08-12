/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Duck;
import model.FlyRapid;
import model.IFlyBehavior;
import model.IQuackBehavior;
import model.QuackLong;

/**
 *
 * @author HAMIDREZA
 */
public class MountainDuck extends Duck {

    
    public MountainDuck() {
        this.setFb(new FlyRapid());
        this.setQb(new QuackLong());
        
    }

}
