/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author cstuser
 */
import java.util.Scanner;
public class TestBook {
    
    public static void main (String [] args){
        String b2;
        Scanner keyboard=new Scanner(System.in);
        Book[] books=new Book[3];
        books[0]=new Book();
        books[1]=new Book();
        books[2]=new Book();
        books[0].setPages(10);
        System.out.println("Enter the name of book 2!");
        b2 = keyboard.nextLine();
        books[1].setPages(20);
        books[2].setPages(30);
        books[0].setTitle("book1");
        books[1].setTitle(b2);
        books[2].setTitle("book3");
        
        System.out.println("the title of book 2 is :"+ books[1].getTitle());
      
          
    }
}
