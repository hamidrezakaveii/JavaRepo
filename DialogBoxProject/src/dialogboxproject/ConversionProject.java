
package dialogboxproject;

import java.util.*;
import javax.swing.JOptionPane;
public class ConversionProject {
   static Scanner console = new Scanner (System.in); 
   public static void main (String[] args)
   {
   double Can_Cur;      //This is a Decimal declaration
   double Amr_Cur;
   String Can_Cur1;     //This is s String declaration
   String str;
   String guess = "y"; 
   while (guess == "y"){
   str = "The Currency Conversion";
   JOptionPane.showMessageDialog(null, str, "Input", JOptionPane.INFORMATION_MESSAGE);
   Can_Cur1 = JOptionPane.showInputDialog("Enter your Amount in Canadian Currency: $CAN and press OK");
   Can_Cur = Double.parseDouble (Can_Cur1);
   Amr_Cur = Can_Cur * 1.10;
   JOptionPane.showMessageDialog(null, "The Corresponding Amount in US Currency (By default) is"+Amr_Cur+"$US\nWe Always be Here to Help you Do Your Business Effectively in North America!", "US Conversion", JOptionPane.NO_OPTION);
   guess = JOptionPane.showInputDialog("Do you want to enter new value y/n? and press OK");
   }
   }
}