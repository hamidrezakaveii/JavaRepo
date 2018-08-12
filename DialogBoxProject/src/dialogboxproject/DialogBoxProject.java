/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogboxproject;

import java.util.*;
import javax.swing.JOptionPane;
public class DialogBoxProject {
   static Scanner console = new Scanner (System.in); 
   public static void main (String[] args)
   {
   String str;
   str = "The Currency Conversion";  //This is string assignment
   JOptionPane.showMessageDialog(null, str, "My First Dialogue Box", JOptionPane.INFORMATION_MESSAGE);
   }
}