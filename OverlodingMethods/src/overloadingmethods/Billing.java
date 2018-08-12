/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingmethods;

public class Billing {
    
    public static double computeBill (double pr) {
        pr = (pr+(pr*0.08));
        return pr;
    }
    public static double computeBill(double pr, int qty) {
        pr = ((pr*qty)*0.08)+(pr * qty);
        return pr;
    }
    public static double computeBill(double pr, int qty,double cp) {
       pr = (((pr * qty)- cp)*0.08)+((pr * qty)- cp);
        return pr; 
            }
    public static void main (String[] args){
       System.out.printf("One book price is : %.2f\n", computeBill(200.55));
       System.out.printf("Two book price is : %.2f\n",computeBill(200.55,2));
       System.out.printf("Three book price with 50$ coupon is : %.2f\n",computeBill(200.55,2,50.00));
    }
}
