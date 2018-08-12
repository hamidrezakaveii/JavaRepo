/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculerspacecamion;

/**
 *
 * @author HAMIDREZA
 */
public class Camion {
    private boolean chargMax = true;
    private Boite[] listBoite = new Boite[10];
    private int nbBoite = 0;
    
    
    public void ajouterBoite(Boite b){
        this.listBoite[nbBoite] = b;
        nbBoite ++;
    }
    
    private int calculerSuperfici(){
        int surface = 0;
        for(int i=0; i < nbBoite; i++){
        surface += surface +(listBoite[i].getLargeur()*listBoite[i].getLongeur());
        }
        return surface;
    }
    
    
    
    public boolean estPlein(){
        
        if (this.calculerSuperfici() < 150000)
            chargMax = true;
        else
            chargMax = false;    
        return chargMax;
    }
    
    @Override
    public String toString(){
        String composition="";
        composition += "== Le chargement comprend "+nbBoite+" boites: ==\n";
        for(int i = 0;i<nbBoite;i++){
        composition += "Boite "+(i+1)+": "+listBoite[i].getLongeur()+"*"+listBoite[i].getLargeur()+"cm\n";
        }
        return composition;  
      }  
}
    

