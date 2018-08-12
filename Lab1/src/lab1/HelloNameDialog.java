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
public class HelloNameDialog 
{
public static void main (String[] args){
    String result;
    result = JOptionPane.showInputDialog (null,"what is your name? ");
    JOptionPane.showMessageDialog(null, "Hello,"+result+"!");
}   
}
