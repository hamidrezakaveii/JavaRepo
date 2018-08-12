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
public class ChiliToGo {
        public static void main (String[]args){
        Scanner keyBoard=new Scanner(System.in);
    int adult;
    int child;
    int adultprice;
    int childprice;
    int total;
    System.out.println("Enter number of adults:");
    adult=keyBoard.nextInt();
    System.out.println("Enter number of childs:");
    child=keyBoard.nextInt();
    adultprice = adult * 7;
    childprice = child * 4;
    total = adultprice + childprice;
    System.out.println("You entred "+adult+"as adult and "+child+"as child. You must pay "+adultprice+"for adults and "+childprice+"for childs and total is: " +total);
    
        } 
    }
