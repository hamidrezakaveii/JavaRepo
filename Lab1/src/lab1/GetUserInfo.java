/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author cstuser
 */
import java.util.Scanner;
public class GetUserInfo {
    public static void main(String[]args)
    {
    String name;
    int age;
    Scanner inputDevice = new Scanner(System.in) ;
    System.out.print("Please enter your name>>");
    name = inputDevice.nextLine();
    System.out.print("Please enter your age>>");
    age = inputDevice.nextInt();
    System.out.println("Your name is " + name + " and you are " + age + " years old.");
       }
    
}
