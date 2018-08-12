
package labreview2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;
public class ConversionInputProject {
    public static void main (String[] args) throws FileNotFoundException
    {
        Scanner inFile =new Scanner(new FileReader("Conversion.in"));
        double[] Can_Cur =new double[4];
        double Amr_Cur ; 
        PrintWriter outFile = new PrintWriter("Conversion.out");
        for (int i =0 ; i<4 ; i++){
          Can_Cur[i]= inFile.nextDouble();
          Amr_Cur = Can_Cur[i] * 1.10;
          JOptionPane.showMessageDialog(null,"The corresponding amount in American currency (by default) is:$USD "+Amr_Cur
                  +String.format("\nThe corresponding amount in American currency (two decimals) is:$USD%.2f ", Amr_Cur)
                  +"\nWe are here to assist you to conduct business effectively in North America! "
                  ,"The Currency Conversion", JOptionPane.INFORMATION_MESSAGE);
          outFile.println("The corresponding amount in American currency (by default) is:$USD "+Amr_Cur);
          outFile.printf("The corresponding amount in American currency (two decimals) is:$USD %.2f",Amr_Cur);
          outFile.println();
          outFile.println();

        }
        outFile.println("We are here to assist you to conduct business effectively in North America!");
        outFile.close();
        inFile.close();
    }
}
