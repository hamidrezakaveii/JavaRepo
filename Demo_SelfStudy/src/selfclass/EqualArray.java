
package selfclass;

import java.util.Arrays;

public class EqualArray {
    
    public static void main(String[] args){
        
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        System.out.println(equal(array1,array2));
    }
    static boolean equal(int[] ar1,int[] ar2){
        if(Arrays.equals(ar1, ar2))
            return true;
        else
            return false;
    }
}
