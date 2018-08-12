/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.methods.in.java;
/**
 *
 * @author cstuser
 */
import java.util.Scanner;
public class Voting
{  public static void main(String[] args)
    {  Scanner keyBoard=new Scanner(System.in);
    int age;
    System.out.println("Enter your age:");
    age=keyBoard.nextInt();
    //age = determine(age);
    System.out.println(determine(age));
    }    
    public static String determine(int age)
    { final int CUTTOF = 18;
    String message;
    if (age>=CUTTOF) message="Eligible to vote";
    else             message="Not yet eligible to vote";
    
    age=100;
    System.out.println("Year in determine is" + age);
    return message;
      } 
  }    

