/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 1795162
 */
public class Personne implements Serializable{
    private static final long serialVersionUID = 9020156163994630184L;

    
    private String nom ;
    private int age ;
    private double tail;

    public Personne(String nom, int age, double tail) {
        this.nom = nom;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", age=" + age + ", tail=" + tail + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    
    
}
