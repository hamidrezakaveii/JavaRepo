/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.Serializable;

/**
 *
 * @author 1795545
 */
public class Etud implements Serializable{
    private String nom ;
    private int id ;
    private double age;

    @Override
    public String toString() {
        return "Etud{" + "nom=" + nom + ", id=" + id + ", age=" + age + '}';
    }

    public Etud(String nom, int id, double age) {
        this.nom = nom;
        this.id = id;
        this.age = age;
    }
    
    
}
