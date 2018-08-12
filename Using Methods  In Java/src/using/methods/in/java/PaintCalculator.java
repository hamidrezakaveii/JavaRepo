package using.methods.in.java;
import java.util.Scanner;
public class PaintCalculator {
        public static void main (String[] args)
    {
    Scanner keyBoard =new Scanner(System.in);
    System.out.println("Inset length : ");
    double length;
    length = keyBoard.nextDouble();
    System.out.println("Inset width : ");
    double width;
    width = keyBoard.nextDouble();
    System.out.println("Inset height : ");
    double height;
    height = keyBoard.nextDouble();
    //gallonsNeeded (wallArea (length,width,height));
    //System.out.println("Gallons needed for painting this room is : "+ gallonsNeeded (wallArea (length,width,height)));
    double rightgallon;
        rightgallon = Math.ceil(gallonsNeeded (wallArea (length,width,height)));
    System.out.println("The cost to pain a "+ length +"-by-"+ width +"-foot room with "+ height +"-foot ceilings is "+ totalPrice ( rightgallon));
    }
        public static double wallArea (double l,double w,double h)
        {
           double area;
           area = ((l*h)*2)+((w*h)*2);
           return area;
        }
        public static double gallonsNeeded (double area)
        {
           double totalgallon;
           totalgallon = (area / 350);
           return totalgallon;
        }
        public static  double totalPrice (double rightgallon)
        {
            double totalprice;
            totalprice = (rightgallon * 32);
            return totalprice;
        }
}
