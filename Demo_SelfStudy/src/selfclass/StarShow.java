
//Triangle with asterisks in java?
package selfclass;

import java.util.Scanner;
 public class StarShow {
public static void main( String[] args ) {

 Scanner in=new Scanner(System.in);
 System.out.println("Enter your number : ");
 int number = in.nextInt();
 star(number);

}
  
    
    static void star(int number){
        for (int i= 1; i <= number ; i++){
              for (int j=1; j <= i; j++){
              System.out.print("*");
            }
           System.out.println();
           i++;
        }
        for (int i= number ; i>1 ; i-- ){
            for (int j=i-1; j > 1; j--){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
            
    }
}

