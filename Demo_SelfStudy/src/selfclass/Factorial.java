package selfclass;

//Factorial of your number? 
import java.util.Scanner;
public class Factorial {
    static long fac = 1L;
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = in.nextInt();
        System.out.println("Factorial of your number is : " + factor(number));
    }
    
    static long factor (int number){
        
        if (number == 1)
            return 1;
        else
        do {
            fac = number * (factor(number-1));
            number --;
           }while (number < 1); 
        
        return fac;
        
    }
    
}
