/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;
import java.util.Scanner;
public class TestApartment {

    public static void main(String[] args){
    int bedroom;
    int bathroom;
    int rent;
        Apartment myApp1=new Apartment(111,1,1,100);    //(int a,int ben,int ban,int r )
        Apartment myApp2=new Apartment(222,1,2,200);
        Apartment myApp3=new Apartment(333,3,3,300);
        Apartment myApp4=new Apartment(444,4,4,400);
        Apartment myApp5=new Apartment(555,5,5,500);
        Scanner keyBoard=new Scanner(System.in);
        System.out.println("Minimum bedroom : " );
        bedroom=keyBoard.nextInt();
        System.out.println("Minimum bath : " );
        bathroom=keyBoard.nextInt();
        System.out.println("Maximum rent : " );
        rent=keyBoard.nextInt();
        
        checkApartment(myApp1, bedroom,bathroom, rent);
        checkApartment(myApp2, bedroom,bathroom, rent);
        checkApartment(myApp3, bedroom,bathroom, rent);
        checkApartment(myApp4, bedroom,bathroom, rent);
        checkApartment(myApp5, bedroom,bathroom, rent);  
    }
    
    private static void checkApartment(Apartment app,int minRoom, int minBath, double rent){
        if((app.getBedNo() >= minRoom) && (app.getBathNo() >= minBath) && (app.getRent()<= rent)){
              System.out.println(" App number is :"+ app.getAppNum()+"  Bed number is :"+app.getBedNo()+
                      "  Bath number is:"+app.getBathNo()+" Rent is : "+app.getRent());}
              else 
        System.out.println("no case!");
        
        
    }
}
