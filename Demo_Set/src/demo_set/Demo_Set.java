/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import model.Article;
import model.ArticleComparateur;

/**
 *
 * @author 1795545
 */
public class Demo_Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creer object HashSet
        //Set<String> monSet = LinkedHashSet(10, 0.5f);
        HashSet hs = new HashSet(5, 0.5f);
        System.out.println(hs.add("un"));
        System.out.println(hs.add("deux"));
        System.out.println(hs.add("trois"));
        System.out.println(hs.add("quatre"));
        //afficher la listeLinkedHashSet
        System.out.println(hs);
        //Ajouter un object deja existannt
        Boolean b = hs.add("un");
        System.out.println("Peut on ajouter un double? " + b);
        System.out.println(hs);

        //Creer un Treeset
        TreeSet ts = new TreeSet();
        System.out.println(ts.add("un"));
        System.out.println(ts.add("deux"));
        System.out.println(ts.add("trois"));
        System.out.println(ts.add("quatre"));

        //Afficher le TreeSet
        System.out.println(ts);

        //Ajouter un double
        Boolean t = ts.add("deux");
        System.out.println("Peut on ajouter un double? " + t);
        System.out.println(ts);

        //****************************************************
        //Creer HashSet pour stocker les objects produit
        HashSet hsp = new HashSet();
        //Creer les objects produit et add dans le HashSet
        hsp.add(new Article("p1", 10, 25));
        hsp.add(new Article("p2", 11, 26));
        hsp.add(new Article("p3", 12, 27));
        //Aficher HashSet
        System.out.println("HashSet: "+hsp);

        //Creer HashSet pour stocker les objects produit
        TreeSet<Article> tsp = new TreeSet<Article>(new ArticleComparateur());
        //Creer les objects produit et add dans le HashSet
        tsp.add(new Article("p1", 10, 25));
        tsp.add(new Article("p1", 5, 25));
        tsp.add(new Article("p2", 11, 26));
        tsp.add(new Article("p3", 12, 27));
        //Aficher HashSet
        System.out.println("TreeSet: "+tsp);

    }
}
