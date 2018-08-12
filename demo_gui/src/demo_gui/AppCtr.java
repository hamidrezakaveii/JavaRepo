/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_gui;

/**
 *
 * @author 1795545
 */
public class AppCtr {

    public AppCtr() {
    }

    
    public static void main(String[] args) {
        
        int WIDTH = 300, HEIGHT = 160;
        
        GuiSimple objGui = new GuiSimple();
        
        objGui.run();
        
        objGui.setSize(WIDTH, HEIGHT);
        
        objGui.setVisible(true);
        
    }
    
}
