/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;

public class Apartment {
    private int appnum;
    private int bedno;
    private int bathno;
    private int rent;
    
    public Apartment (int a,int ben,int ban,int r){
        setAppNum(a);
        setBedNo(ben);
        setBathNo(ban);
        setRent(r);
        
    }
    public void setAppNum(int num){
        appnum=num;}
    public int getAppNum(){
        return appnum;}
    public void setBedNo(int ben){
        bedno=ben;}
    public int getBedNo(){
        return bedno;}
    public void setBathNo(int ban){
        bathno=ban;}
    public int getBathNo(){
        return bathno;}
    public void setRent(int r){
        rent=r;}
    public int getRent(){
        return rent;}
}
