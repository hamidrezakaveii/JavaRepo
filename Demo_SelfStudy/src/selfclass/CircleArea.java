
//Area of circle?
package selfclass;

import java.util.Scanner;
public class CircleArea {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter radius :");
        float radius = in.nextFloat();
        System.out.println("The area is :" + area(radius));
    }
    
    static double area (float r){
        double area = (Math.PI)*(Math.pow(r, 2));
        return area;
    }
    
}
