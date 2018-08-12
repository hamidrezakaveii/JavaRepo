/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import AppCtr.HibernateUtil;
import static AppCtr.main.sessionFactory;
import entity.Commande;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author HAMIDREZA
 */
public class Query1 {
    
    static Session session = null;
    
    public static void lesCommendes(){
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Commande");
        
        List<Commande> result = query.list();
        for(Commande o: result){
          System.out.println(o.getNoclient());  
        }
        System.out.println("");
        session.close();
    }
}
