/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author 1795545
 */
public class GuiSimple extends JFrame {
    
//    private int WIDTH = 300, HEIGHT = 160;
    private int click;
    private JLabel label;
    private JButton push;
    private JButton raz;

    public GuiSimple(){
        
    }
    
    
    
    public void run(){
        
        click = 0;
        
        JPanel fenetreContenu = new JPanel();
        
        FlowLayout fMgr = new FlowLayout();
        fenetreContenu.setLayout(fMgr);
        
        push = new JButton("Cliquer ici pour incrementer!!!");
        raz = new JButton("Remettre sur 0");
        
        push.addActionListener (new BoutonListener());
        raz.addActionListener(new RazListener() );
        
        
        label = new JLabel ("Initial: "+Integer.toString(click));
        
        
        fenetreContenu.add(push);
        fenetreContenu.add(label);
        fenetreContenu.add(raz);
        
        
        //JFrame frameContenu = new JFrame("Fenetre basique");
        this.setContentPane(fenetreContenu);
        
//        this.setSize(WIDTH, HEIGHT);
//        
//        this.setVisible(true);
    }
    
    
    
    private class BoutonListener implements ActionListener{
        
        @Override
        public void actionPerformed (ActionEvent event){
            click++;
            label.setText("Nombre de fois: "+Integer.toString(click));
        }
    }
    
    
    private class RazListener implements ActionListener{
        
        @Override
        public void actionPerformed (ActionEvent event){
            click = 0;
            label.setText("Reinitialise: "+Integer.toString(click));
        }
    }
    
}
