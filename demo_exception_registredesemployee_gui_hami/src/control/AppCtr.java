/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modele.Employe;
import modele.ListEmploye;
import utils.EmployeDejaPresentException;
import java.util.Scanner;
import javax.swing.JFrame;
import jdk.nashorn.internal.ir.ContinueNode;
import vue.GuiIRegistreEmployeeBorder;

/**
 *
 * @author 1795545
 */
public class AppCtr {
    /**
     * @param args the command line arguments
     * @throws utils.EmployeDejaPresentException
     */
    public AppCtr() {
    }
    
    public static void main(String[] args) throws EmployeDejaPresentException {
        
            int  width = 500, height = 300;
            // initialiser frame
                        
            ListEmploye registre = new ListEmploye();

 
            GuiIRegistreEmployeeBorder objGui = new GuiIRegistreEmployeeBorder(registre);

            // Note: on n'utilise pas de thread pour le moment.
            objGui.run();
            // indiquer le titre du frame
            objGui.setTitle("Registre des employes");
            // Donner une taille de la frame pour  affichage
            objGui.setSize(width, height);
            // Afficher la frame et donc le Panel
            objGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            objGui.setLocationRelativeTo(null);
            objGui.setResizable(false);
            objGui.setVisible(true);

        

        
    }
    
}
