/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import modele.Usager;
import utils.*;

/**
 *
 * @author 1795545
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     * @throws utils.IntrusionException
     */
    public static void main(String[] args) throws IntrusionException {
        
        Utilitaire utils = new Utilitaire();
        
        try{
            Usager user = utils.saisirUsager();
            if (utils.validerUsager(user))
                System.out.println("Bienvenue");
//                JOptionPane.showMessageDialog(null, "Bienvenu");
            
            else
                throw new IntrusionException("Mauvaise connection",user);
            //assert (utils.validerUsager(user)):"Mouvaise connection";
                        
        }catch(IntrusionException e){
            System.err.println(e.getMessage()+e.getUser());

//            StackTraceElement[] traceElements = ex.getStackTrace();
//            System.out.println("Class\t\tFile\t\tLine\tMethod");
//            for (StackTraceElement e: traceElements){
//                System.out.printf("%s\t",e.getClassName());
//                System.out.printf("%s\t",e.getFileName());
//                System.out.printf("%s\t",e.getLineNumber());
//                System.out.printf("%s%n",e.getMethodName());
                
//            }
        }

    }
    
}
