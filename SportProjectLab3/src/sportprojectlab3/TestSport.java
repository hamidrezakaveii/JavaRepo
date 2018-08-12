
package sportprojectlab3;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class TestSport {
 
    public static void main(String[] aregs) throws FileNotFoundException
    {
       Sport.cost_hour=15;
       String myname;
       double hour;
       int week;
       double cost;
       
       
       PrintWriter outFile = new PrintWriter("Sport.out");
       
       Scanner inFile = new Scanner(new FileReader("Sport.in"));
       Sport RecordSport1 = new Sport();
       Sport RecordSport2 = new Sport();
       Sport RecordSport3 = new Sport();
       Sport RecordSport4 = new Sport();
       Sport RecordSport5 = new Sport();
       
       RecordSport1.setName(inFile.next()+ " " + inFile.next());
       RecordSport1.setNumberHour(inFile.nextDouble());
       RecordSport1.setNumberWeek(inFile.nextInt());
       RecordSport1.cost_hour = inFile.nextDouble();
       RecordSport2.setName(inFile.next()+ " " + inFile.next());
       RecordSport2.setNumberHour(inFile.nextDouble());
       RecordSport2.setNumberWeek(inFile.nextInt());
       RecordSport2.cost_hour = inFile.nextDouble();
       RecordSport3.setName(inFile.next()+ " " + inFile.next());
       RecordSport3.setNumberHour(inFile.nextDouble());
       RecordSport3.setNumberWeek(inFile.nextInt());
       RecordSport3.cost_hour = inFile.nextDouble();
       RecordSport4.setName(inFile.next()+ " " + inFile.next());
       RecordSport4.setNumberHour(inFile.nextDouble());
       RecordSport4.setNumberWeek(inFile.nextInt());
       RecordSport4.cost_hour = inFile.nextDouble();
       RecordSport5.setName(inFile.next()+ " " + inFile.next());
       RecordSport5.setNumberHour(inFile.nextDouble());
       RecordSport5.setNumberWeek(inFile.nextInt());
       RecordSport5.cost_hour = inFile.nextDouble();
       

       
       Sport myPlayer = new Sport("Bob", 3, 15);
       Sport yourPlayer = new Sport("Irena", 4, 25);
       Scanner console = new Scanner(System.in);
       System.out.println("Enter the First Name, Number of Hour , "
                + "and cost of an hour of training:");
       System.out.println("The Sport Training Application Built with Object "
               + "Oriented Programming(OOP)");
       System.out.println("Enter Name:");
       myname = console.nextLine();
       System.out.println("Enter Number of Sport Training Hours per Week:");
       hour = console.nextDouble();
       System.out.println("Enter Number of Week of Sport Training:");
       week = console.nextInt();
       System.out.println("Enter The cost of Sport training per hour:");
       cost = console.nextDouble();
              
       System.out.println("Info of myPlayer:\n");
       System.out.println(myPlayer);
       
       System.out.println("Info of yourPlayer:\n");
       System.out.println(yourPlayer);
       
       yourPlayer.setName(myname);
       yourPlayer.setNumberHour(hour);
       yourPlayer.setNumberWeek(week);
       
       System.out.println("New Value of yourPlayer:\n");
       System.out.println(yourPlayer);
       
       ChildSport mychildPlayer = new ChildSport("Fares",2,10,6);    //Inheritence Object
       ChildSport yourchildPlayer = new ChildSport("Irena",2,18,7); //Inheritence Object
       System.out.println("New Value of mychildPlayer:\n");     //Inheritence 
       System.out.println(mychildPlayer);                       //Inheritence call method to string
       System.out.println("New Value of yourchildPlayer:\n");   //Inheritence
       System.out.println(yourchildPlayer);                     //Inheritence call method to string
       
       System.out.println("---------Polymorphism----------");
       yourPlayer= yourchildPlayer;          //Polymorphism
       System.out.println(yourPlayer);       //Polymorphism
       System.out.println("Polymorphism: Invoking Subclass method with superclass"
               + " object refrence:"+yourPlayer.CalculateCostTraining());
       
       System.out.println("---------Interface----------");
       System.out.println("Calling method defiend in interface SecondarySport"
               + " SumPro return:"+yourchildPlayer.SumPro());
       
       System.out.println("---------Composition----------");
       yourchildPlayer.equipment.setEquipmentTitle("Apparatus For Body Building");
        System.out.println("Using Composition, the Equipement Title:"
                +yourchildPlayer.equipment.getEquipmentTitle());
        
       System.out.println("---------Copy Constructor----------");
       Sport olympianPlayer = new Sport(myPlayer);
       System.out.println("After setting, olympianPlayer object:\n");
       System.out.println(olympianPlayer);
       System.out.println();
       System.out.println("The cost of Sport Training of olympianPlayer"
                + "object is : "+olympianPlayer.CalculateCostTraining());
        
       System.out.println("---------File Output----------");
       outFile.println("myPlayer\t"+myPlayer.getName()+"\t"+
               myPlayer.getNumberHour()+"\t"+myPlayer.getNumberWeek()+
               "\t"+myPlayer.cost_hour+"\t"+myPlayer.CalculateCostTraining()+"$");
       outFile.println("yourPlayer\t"+yourPlayer.getName()+"\t"+
               yourPlayer.getNumberHour()+"\t"+yourPlayer.getNumberWeek()+
               "\t"+yourPlayer.cost_hour+"\t"+yourPlayer.CalculateCostTraining()+"$");
       outFile.println("mychildPlayer\t"+mychildPlayer.getName()+"\t"+
               mychildPlayer.getNumberHour()+"\t"+mychildPlayer.getNumberWeek()+
               "\t"+mychildPlayer.cost_hour+"\t"+mychildPlayer.CalculateCostTraining()+"$");
       outFile.println("RecordSport1\t"+RecordSport1.getName()+"\t"+
               RecordSport1.getNumberHour()+"\t"+RecordSport1.getNumberWeek()+
               "\t"+RecordSport1.cost_hour+"\t"+RecordSport1.CalculateCostTraining()+"$");
       outFile.println("RecordSport2\t"+RecordSport2.getName()+"\t"+
               RecordSport2.getNumberHour()+"\t"+RecordSport2.getNumberWeek()+
               "\t"+RecordSport2.cost_hour+"\t"+RecordSport2.CalculateCostTraining()+"$");
       outFile.println("RecordSport3\t"+RecordSport3.getName()+"\t"+
               RecordSport3.getNumberHour()+"\t"+RecordSport3.getNumberWeek()+
               "\t"+RecordSport3.cost_hour+"\t"+RecordSport3.CalculateCostTraining()+"$");
       outFile.println("RecordSport4\t"+RecordSport4.getName()+"\t"+
               RecordSport4.getNumberHour()+"\t"+RecordSport4.getNumberWeek()+
               "\t"+RecordSport4.cost_hour+"\t"+RecordSport4.CalculateCostTraining()+"$");
       outFile.println("RecordSport5\t"+RecordSport5.getName()+"\t"+
               RecordSport5.getNumberHour()+"\t"+RecordSport5.getNumberWeek()+
               "\t"+RecordSport5.cost_hour+"\t"+RecordSport5.CalculateCostTraining()+"$");
       outFile.close();
               
        System.out.println("---------File Input----------");
        System.out.println("Reading Sport records from an input "
                        + "(Simulate Oracle Table Reading)");
        System.out.println();
        System.out.println("After setting, RecordSport1 Object, The Sport "
        + "Training Information is : "+RecordSport1);
        System.out.println();
        System.out.println("The Cost of Sport Training of RecordSport1 object"
                + "is : "+RecordSport1.CalculateCostTraining());
        System.out.println();
        System.out.println("After setting, RecordSport2 Object, The Sport "
        + "Training Information is : "+RecordSport2);
        System.out.println();
        System.out.println("The Cost of Sport Training of RecordSport2 object"
                + "is : "+RecordSport2.CalculateCostTraining());
        System.out.println();
        System.out.println("After setting, RecordSport3 Object, The Sport "
        + "Training Information is : "+RecordSport3);
        System.out.println();
        System.out.println("The Cost of Sport Training of RecordSport3 object"
                + "is : "+RecordSport3.CalculateCostTraining());
        System.out.println();
        System.out.println("After setting, RecordSport4 Object, The Sport "
        + "Training Information is : "+RecordSport4);
        System.out.println();
        System.out.println("The Cost of Sport Training of RecordSport4 object"
                + "is : "+RecordSport4.CalculateCostTraining());
        System.out.println();
        System.out.println("After setting, RecordSport5 Object, The Sport "
        + "Training Information is : "+RecordSport5);
        System.out.println();
        System.out.println("The Cost of Sport Training of RecordSport5 object"
                + "is : "+RecordSport5.CalculateCostTraining());
        System.out.println();
        System.out.println("Total Cost of Sport Training of RecordSport1,2,3,4,5"
                + "object is  "+(RecordSport1.CalculateCostTraining()+
                        RecordSport2.CalculateCostTraining()+
                        RecordSport3.CalculateCostTraining()+
                        RecordSport4.CalculateCostTraining()+
                        RecordSport5.CalculateCostTraining())+"$");
    }
    
}
