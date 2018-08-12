/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCtr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import entity.Client;
import entity.Commande;
import java.util.Date;
import util.DAO_Client;
import query.Query1;

/**
 *
 * @author HAMIDREZA
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    
    public static SessionFactory sessionFactory = null;
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = null;
        try {
            
            date1 = sdf.parse("04/06/2018");
            //create client
            Client  client = new Client(1, "ali", "5148080000");
            //util.DAO_Client.insert(client);
            //DAO_Client.select();
            
            //create commande 
            Commande commande = new Commande(100, date1, 1);
            //DAO_Commande.insert(commande);
            
            //run query
            Query1.lesCommendes();
            
            
        } catch (ParseException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {          
            System.out.println(ex.getMessage());
        }finally{
            if(!sessionFactory.isClosed()){
                sessionFactory.close();
            }
        }
        
    }
    
}
