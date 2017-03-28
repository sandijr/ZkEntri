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
@Table(name = "KELKER_TBL")
@NamedQueries({
    @NamedQuery(name = "KelkerTbl.findAll", query = "SELECT k FROM KelkerTbl k")})
public class KelkerTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KELKER")
    private Short kelker;
    @Column(name = "NMKELKER")
    private String nmkelker;
    @OneToMany(mappedBy = "kelker")
    private List<Pegawai> pegawaiList;

    public KelkerTbl() {
    }

    public KelkerTbl(Short kelker) {
        this.kelker = kelker;
    }

    public Short getKelker() {
        return kelker;
    }

    public void setKelker(Short kelker) {
        this.kelker = kelker;
    }

    public String getNmkelker() {
        return nmkelker;
    }

    public void setNmkelker(String nmkelker) {
        this.nmkelker = nmkelker;
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
        hash += (kelker != null ? kelker.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KelkerTbl)) {
            return false;
        }
        KelkerTbl other = (KelkerTbl) object;
        if ((this.kelker == null && other.kelker != null) || (this.kelker != null && !this.kelker.equals(other.kelker))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.KelkerTbl[ kelker=" + kelker + " ]";
    }
    
}
