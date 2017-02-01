package com.hibernate.tutorial.mainclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.tutorial.entity.Doctor;
import com.hibernate.tutorial.ui.JFrameMain;

import java.util.List;
import javax.swing.JFrame;


import org.hibernate.Transaction;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure() // configures settings
															// from
															// hibernate.cfg.xml
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		//Doctor emp = new Doctor();
		//emp.setId(new Long(1));
		//emp.setFio("Rahul Wagh");
		//emp.setDr(new Date());
		//session.save(emp);
                 final List<Doctor> list = session.createCriteria(Doctor.class).list();
		tx.commit();
		session.close();
                
              javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new JFrameMain().listDoctors=list;
            }
        });   
	}
}
