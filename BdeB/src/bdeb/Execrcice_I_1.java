/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdeb;

import java.util.Scanner;

/**
 *
 * @author 1795545
 */
public class Execrcice_I_1 {

    /**
     * @param args the command line arguments
     */
    
    public double calculation(double v1, double v2){
        return (v1/v2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Execrcice_I_1 e1 = new Execrcice_I_1();
        double largeur,langeur;
        double superficie;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veullez entre largeur");
        langeur = sc.nextInt();
        System.out.println("Veullez saisie langeur");
        langeur = sc.nextInt();
        superficie = langeur*langeur;
        System.out.println("superficie est:"+superficie);
        
        System.out.println(e1.calculation(12, 6));
    }
    
}
