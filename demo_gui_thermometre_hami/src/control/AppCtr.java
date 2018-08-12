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
 * @author 1795545
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int WIDTH =500, HIGHT =300;
        
        GuiSimple objGui = new GuiSimple();
        objGui.setSize(WIDTH, HIGHT);
        
        objGui.run();
        

        objGui.setVisible(true);
        objGui.setLocationRelativeTo(null);
        objGui.setTitle("Convertisseur");
        objGui.setResizable(false);
        objGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
