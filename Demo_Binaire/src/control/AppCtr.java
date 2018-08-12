/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Lists;
import vue.Fen1;

/**
 *
 * @author 1795162
 */
public class AppCtr {
    
    public static void main(String[] args) {
        
        Lists ls = new Lists();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fen1(ls).setVisible(true);
            }
        });
    }
        
    }
    
    
    
    
    
    
    

