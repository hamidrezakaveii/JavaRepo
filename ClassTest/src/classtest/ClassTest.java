/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

public class ClassTest {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setBookName("Boostan");
        b1.setBookAuthor("Saadi");
        b1.setBookPage(500);
        b1.borrow();
        System.out.println(b1);
        Book b2;
        b2 = b1;
        System.out.println(b2);


    }

}
