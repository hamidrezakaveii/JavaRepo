/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import AppCtr.HibernateUtil;
import entity.Client;
import static AppCtr.main.sessionFactory;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author HAMIDREZA
 */
public class DAO_Client {

    static Session session = null;

    public static void insert(Client client) throws Exception {
        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            throw new Exception("Could not create client " + client.getNomclient(), e);
        }finally{
            session.close();
        }

    }

    public static void update(Client client) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(client);
        session.getTransaction().commit();
        session.close();
    }

    public static void delete(Client client) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(client);
        session.getTransaction().commit();
        session.close();
    }

    public static void select() {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.createQuery("from Client");

        List<Client> result = query.list();

        for (Client client : result) {
            System.out.println(client.getNoclient() + " - " + client.getNomclient()
                    + " - " + client.getNotelephone());
        }
        session.close();
    }

}
