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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ����
 */
@Entity
@Table(name = "spisok_vrach_hist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpisokVrachHist.findAll", query = "SELECT s FROM SpisokVrachHist s")
    , @NamedQuery(name = "SpisokVrachHist.findByIddokt", query = "SELECT s FROM SpisokVrachHist s WHERE s.iddokt = :iddokt")
    , @NamedQuery(name = "SpisokVrachHist.findByDateUv", query = "SELECT s FROM SpisokVrachHist s WHERE s.dateUv = :dateUv")
    , @NamedQuery(name = "SpisokVrachHist.findByDateVn", query = "SELECT s FROM SpisokVrachHist s WHERE s.dateVn = :dateVn")
    , @NamedQuery(name = "SpisokVrachHist.findByDokt", query = "SELECT s FROM SpisokVrachHist s WHERE s.dokt = :dokt")
    , @NamedQuery(name = "SpisokVrachHist.findByFam", query = "SELECT s FROM SpisokVrachHist s WHERE s.fam = :fam")
    , @NamedQuery(name = "SpisokVrachHist.findByIdOtd", query = "SELECT s FROM SpisokVrachHist s WHERE s.idOtd = :idOtd")
    , @NamedQuery(name = "SpisokVrachHist.findByIdPodr", query = "SELECT s FROM SpisokVrachHist s WHERE s.idPodr = :idPodr")
    , @NamedQuery(name = "SpisokVrachHist.findByIm", query = "SELECT s FROM SpisokVrachHist s WHERE s.im = :im")
    , @NamedQuery(name = "SpisokVrachHist.findByLpukod", query = "SELECT s FROM SpisokVrachHist s WHERE s.lpukod = :lpukod")
    , @NamedQuery(name = "SpisokVrachHist.findByOt", query = "SELECT s FROM SpisokVrachHist s WHERE s.ot = :ot")
    , @NamedQuery(name = "SpisokVrachHist.findByPrvs", query = "SELECT s FROM SpisokVrachHist s WHERE s.prvs = :prvs")
    , @NamedQuery(name = "SpisokVrachHist.findByDateEdit", query = "SELECT s FROM SpisokVrachHist s WHERE s.dateEdit = :dateEdit")})
public class SpisokVrachHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDOKT")
    private Integer iddokt;
    @Column(name = "DATE_UV")
    @Temporal(TemporalType.DATE)
    private Date dateUv;
    @Column(name = "DATE_VN")
    @Temporal(TemporalType.DATE)
    private Date dateVn;
    @Column(name = "DOKT")
    private Boolean dokt;
    @Column(name = "FAM")
    private String fam;
    @Column(name = "ID_OTD")
    private Integer idOtd;
    @Column(name = "ID_PODR")
    private Integer idPodr;
    @Column(name = "IM")
    private String im;
    @Column(name = "LPUKOD")
    private Integer lpukod;
    @Column(name = "OT")
    private String ot;
    @Column(name = "PRVS")
    private Integer prvs;
    @Column(name = "DATE_EDIT")
    @Temporal(TemporalType.DATE)
    private Date dateEdit;

    public SpisokVrachHist() {
    }

    public SpisokVrachHist(Integer iddokt) {
        this.iddokt = iddokt;
    }

    public Integer getIddokt() {
        return iddokt;
    }

    public void setIddokt(Integer iddokt) {
        this.iddokt = iddokt;
    }

    public Date getDateUv() {
        return dateUv;
    }

    public void setDateUv(Date dateUv) {
        this.dateUv = dateUv;
    }

    public Date getDateVn() {
        return dateVn;
    }

    public void setDateVn(Date dateVn) {
        this.dateVn = dateVn;
    }

    public Boolean getDokt() {
        return dokt;
    }

    public void setDokt(Boolean dokt) {
        this.dokt = dokt;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public Integer getIdOtd() {
        return idOtd;
    }

    public void setIdOtd(Integer idOtd) {
        this.idOtd = idOtd;
    }

    public Integer getIdPodr() {
        return idPodr;
    }

    public void setIdPodr(Integer idPodr) {
        this.idPodr = idPodr;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public Integer getLpukod() {
        return lpukod;
    }

    public void setLpukod(Integer lpukod) {
        this.lpukod = lpukod;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public Integer getPrvs() {
        return prvs;
    }

    public void setPrvs(Integer prvs) {
        this.prvs = prvs;
    }

    public Date getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddokt != null ? iddokt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpisokVrachHist)) {
            return false;
        }
        SpisokVrachHist other = (SpisokVrachHist) object;
        if ((this.iddokt == null && other.iddokt != null) || (this.iddokt != null && !this.iddokt.equals(other.iddokt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hibernate.tutorial.entity.SpisokVrachHist[ iddokt=" + iddokt + " ]";
    }
    
}
