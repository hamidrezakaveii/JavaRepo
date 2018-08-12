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
public class ArticleComparateur implements Comparator<Article> {

    @Override
    public int compare(Article o1, Article o2) {

        if (0 == o1.getDesc().compareTo(o2.getDesc())) {
            if (o1.getQte() == o2.getQte()) {
                return 0;
            } else if (o1.getQte() > o2.getQte()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return o1.getDesc().compareTo(o2.getDesc());
        }
    }

}
