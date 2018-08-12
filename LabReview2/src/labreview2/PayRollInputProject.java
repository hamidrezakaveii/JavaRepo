package labreview2;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class PayRollInputProject {
    public static void main (String[] args) throws FileNotFoundException
    {
        Scanner inFile =new Scanner(new FileReader("payroll.in"));
        double Net_Amount;
        double Total_Income;
        double Total_Deduction;
        String[] r_name = new String[2];
        String[] ssn = new String[2];
        int[] number_whr = new int[2];
        double[] h_rate = new double[2];
        final double Prv_Tax = 0.09;
        final double Fed_Tax = 0.07;
        final double QP_Ins = 0.0055;
        final double E_ins =0.014;
        final double Qpp = 0.045;
        final double Union_d = 0.0165;
        PrintWriter outFile = new PrintWriter("payroll.out");
        for (int i = 0 ; i < 2 ; i++){
            r_name[i] = inFile.next();
            ssn[i] = inFile.next();
            number_whr[i] = inFile.nextInt();
            h_rate[i] = inFile.nextDouble();
          Total_Income = (number_whr[i]*h_rate[i]);
          Total_Deduction = ((Total_Income*Fed_Tax)+(Total_Income*Prv_Tax)+
                  (Total_Income*QP_Ins)+(Total_Income*E_ins)+
                  (Total_Income*Qpp)+(Total_Income*Union_d));
          Net_Amount = Total_Income - Total_Deduction;
          JOptionPane.showMessageDialog(null,
                  "-----------------------------------------------------"
                  +String.format("\n|    The total Earning is  %.2f",Total_Income)
                  +String.format("\n||   The Fed_Tax Deduction is %.2f",Total_Income*Fed_Tax)
                  +String.format("\n|    The Prv_Tax Deduction is %.2f",Total_Income*Prv_Tax)
                  +String.format("\n||   The QP_Ins Deduction is %.2f",Total_Income*QP_Ins)
                  +String.format("\n|    The E_ins Deduction is %.2f",Total_Income*E_ins)
                  +String.format("\n||   The Qpp Deduction is %.2f",Total_Income*Qpp)
                  +String.format("\n|    The Union_d Deduction is %.2f",Total_Income*Union_d)
                  +String.format("\n||   The Total Deduction is %.2f",Total_Deduction)
                  +"\n|" 
                  +"\n||"
                  +"\n|" 
                  +String.format("\n||   The Total Net Amount is %.2f",Net_Amount)
                  +"\n---------------------------------------------------"
                  ,"Pay Stub", JOptionPane.CLOSED_OPTION);
          outFile.println("The Record number: "+(i+1)+" for: "+r_name[i]+" who's SSN is "+ssn[i]);
          outFile.println(String.format("\n   The total Earning is  %.2f",Total_Income));
          outFile.println(String.format("\n   The Fed_Tax Deduction is %.2f",Total_Income*Fed_Tax));
          outFile.println(String.format("\n   The Prv_Tax Deduction is %.2f",Total_Income*Prv_Tax));
          outFile.println(String.format("\n   The QP_Ins Deduction is %.2f",Total_Income*QP_Ins));
          outFile.println(String.format("\n   The E_ins Deduction is %.2f",Total_Income*E_ins));
          outFile.println(String.format("\n   The Qpp Deduction is %.2f",Total_Income*Qpp));
          outFile.println(String.format("\n   The Union_d Deduction is %.2f",Total_Income*Union_d));
          outFile.println(String.format("\n   The Total Deduction is %.2f",Total_Deduction));
          outFile.println("\n"); 
          outFile.println("\n");
          outFile.println(String.format("\n   The Total Net Amount is %.2f",Net_Amount));
          outFile.println("\n");
          outFile.println("\n");

        }
        outFile.close();
        inFile.close();
    }
}