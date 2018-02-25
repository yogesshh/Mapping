package com.scp.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Payment p = new Payment();
		p.setPaymentId(101);
		p.setAmount(5000);
		
		CreditCard cc= new CreditCard();
		cc.setCreditCardType("VISA");
		cc.setPaymentId(1034);
		cc.setAmount(5000);
		
		Cheque c= new Cheque();
		c.setChequeType("ICICI");
		c.setPaymentId(1067);
		c.setAmount(5000);
		
		    SessionFactory sf= new Configuration().configure("hibernate.cfg2.xml").buildSessionFactory();
		    Session session=sf.openSession();
            Transaction tx = session.beginTransaction();
          session.save(cc);
          session.save(c);
            session.save(p);
            tx.commit();
           
            session.close();
	}

}
