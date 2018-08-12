
//Input number is power of 2 or not?
package selfclass;
import java.util.Scanner;
public class Power {
    
    public static void main(String[] args){
        int number = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        number = in.nextInt();
        System.out.println("Power of 2 check is:" + power(number));
    }
    
    static boolean power(int number){
    int square = 1; 
        do{
        if (number == square)
            return true;
            square = square*2;
            } while(number >= square);
        
        return false;
    }
}
