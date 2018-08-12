/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import utils.Utilitaire;

/**
 *
 * @author 1795545
 */
public class GuiSimple extends JFrame{


    private JLabel jLabelF;
    private JLabel jLabelC;
    private JLabel img;
    private JTextField jTextFieldF;
    private JTextField jTextFieldC;    
    private JButton convertir;
    private JButton quitter;
//    private JPanel paneauNorth;
//    private JPanel paneauSouth;    
//    private JPanel paneauWest;
//    private JPanel paneauEast;
//    private JPanel paneauCenter;
//    private JPanel paneauGlobal;
    
    public GuiSimple() {
    }
    
    
    
    
    
    public void run(){
        
    
    JPanel paneauGlobal = new JPanel();
    
    BorderLayout bd = new BorderLayout();
    
    paneauGlobal.setLayout(bd);

    
    convertir = new JButton("Convertir");
    quitter = new JButton("Quitter");
    convertir.addActionListener(new ConvertirListener());
    quitter.addActionListener(new QuitterListener());
    
    JPanel paneauSouth = new JPanel();
    paneauSouth.add(convertir);
    paneauSouth.add(quitter);
    
    paneauGlobal.add(paneauSouth, BorderLayout.SOUTH);
    
    JPanel paneauWest = new JPanel();
    ImageIcon image = new ImageIcon("src/img/wizard.jpg");
    img = new JLabel(image);
    paneauWest.add(img);
    
    paneauGlobal.add(paneauWest, BorderLayout.WEST);
    
    
    
    JPanel paneauCenter = new JPanel(new GridLayout(9,1,1,1));
    JPanel paneauF = new JPanel();    
    JPanel paneauC = new JPanel();
    
    
    paneauCenter.add(paneauF);
    paneauCenter.add(paneauC);
    
    jLabelF = new JLabel("Farenheit:");
    jTextFieldF = new JTextField(8);

    
    paneauF.add(jLabelF);
    paneauF.add(jTextFieldF);
    
    jLabelC = new JLabel("Celcius:   ");
    jTextFieldC = new JTextField(8);
    
    paneauC.add(jLabelC);
    paneauC.add(jTextFieldC);
    
    paneauGlobal.add(paneauCenter, BorderLayout.CENTER);
    
    this.setContentPane(paneauGlobal);

    

    
    }
    
    private class ConvertirListener implements ActionListener{
        
        
        @Override
        public void actionPerformed(ActionEvent e){
            Utilitaire u = new Utilitaire();
            double celcius = u.convertir(Double.parseDouble(jTextFieldF.getText()));
            jTextFieldC.setText(Double.toString(celcius));
        }
    }
    
    
    private class QuitterListener implements ActionListener{
        
        
        @Override
        public void actionPerformed(ActionEvent e){

            dispose();
        }
    }    
    
}
