/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.methods.in.java;

/**
 *
 * @author cstuser
 */
import java.util.Scanner;
public class ChiliToGoProfit {
     public static void main (String[]args){
        Scanner keyBoard=new Scanner(System.in);
    int adult;
    int child;
    double adultprofit;
    double childprofit;
    double total;
    System.out.println("Enter number of adults:");
    adult=keyBoard.nextInt();
    System.out.println("Enter number of childs:");
    child=keyBoard.nextInt();
    adultprofit = adult * 4.35;
    childprofit = child * 3.10;
    total = adultprofit + childprofit;
    System.out.println("You entred "+adult+" and "+child+" Your adult profit is: "+adultprofit+"and your child profit is : "+childprofit+" and total is: " +total);
    
        } 
    }
