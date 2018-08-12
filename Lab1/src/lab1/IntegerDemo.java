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
import javax.swing.JOptionPane;
public class IntegerDemo
{
public static void main(String[] args){
int anInt = 12345;
short aByte = 12345;
short aShort = 12345;
long aLong = 12345;
String s = "Salam";
char initial = 'A';
System.out.println("The int is " + anInt);
System.out.println("The byte is " + aByte);
System.out.println("The short is " + aShort);
System.out.println("The long is " + aLong);
JOptionPane.showMessageDialog(null,""+ s);
System.out.println(initial);
System.out.println("\t\"abc\\def\bghi\n\njkl");
}
}