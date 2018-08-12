
package labreview2;

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