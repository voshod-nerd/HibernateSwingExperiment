package com.hibernate.tutorial.mainclass;

import com.hibernate.tutorial.dao.SertifDAO;
import com.hibernate.tutorial.entity.Sertif;
import com.hibernate.tutorial.entity.SpisokVrach;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HibernateMain {

    @Autowired
    private SertifDAO sertifRep;

   
    public List<Sertif> getAll() {
        return sertifRep.getAllSertif();
    }

    public List<Sertif> getAllSertif() {
        SessionFactory sessionFactory;
        sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<Sertif> list = session.createCriteria(Sertif.class).list();
        tx.commit();
        session.close();
        return list;
    }

    public List<SpisokVrach> getAllSpisokVrach() {

        SessionFactory sessionFactory;
        sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        //Doctor emp = new Doctor();
        //emp.setId(new Long(1));
        //emp.setFio("Rahul Wagh");
        //emp.setDr(new Date());
        //session.save(emp);
        List<SpisokVrach> list = session.createCriteria(SpisokVrach.class).list();
        tx.commit();
        session.close();
        return list;

    }

    public void main(String[] args) {
        SessionFactory sessionFactory;
        sessionFactory = new Configuration().configure() // configures settings											// hibernate.cfg.xml
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        //Doctor emp = new Doctor();
        //emp.setId(new Long(1));
        //emp.setFio("Rahul Wagh");
        //emp.setDr(new Date());
        //session.save(emp);
        // final List<Doctor> list = session.createCriteria(Doctor.class).list();
        tx.commit();
        session.close();

    }

  
    
}
