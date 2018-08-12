
package ifstatement;

public class Automobile {
    private int idnum;
    private String make;
    private String model;
    private String color;
    private int year;
    private int miles;
    
          
    public void setIdnum(int id){
        if ((id < 0) || (id > 9999)) id=0;
        else
        idnum=id;}
    public int getIdnum(){
        return idnum;}
    public void setModel(String mo){
        model=mo;}
    public String getModel(){
        return model; }
    public String getMake(){
        return make; }
    public void setMake(String ma){
        make=ma;}
    public String getColor(){
        return color; }
    public void setColor(String co){
        color=co;}
        public void setYear(int yr){
        if ((yr < 2000) || (yr > 2017)) yr=0;
        else 
        year=yr;}
    public int getYear(){
        return year;}
        public void setMiles(int mi){
            if ((mi < 10) || (mi > 60)) mi=0;
         else             
        miles=mi;}
    public int getMiles(){
        return miles; }
    
        public Automobile (int i,String ma,String mo, String c,int y,int mi) {
        setIdnum(i);
        setMake(ma);
        setModel(mo);
        setColor(c);
        setYear(y);
        setMiles(mi);
        }
    
}