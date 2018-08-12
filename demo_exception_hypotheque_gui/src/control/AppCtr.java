/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import javax.swing.JFrame;
import vue.GuiSimple;


/**
 *
 * @author HAMIDREZA
 */
public class AppCtr {


    
    public static void main(String[] args) {

       int WIDTH =500, HIGHT =300;
        
        GuiSimple objGui = new GuiSimple();
        objGui.setSize(WIDTH, HIGHT);
        
        objGui.run();
        

        objGui.setVisible(true);
        objGui.setLocationRelativeTo(null);
        objGui.setTitle("Calculateur des paiements hypothécaires");
        objGui.setResizable(false);
        objGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        
    }

}

