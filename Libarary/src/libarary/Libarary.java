
package libarary;
import java.awt.Choice;
import java.util.Scanner;
public class Libarary {
        public int i =0;
        public int id =0 ;
        public int member=0;
        String[] name =new String[member];
        int[] age = new int[member];
        String[] gender= new String[member];
    public static void main(String[] args) {
        
        
        Libarary s = new Libarary();

        int choice;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of possible members : ");
        s.member = in.nextInt();
        do{
            System.out.println("1) Add member");
            System.out.println("2) Delete member");
            System.out.println("3) Edit member");
            System.out.println("4) Show member");
            System.out.println("5) Exit");
            System.out.print("Please enter a number between 1 and 5 : ");
            choice = in.nextInt();
            if (choice == 1)
                System.out.println("New member id: "+create(s.i));
            
        }while(choice != 5);
        
        
    }
    public static int create(int i){
        Scanner in = new Scanner(System.in);
        Libarary s = new Libarary();
        if (s.i<s.member){
        System.out.println("Name:");
        s.name[i]= in.nextLine();
        System.out.println("Gender:");
        s.gender[i]= in.nextLine();
        System.out.println("Age:");
        s.age[i]= in.nextInt();
        s.id+=1;
        s.i+=1;
        }
        return s.id;
        
    }
    
}
