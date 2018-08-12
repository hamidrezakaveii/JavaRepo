/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

public class Book {
    private String BookName;
    private String Author;
    private int BookPage;
    
    public void setBookName(String n){
        BookName = n;
    }
    public void setBookAuthor(String a){
        Author = a;
    }
    public void setBookPage(int p){
        BookPage = p;
    }
    public void borrow (){
        System.out.println("Borrow Book of "+BookName+" With Auther of "+Author+" Withe "+BookPage+" Page!!!");
    }
    
    
}
