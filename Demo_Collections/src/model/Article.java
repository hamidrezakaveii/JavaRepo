/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author 1795545
 */
public class Article{

    private String desc;
    private int qte;
    private double prix;

    public Article(String desc, int qte, double prix) {
        this.desc = desc;
        this.qte = qte;
        this.prix = prix;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" + "desc=" + desc + ", qte=" + qte + ", prix=" + prix + '}';
    }



}
