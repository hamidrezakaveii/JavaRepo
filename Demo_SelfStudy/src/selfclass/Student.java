/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfclass;

public class Student {
    private String name = "Hamid";
    private long ID;
    private char type;
    private Student[] grade;
    {
        System.out.println("Step 2: Initialization Block");
        grade = new Student[10];
        //for(int i=0; i<grade.length; i++){grade[i] = new Student();}
    }
    public void finailize(){
        System.out.println("Test Finalize!");
    }
    public Student(){
        ID = 10;
        System.out.println("Step 3: Constructor");
}
    public Student(String name){
        this.name = name;
        System.out.println("Step 3: Constructor");
    }
    public Student (String name, long ID){
        this(name);
        this.ID = ID;
        System.out.println("Step 3: Constructor");
    }
    public String getName() {return name;}
    public void setName (String name) {this.name = name;}
    public long getID() {return ID;}
    public void setID(long ID) {this.ID = ID;}
    

    public static void main(String[] args){
        test();
        System.gc();
        
        
    }
    private static void test(){
        Student s1 = new Student("Ali",100);
        System.out.println(s1.getName());
        System.out.println(s1.getID());
        Student s2 = new Student();
        //Runtime.getRuntime().addShutdownHook(s1);
    }
}
