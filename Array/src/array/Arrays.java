/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author cstuser
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double[] marks = {80.54,75.12,90.25,95.87};
        //for (double x : marks)  
        //x += 3;
        //System.out.println ("This is value plus 3"+ x);
        for (int i = 0  ; i < marks.length ; i++ )
        {
          System.out.println("value from first to last is:"+ marks[i] );
          
        }
        System.out.println("----------------------------------");
        for (int i = marks.length -1 ; i >= 0 ; i-- )
        {
          System.out.println("value from last to first is:"+ marks[i] );
          
        }
    }
    
}
