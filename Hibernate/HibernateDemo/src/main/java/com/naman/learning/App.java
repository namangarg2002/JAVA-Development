package com.naman.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Aman");
        a1.setTech("Java");

        session.persist(a1);

        tx.commit();

        session.close();
        factory.close();

    }
}
