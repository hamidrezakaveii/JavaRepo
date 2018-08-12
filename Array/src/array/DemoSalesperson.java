/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

public class DemoSalesperson {

public static void main (String[] args){
Salesperson[] mysale=new Salesperson[10];
for (int i=0; i < mysale.length;i++)    
{
    mysale[i]= new Salesperson();
    //double x=5000*i;
    mysale[i].SetAnnualSale(25000+5000*i);
    mysale[i].SetId(111+i);
    
   System.out.println("the id is "+mysale[i].getID()+"the annual sale is "+mysale[i].getAnnualSale());
}
}
    }

