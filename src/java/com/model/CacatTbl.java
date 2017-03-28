/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "CACAT_TBL")
@NamedQueries({
    @NamedQuery(name = "CacatTbl.findAll", query = "SELECT c FROM CacatTbl c")})
public class CacatTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CACAT")
    private Short cacat;
    @Column(name = "NMCACAT")
    private String nmcacat;
    @OneToMany(mappedBy = "cacat")
    private List<Pegawai> pegawaiList;

    public CacatTbl() {
    }

    public CacatTbl(Short cacat) {
        this.cacat = cacat;
    }

    public Short getCacat() {
        return cacat;
    }

    public void setCacat(Short cacat) {
        this.cacat = cacat;
    }

    public String getNmcacat() {
        return nmcacat;
    }

    public void setNmcacat(String nmcacat) {
        this.nmcacat = nmcacat;
    }

    public List<Pegawai> getPegawaiList() {
        return pegawaiList;
    }

    public void setPegawaiList(List<Pegawai> pegawaiList) {
        this.pegawaiList = pegawaiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cacat != null ? cacat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CacatTbl)) {
            return false;
        }
        CacatTbl other = (CacatTbl) object;
        if ((this.cacat == null && other.cacat != null) || (this.cacat != null && !this.cacat.equals(other.cacat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.CacatTbl[ cacat=" + cacat + " ]";
    }
    
}
