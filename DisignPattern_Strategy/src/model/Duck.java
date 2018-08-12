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
public abstract class Duck {
    
    private IFlyBehavior fb;
    private IQuackBehavior qb;
    
    public Duck() {

    }

    public void setFb(IFlyBehavior fb) {
        this.fb = fb;
    }

    public void setQb(IQuackBehavior qb) {
        this.qb = qb;
    }
    
    
    
    
    public String flyBehavior(){
        return fb.fly();
    }
    
    public String quackBehavior(){
        return qb.quack();
    }
    
    
}
