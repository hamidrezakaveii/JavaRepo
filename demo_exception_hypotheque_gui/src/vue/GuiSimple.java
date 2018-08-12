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
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;
import utils.Utilitaire;

/**
 *
 * @author HAMIDREZA
 */


/**
 *
 * @author 1795545
 */
public class GuiSimple extends JFrame{


    private JLabel jlYears;
    private JLabel jlInterestRate;
    private JLabel jlMortgage;
    private JLabel img;
    private JTextField jtYears;
    private JTextField jtInterestRate;
    private JTextField jtMortgage;
    private JButton calculate;
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
        
    
    JPanel panelGlobal = new JPanel();
    
    BorderLayout bl = new BorderLayout();
    
    panelGlobal.setLayout(bl);

    
    calculate = new JButton("Calculate");
    quitter = new JButton("Quitter");
    calculate.addActionListener(new CalculateMortgageListener());
    quitter.addActionListener(new QuitListener());
    
    JPanel panelSouth = new JPanel();
    panelSouth.add(calculate);
    panelSouth.add(quitter);
    
    panelGlobal.add(panelSouth, BorderLayout.SOUTH);
    
    JPanel panelWest = new JPanel();
    ImageIcon image = new ImageIcon("src/img/wizard.jpg");
    img = new JLabel(image);
    panelWest.add(img);
    
    panelGlobal.add(panelWest, BorderLayout.WEST);
    
    
    
    JPanel panelCenter = new JPanel(new GridLayout(8,1,1,1));
    JPanel panelYear = new JPanel();    
    JPanel panelInterestRate = new JPanel();
    JPanel panelMortgage = new JPanel();
    
    
    panelCenter.add(panelYear);
    panelCenter.add(panelInterestRate);
    panelCenter.add(panelMortgage);
    
    jlYears = new JLabel("Amortissement (ans):                       ");
    jtYears = new JTextField(8);
    panelYear.add(jlYears);
    panelYear.add(jtYears);
    
    jlInterestRate = new JLabel("Taux d'intérêt hypothécaire (%):      ");
    jtInterestRate = new JTextField(8);
    panelInterestRate.add(jlInterestRate);
    panelInterestRate.add(jtInterestRate);
    
    jlMortgage = new JLabel("Montant du prêt hypothécaire (C$):");
    jtMortgage = new JTextField(8);
    panelMortgage.add(jlMortgage);
    panelMortgage.add(jtMortgage);
    
    
    
    panelGlobal.add(panelCenter, BorderLayout.CENTER);
    
    this.setContentPane(panelGlobal);

    

    
    }
    
    private class CalculateMortgageListener implements ActionListener{
        
        
        @Override
        public void actionPerformed(ActionEvent e){
            Utilitaire u = new Utilitaire();

            try{
                if(Integer.parseInt(jtYears.getText()) < 0)
                   throw new IllegalArgumentException("Le nombre d’années ne doit pas être négatif!");
                else
                    u.setNbreAnn(Integer.parseInt(jtYears.getText()));
                
                
                if(Double.parseDouble(jtInterestRate.getText()) < 0 )
                    throw new IllegalArgumentException("Le taux d’intérêt annuel ne doit pas être négatif!");
                else
                    u.setTauxAnnuel(Double.parseDouble(jtInterestRate.getText()));
                
                
                if(Double.parseDouble(jtMortgage.getText())==0)
                    throw new IllegalArgumentException("Le montant emprunté pour l’hypothèque ne doit pas être égal à zéro!");
                else
                    u.setMontantHypot(Double.parseDouble(jtMortgage.getText()));
                
                
                if(u.getNbreAnn()!= -1 && u.getTauxAnnuel() != -1 && u.getMontantHypot() != 0)
                    u.calculerMontant();
                    JOptionPane.showMessageDialog(null, u, "LES INFORMATION SUR L'HYPHOTHEQUE", JOptionPane.INFORMATION_MESSAGE);                


            }catch(IllegalArgumentException | InputMismatchException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Errour", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Veuillez réessayer s'il vous plaît ", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    
    private class QuitListener implements ActionListener{
        
        
        @Override
        public void actionPerformed(ActionEvent e){

            dispose();
        }
    }    
    
}
