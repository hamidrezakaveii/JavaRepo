package lab;
// My Class With Java 
// Purpose: Car System

public class Car
{
    private int carNumber; 
    private String carColor; 
    private double carSpeed; 
    private Boolean carBreakBool;

    public static int carNumberSeats; 
    public int nunberVheels;
    public Car(){
        carNumber = 0;
        carColor = " ";
        carSpeed = 0.0;
    }
    public Car(int number,String color,double speed){
        carNumber = number;
        carColor = color;
        carSpeed = speed;
    }
    public Car(Car carObject){
        carNumber = carObject.carNumber;
        carColor = carObject.carColor;
        carSpeed = carObject.carSpeed;
    }

    //Mutator method for Car class
    public void setNumber(int vnumber){
        carNumber=vnumber;}
    public void setColor(String vcolor){
        carColor=vcolor;}
    public void setSpeed(double vspeed){
        carSpeed=vspeed;}
    //Accessor method for Car class
    public int getNumber(){
        return carNumber;}
    public String getColor(){
        return carColor;}
    public double getSpeed(){
        return carSpeed;}
           //Method to set the member variables of Car
           //according to the parameters
           //Postcondition: carNumber = vcarNunber: carColor = vcarColor; 
           //carSpeed = vcarSpeed;
    public void setValue(int vcarNumber, String vcarColor, double vcarSpeed)
        {
           carNumber = vcarNumber; 
           carColor = vcarColor; 
           carSpeed = vcarSpeed;
        }

           //Method to double the carSpeed of the Car 
           //Postcondition: The value of carSpeed is doubled.
    public double IncreaseSpeed()
        {
           carSpeed = carSpeed * 2;
           System.out.println("\nThe Speed of the Car is doubled " + carSpeed + "\n");
           return carSpeed;
        }

           //Method to print the member variables of Car 
           //Postcondition: Car is printed in the form 
           //carNunber//carColormcarSpeed
    public void printCarInfo()
        {
           System.out.println("\nThe Car Information is : " + carNumber + "//"
                   + carColor + "//" + carSpeed + "Km/h\n");

         }

}