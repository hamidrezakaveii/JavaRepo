/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudeplateau;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HAMIDREZA
 */
public class Plateau {
      
   ArrayList<Case> cases = new ArrayList<>();

    
    public Plateau(){
        cases.add(new Debut("A1"));
        cases.add(new Multiplication("B1"));
        cases.add(new Addition("C1"));
        cases.add(new Division("D1"));
        cases.add(new Soustraction("E1"));
        cases.add(new Multiplication("F1"));
        cases.add(new Division("G1"));
        cases.add(new Bond("H1"));
        cases.add(new Addition("I1"));
        cases.add(new Division("J1"));
        cases.add(new Multiplication("J2"));
        cases.add(new Division("J3"));
        cases.add(new Soustraction("J4"));
        cases.add(new Addition("J5"));
        cases.add(new Bond("J6"));
        cases.add(new Soustraction("J7"));
        cases.add(new Division("J8"));
        cases.add(new Multiplication("J9"));
        cases.add(new Bond("J10"));
        cases.add(new Addition("I10"));
        cases.add(new Bond("H10"));
        cases.add(new Multiplication("G10"));
        cases.add(new Soustraction("F10"));
        cases.add(new Division("E10"));
        cases.add(new Soustraction("D10"));
        cases.add(new Bond("C10"));
        cases.add(new Division("B10"));
        cases.add(new Multiplication("A10"));
        cases.add(new Multiplication("A9"));
        cases.add(new Division("A8"));
        cases.add(new Multiplication("A7"));
        cases.add(new Division("A6"));
        cases.add(new Bond("A5"));
        cases.add(new Addition("A4"));
        cases.add(new Division("A3"));
        cases.add(new Fin("A2"));

    }
    
    private int randomNumber(){
       Random rand = new Random();
       int number = rand.nextInt(1001);
       return number;
    }
    
    private int jumpNumber(){
    long v1,v2,jpNum;
    Scanner sc = new Scanner(System.in);
    v1 = System.currentTimeMillis();
    System.out.print("###Please press the Enter key to play the Dice###");
    sc.nextLine();
    v2 = System.currentTimeMillis();
    jpNum = (v2-v1)%6 +1;
    return ((int)jpNum);
    }
    
    private int findPosition(String p){
        int position =0;
        for(int i=0; i<cases.size();i++){
            if (p == cases.get(i).getPosition()){
                position = i;
            }
        }
        return position;
    }
    
    public boolean playGame(Joueur joueurX, Joueur joueurY){
        
        Scanner sc = new Scanner(System.in);
        boolean turn = true;
        boolean winner = false;

        String currentPositionX = joueurX.getPosition().getPosition();
        int positionX = this.findPosition(currentPositionX);
        String currentPositionY = joueurY.getPosition().getPosition();
        int positionY = this.findPosition(currentPositionY);
        
        while(turn){
            
            int value1 = this.randomNumber();
            int value2 = this.randomNumber();
       
            System.out.println((char)27 +"[34m*** Player name: "+joueurX.getNom()+
                    " current position is: "+joueurX.getPosition().getPosition()+" ***");
            
            int newPosition = positionX + this.jumpNumber();

            
            System.out.println("The Dice number is: " + (newPosition - positionX));
            if (newPosition == positionY){
                System.out.println("*** The position of the Dice number was belonged "
                        + "by another player you need to go next square ***");
                newPosition = newPosition+1;
            }
                        
            if(newPosition >= (cases.size()-1)){
                System.out.println((char)27 + "[32mPlayer name: "+joueurX.getNom()+" win the game!!!");
                winner = true;
                turn = false;
            }
            else{    
                switch (newPosition) {
                    case 7:
                        System.out.println("*** You jumped to position H1, you have to jump 2 square to position J1 ***");
                        positionX = newPosition + 2;
                        joueurX.setPosition(cases.get(positionX));
                        turn = false;
                        break;
                    case 14:
                        System.out.println("*** You jumped to position J6, you have to jump 3 square to position J9 ***");
                        positionX = newPosition + 3;
                        joueurX.setPosition(cases.get(positionX));
                        turn = false;
                        break;
                    case 18:
                        System.out.println("*** You jumped to position J10, you have to jump 1 square to position I10 ***");
                        positionX = newPosition + 1;
                        joueurX.setPosition(cases.get(positionX));
                        turn = false;
                        break;
                    case 20:
                        System.out.println("*** You jumped to position H10, you have to jump 3 square to position E10 ***");
                        positionX = newPosition + 3;
                        joueurX.setPosition(cases.get(positionX));
                        turn = false;
                        break;
                    case 25:
                        System.out.println("*** You jumped to position C10, you have to  jump 2 square to position A10 ***");
                        positionX = newPosition + 2;
                        joueurX.setPosition(cases.get(positionX));
                        turn = false;
                        break;
                    case 32:
                        System.out.println("*** You jumped to position A5, you have to jump 3 square to position Fin ***");
                        System.out.println((char)27 + "[32mPlayer name: "+joueurX.getNom()+" win the game!");
                        positionX = newPosition + 3;
                        joueurX.setPosition(cases.get(positionX));
                        winner = true;
                        turn = false;
                        break;
                    default:
                        System.out.println(cases.get(newPosition).toString()+
                                "for position "+cases.get(newPosition).getPosition()
                                +"\nValue 1: "+value1+"\nValue 2: "+value2);
                        int result = sc.nextInt();
                        if (result == cases.get(newPosition).calculation(value1, value2)){
                            joueurX.setPosition(cases.get(newPosition));
                            positionX = newPosition;
                        }
                        else{
                            System.out.println((char)27 + "[31mYour answer is wrong! "
                                    + "You have to stay in your current position.");
                            turn = false;
                        }
                }
            }    
        }
        return winner;
    }
     
    
}
