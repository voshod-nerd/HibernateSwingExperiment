/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.daoImpl;

import com.hibernate.tutorial.dao.SertifDAO;
import com.hibernate.tutorial.entity.Sertif;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Талалаев
 */
@Repository
@Transactional
public class SertifDAOImpl extends HibernateDaoSupport implements SertifDAO {
    
    
    
    public void save(Sertif value) {
       getHibernateTemplate().save(value);
    }

    public void update(Sertif value) {
        getHibernateTemplate().update(value);
    }

    public void delete(Sertif value) {
       getHibernateTemplate().delete(value);
    }

    public List<Sertif> getAllSertif() {
      List<Sertif> result = (List<Sertif>) getHibernateTemplate().find("from Sertif");
       return result;
    }

    public Sertif create(Sertif value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Sertif findByIddokt(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
