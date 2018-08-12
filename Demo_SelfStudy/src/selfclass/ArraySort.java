
package selfclass;

import java.util.Scanner;
public class ArraySort {
    
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Array Number: ");
        n = in.nextInt();
        int[] array = new int[n];
        for (int i=0; i<array.length; i++){
            System.out.println("Please Enter Array Elements "+(i+1)+":");
            array[i]= in.nextInt();
        }
            
        sort(array);
        for (int k=0; k<array.length; k++)
        System.out.println("Sort Array Element Number "+(k+1)+":"+array[k]);
    }
    static void sort (int[] array){
        int tmp;
        for (int i=0;i<array.length;i++)
            for (int j=i+1;j<array.length;j++)
                if (array[i]<array[j]){
                    tmp =array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
                else
                    continue;
    }
}
