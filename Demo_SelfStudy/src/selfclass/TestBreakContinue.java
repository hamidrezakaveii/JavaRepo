/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfclass;


public class TestBreakContinue {
    public static void main(String[] args){

        outer: for (int i = 0; i < 10; i++)
        inner: for (int j = 0; j < 10; j++){
            if ( j== 9)
                break outer;
            else{
                System.out.println("i= "+i);
                System.out.println("j= "+j);
                continue inner;
            }
        }
    }

}
