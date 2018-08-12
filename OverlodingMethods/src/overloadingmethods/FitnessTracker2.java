/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingmethods;

import java.time.*;
public class FitnessTracker2 {
    private int min;
    private String act;
    private LocalDate date;
    
    public FitnessTracker2() {
        this(0,"running",LocalDate.of(1981, 06, 11) );
    }
    public FitnessTracker2(int m,String a,LocalDate l) {
        min=m;
        act= a;
        date = l;
    }
       
    public int getMin(){
        return min;
    } 
     public String getAct(){
        return act;
    } 
      public LocalDate getTime(){
        return date;
    }
}
