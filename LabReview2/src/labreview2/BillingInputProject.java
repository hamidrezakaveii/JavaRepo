package labreview2;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class BillingInputProject {
    public static void main (String[] args) throws FileNotFoundException
    {
        Scanner inFile =new Scanner(new FileReader("Billing.in"));
        double Total;
        double[] Prd_Price = new double[3];
        double[] Prd_Qty = new double[3];
        double[] Prv_tax = new double[3];
        double[] Fed_Tax = new double[3]; 
        PrintWriter outFile = new PrintWriter("Billing.out");
        for (int i =0 ; i<3 ; i++){
            Prd_Price[i] = inFile.nextDouble();
            Prd_Qty[i] = inFile.nextDouble();
            Prv_tax[i] = inFile.nextDouble();
            Fed_Tax[i] = inFile.nextDouble();
          Total = (Prd_Price[i]*Prd_Qty[i])+(Prd_Price[i]* Prd_Qty[i])*Prv_tax[i]+(Prd_Price[i]*Prd_Qty[i])*Fed_Tax[i];
          JOptionPane.showMessageDialog(null,"Your total bill (display by default) is:$ "+Total
                  +String.format("\nYour total bill (Display specifying two decimal places) is:$%.2f ", Total)
                  +"\nThank you for doing business with us. ","The Billing System", JOptionPane.INFORMATION_MESSAGE);
          outFile.println("Your total bill (display by default) is: "+Total);
          outFile.printf("Your total bill (Display specifying two decimal places) is:%.2f",Total);
          outFile.println();
          outFile.println();

        }
        outFile.println("Thank you for doing business with us.");
        outFile.close();
        inFile.close();
    }
}