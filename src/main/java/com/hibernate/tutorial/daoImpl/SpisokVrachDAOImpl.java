/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.daoImpl;
import com.hibernate.tutorial.dao.SpisokVrachDAO;
import com.hibernate.tutorial.entity.SpisokVrach;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
/**
 *
 * @author Талалаев
 */
public class SpisokVrachDAOImpl extends HibernateDaoSupport implements SpisokVrachDAO {

    public void save(SpisokVrach value) {
        getHibernateTemplate().save(value);
    }

    public void update(SpisokVrach value) {
         getHibernateTemplate().update(value);
    }

    public void delete(SpisokVrach value) {
        getHibernateTemplate().delete(value);
    }

    public List<SpisokVrach> getAllSpisokVrach() {
        List<SpisokVrach> result = (List<SpisokVrach>) getHibernateTemplate().find("from Sertif");
       return result;
    }

    public SpisokVrach create(SpisokVrach value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SpisokVrach findByIddokt(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
