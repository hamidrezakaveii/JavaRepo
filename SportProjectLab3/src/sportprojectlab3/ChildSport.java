package sportprojectlab3;

public class ChildSport extends Sport implements SecondarySport
{
    private double cost_pro;
    
    double cost_year1=2013;
    double cost_year2=2014;
    
    Equipment equipment;
   
    
    public ChildSport(String name,double number_hour,int number_week,double cost_pro){
        super(name,number_hour,number_week);
        this.cost_pro=cost_pro;
        equipment = new Equipment();
    }
    
     public double CalculateCostTraining()
     {
         return super.CalculateCostTraining()+cost_pro;
     }
      public String toString()
 {
     return (super.toString()+"//"+cost_pro+"$");
             
 }
      public double SumPro()                   //Override Interface Method  
      {
          return (cost_year1+cost_year2);
      }
    
}
