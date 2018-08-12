/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author HAMIDREZA
 */
public class MyMath {
    private static final MyMath instance = new MyMath();
    
    public static MyMath getInstance(){
        return instance;
    }
    
    public int division(int a, int b){
        if(b==0){
            throw new ArithmeticException("Divisin by zero.");
        }
        return a/b;
    }
    
    public int multiply(int a, int b){
        return a*b;
    }
}
