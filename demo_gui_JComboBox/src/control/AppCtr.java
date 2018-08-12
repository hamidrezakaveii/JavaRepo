/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author HAMIDREZA
 */
// Fig. 12.22: ComboBoxTest.java
// Testing ComboBoxFrame.
import javax.swing.JFrame;
import vue.ComboBoxFrame;

public class AppCtr {

    public static void main(String[] args) {
        ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
        comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBoxFrame.setSize(350, 350);
        comboBoxFrame.setVisible(true);
    }
} // end class ComboBoxTest
