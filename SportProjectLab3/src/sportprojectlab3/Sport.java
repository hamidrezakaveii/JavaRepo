package sportprojectlab3;

public class Sport {
    private String name;
    private double number_hour;
    private int number_week;
    public static double cost_hour;
    //sport.cost_hour=15;
    //double cost_training;
    public Sport()
    {
        name="";
        number_hour=0.00;
        number_week=0;
    }
    public Sport(String name,double number_hour,int number_week)
    {
     this.name = name;
     this.number_hour=number_hour;
     this.number_week=number_week;
    }
    public Sport(Sport olympianPlayer){
     this.name = olympianPlayer.getName();
     this.number_hour=olympianPlayer.getNumberHour();
     this.number_week=olympianPlayer.getNumberWeek();
    }
    
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setNumberHour(double number_hour)
    {
        this.number_hour=number_hour;
    }
    public void setNumberWeek(int number_week)
    {
        this.number_week=number_week;
    }
    public String getName()
    {
        return name;
    }
    public double getNumberHour()
    {
        return number_hour;
    }
    public int getNumberWeek()
    {
        return number_week;
    }
public double CalculateCostTraining()
{
    return  (cost_hour * number_hour * number_week);
}

 public String toString()
 {
     return("The Sport Training Information is//"+name+"//"
             +number_hour+"//" +number_week+"//"+cost_hour+"$");
             
 }

}
