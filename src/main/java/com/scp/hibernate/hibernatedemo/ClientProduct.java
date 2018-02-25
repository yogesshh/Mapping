package com.scp.hibernate.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientProduct {

	public static void main(String[] args) {

		
		Product p=new Product(101, "Yog",2000);
		
		 SessionFactory sf= new Configuration().configure().buildSessionFactory();
		 Session session = sf.openSession();

		
		// System.out.println(session.getName());
		 Transaction tx = session.beginTransaction();
		 session.save(p);
		System.out.println( session.load(Product.class,new Integer(101)));
		 tx.commit();
		 session.close();
	   }

       }
