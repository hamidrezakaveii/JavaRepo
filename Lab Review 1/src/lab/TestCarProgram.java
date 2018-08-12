package lab;
import java.util.Scanner;
public class TestCarProgram {
     public static void main (String[] args)
     {
         int carNum;
         String carCol;
         double carSp;
         char ch;
         Car myGreenCar;
         myGreenCar =new Car();
         Car myRedCar;
         myRedCar = new Car();
         Car yourCar;
         yourCar = new Car();
         System.out.println("Line2:After setting, myGreencar");
         myGreenCar.setValue(1, "Green", 200.0);
         myGreenCar.printCarInfo();
         System.out.println("Line 5:After setting, myRedcar");
         myRedCar.setValue(2, "Red", 230.0);
         myRedCar.printCarInfo();
         System.out.println("Line 8:After setting, YourCar");
         yourCar.setValue(3, "Black", 150.0);
         yourCar.printCarInfo();
         System.out.println("New setting for the value object yourCar");
         System.out.println("Line10: double the speed of yourCar object:");
         yourCar.IncreaseSpeed();
         System.out.println("Line11: After Increasing the speed,New Value of yourCar:");
         yourCar.printCarInfo();
         Scanner console = new Scanner(System.in);
         System.out.println("Now Enter the values of object yourcar");
         System.out.println("car number:");
         carNum = console.nextInt();
         System.out.println("car color:");
         carCol = console.next();
         System.out.println("car Speed:");
         carSp = console.nextDouble();
         yourCar.setValue(carNum, carCol, carSp);
         yourCar.printCarInfo();
         System.out.println("Double Speed of yourcar object");
         yourCar.IncreaseSpeed();
         System.out.println("After Increasing the speed of yourCar:");
         yourCar.printCarInfo();
         Car myBlueCar = new Car (4,"Dark Blue",60);
         Car myYellowCar = new Car ();
         myYellowCar.setNumber(5);
         myYellowCar.setColor("Light Yellow");
         myYellowCar.setSpeed(80);
         System.out.println("To Access the data members of myYelloowCar Object,");
         System.out.println("Car Number: "+myYellowCar.getNumber());
         System.out.println("Car Color: "+myYellowCar.getColor());
         System.out.println("Car Speed: "+myYellowCar.getSpeed());
         System.out.println();
         Car myOrangeCar = new Car (yourCar);
         System.out.println("After Setting, myOrangeCar Object,\n");
         myOrangeCar.printCarInfo();
         Car[] allCars=new Car[5];
         for(int i=0; i < allCars.length;i++){
             allCars[i]=new Car();}
         allCars[0].setNumber(myGreenCar.getNumber());
         allCars[0].setColor(myGreenCar.getColor());
         allCars[0].setSpeed(myGreenCar.getSpeed());
         allCars[1].setNumber(myRedCar.getNumber());
         allCars[1].setColor(myRedCar.getColor());
         allCars[1].setSpeed(myRedCar.getSpeed());
         allCars[2].setNumber(myBlueCar.getNumber());
         allCars[2].setColor(myBlueCar.getColor());
         allCars[2].setSpeed(myBlueCar.getSpeed());
         allCars[3].setNumber(myYellowCar.getNumber());
         allCars[3].setColor(myYellowCar.getColor());
         allCars[3].setSpeed(myYellowCar.getSpeed());
         allCars[4].setNumber(myOrangeCar.getNumber());
         allCars[4].setColor(myOrangeCar.getColor());
         allCars[4].setSpeed(myOrangeCar.getSpeed());
         System.out.println("Output the components of the filled array object allCars[]");
         System.out.println();
         for (int j=0;j<allCars.length;j++){
             System.out.println("allCars"+"["+j+"]:");
             System.out.println("Car Number: "+allCars[j].getNumber()+" ,Car Color: "+allCars[j].getColor()+" , Car Speed: "+allCars[j].getSpeed());
             allCars[j].printCarInfo();
         }
     }
}
