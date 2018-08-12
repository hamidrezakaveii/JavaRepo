/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
public class DAO_Commande {
    static Session session = null;
    
    public static void insert(Commande commande){
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();       
        session.beginTransaction();
        session.save(commande);
        session.getTransaction().commit();
        session.close();
        
    }
    
    public static void update(Commande commande){
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(commande);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void delete(Commande commande){
        sessionFactory =HibernateUtil.getSessionFactory();
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(commande);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void select(){
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Commande");
        
        List<Commande> result = query.list();
        
        for(Commande commande: result){
            System.out.println(commande.getNocommande()+" - "+commande.getDatecommande()+
                    " - "+ commande.getNoclient());
        }
        session.close();
    }
}
