/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingmethods;

import java.time.*;
public class FitnessTracker {
    private int min;
    private String act;
    private LocalDate date;
    
    public FitnessTracker() {
        min=0;
        act= "running";
        date =  LocalDate.of(2016,01,01);
    }
        public FitnessTracker(int m,String a,LocalDate l) {
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
