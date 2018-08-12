
package Array;

public class TestAccount {
public static void main(String[] args){
    Account[] myacc=new Account[3];
    myacc[0] =new Account(001,10000);
    myacc[1] =new Account(002,20000);
    myacc[2] =new Account(003,30000);
    Account acc=new Account(1122,20000);
    acc.setAnnualInterestRate(0.045);
    acc.withdraw(2500);
    acc.deposit(3000);
    System.out.println("the balance is "+acc.getBalance()+"the montly interest rate is"+acc.getMonthlyInterest()+
            "the date when this account was created is "+acc.getDateCreated()); 
    for (int i=0;i<myacc.length;i++)
    System.out.println("the balance is "+myacc[i].getBalance()+"the montly interest rate is"
            +myacc[i].getMonthlyInterest()+"the date when this account was created is "+myacc[i].getDateCreated()); 
    //for (Account ac:myacc)
}     

}
