/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;

public class TestAutomobiles {
    
    public static void main (String[] args){
        
        Automobile myCar=new Automobile(1,"benz","c200","white",2016,15);   //int i,String ma,String mo, String c,int y,int mi
         Automobile Car=new Automobile(10000,"bmw","c200","white",2018,15);
        //System.out.println("my car id is :"+ myCar.getIdnum()+" my make is :"+myCar.getMake()+" my model is :"+myCar.getModel()+
          //      " my color is : "+myCar.getColor()+"my year is :"+myCar.getYear());
         //System.out.println("my car id is :"+ myCar.getIdnum()+" my make is :"+myCar.getMake()+" my model is :"+myCar.getModel()+
           //     " my color is : "+myCar.getColor()+"my year is :"+myCar.getYear());
         
         display(myCar);
         display(Car);
         
    }

    public static void display(Automobile c)
    {
      System.out.println("my car id is :"+ c.getIdnum()+" my make is :"+c.getMake()+" my model is :"+c.getModel()+
                " my color is : "+c.getColor()+"my year is :"+c.getYear());  
    }    
}
