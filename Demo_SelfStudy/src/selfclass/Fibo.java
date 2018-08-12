
package selfclass;

public class Fibo {
    //int n = 0;
    //int fi = 0;
    
    public static void main(String[] args) {
        int n = 0;
        do{
        System.out.println(fibo(n));
        n++;
        } while (fibo(n) < 1000);
        
    }
    public static int fibo (int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else 
            n = (fibo(n-1))+(fibo(n-2));
            return n;
        
    }
}
