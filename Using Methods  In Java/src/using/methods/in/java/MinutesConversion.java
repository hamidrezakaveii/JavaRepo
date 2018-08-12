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
public class MinutesConversion {
       public static void main (String[]args){
        Scanner keyBoard=new Scanner(System.in);
    int minutes;
    int hour;
    double day;
    System.out.println("Number of minutes:");
    minutes=keyBoard.nextInt();
    if (minutes >= 60){
    hour = minutes / 60;
    }
    else {
        hour = 0;
            }
            
    day = minutes / 1440.0;   
    System.out.println(minutes+" minutes equals : "+hour+" hours and equals "+ day +" days.");
    
    }
    
} 

