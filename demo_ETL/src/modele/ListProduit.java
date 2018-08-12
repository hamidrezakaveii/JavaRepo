/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author 1795545
 */
public class ListProduit extends ArrayList<Produit> {
    
    public void ajouterProduit(Produit pr){
        this.add(pr);
    }

    public ListProduit afficherProduit(){
        
//        for(Produit pr:this.){
//            System.out.println(pr.);
//        }
    return this;
    }    
    
}
