/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfclass;

public class HeapStackGames {
    
  //1.Heap Overflow  
    public static void main(String args[]){
        int[] array = new int[Integer.MAX_VALUE];
        for (int i=0; i<array.length; i++){
            array[i]= i;
        }
            System.out.println(array[20]);
        }
  //2.Stack Overflow 
  /*public static void main(String args[]){
      int i = 0;
    System.out.println(f(i));
    }
    
    public static double f(int i){
        if (i<30_000)
            return f(i+1);
        else
            return 100;
    }
    */

}
