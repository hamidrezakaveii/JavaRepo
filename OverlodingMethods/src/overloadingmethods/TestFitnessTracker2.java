/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingmethods;

import java.time.LocalDate;

public class TestFitnessTracker2 {
    public static void main(String[] args){
        FitnessTracker2 f1=new FitnessTracker2();
        FitnessTracker2 f2=new FitnessTracker2(30,"Basketball",LocalDate.of(1981, 06, 11));
        
        System.out.println("default min is : "+ f1.getMin()+" default activity is : "+ f1.getAct()+" default date is : "+ f1.getTime() );
        System.out.println("overload min is : "+ f2.getMin()+" overload activity is : "+ f2.getAct()+" overload date is : "+ f2.getTime() );
    } 
    
}
