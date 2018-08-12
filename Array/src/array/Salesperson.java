/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;


public class Salesperson {
   private int id;
    private double annualsale;
    
    public Salesperson(){
    id=9999;
    annualsale=0;
    
}
    
    public void SetId(int id){
        this.id=id;
    }
    public void SetAnnualSale(double sale ){
        annualsale = sale;
    }
    public int getID (){
        return id;
    }
    public double getAnnualSale (){
        return annualsale;
    }
    
}
