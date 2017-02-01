/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Юыху
 */
@Entity
@Table(name = "sertif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sertif.findAll", query = "SELECT s FROM Sertif s")
    , @NamedQuery(name = "Sertif.findById", query = "SELECT s FROM Sertif s WHERE s.id = :id")
    , @NamedQuery(name = "Sertif.findBySerName", query = "SELECT s FROM Sertif s WHERE s.serName = :serName")
    , @NamedQuery(name = "Sertif.findByDateadd", query = "SELECT s FROM Sertif s WHERE s.dateadd = :dateadd")})
public class Sertif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ser_name")
    private String serName;
    @Basic(optional = false)
    @Column(name = "dateadd")
    @Temporal(TemporalType.DATE)
    private Date dateadd;
    @JoinColumn(name = "iddokt", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Doctor iddokt;

    public Sertif() {
    }

    public Sertif(Integer id) {
        this.id = id;
    }

    public Sertif(Integer id, String serName, Date dateadd) {
        this.id = id;
        this.serName = serName;
        this.dateadd = dateadd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public Date getDateadd() {
        return dateadd;
    }

    public void setDateadd(Date dateadd) {
        this.dateadd = dateadd;
    }

    public Doctor getIddokt() {
        return iddokt;
    }

    public void setIddokt(Doctor iddokt) {
        this.iddokt = iddokt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sertif)) {
            return false;
        }
        Sertif other = (Sertif) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hibernate.tutorial.entity.Sertif[ id=" + id + " ]";
    }
    
}
