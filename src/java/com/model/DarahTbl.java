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
@Table(name = "DARAH_TBL")
@NamedQueries({
    @NamedQuery(name = "DarahTbl.findAll", query = "SELECT d FROM DarahTbl d")})
public class DarahTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DARAH")
    private Short darah;
    @Basic(optional = false)
    @Column(name = "NMDARAH")
    private String nmdarah;
    @Column(name = "JENIS")
    private Short jenis;
    @OneToMany(mappedBy = "darah")
    private List<Pegawai> pegawaiList;

    public DarahTbl() {
    }

    public DarahTbl(Short darah) {
        this.darah = darah;
    }

    public DarahTbl(Short darah, String nmdarah) {
        this.darah = darah;
        this.nmdarah = nmdarah;
    }

    public Short getDarah() {
        return darah;
    }

    public void setDarah(Short darah) {
        this.darah = darah;
    }

    public String getNmdarah() {
        return nmdarah;
    }

    public void setNmdarah(String nmdarah) {
        this.nmdarah = nmdarah;
    }

    public Short getJenis() {
        return jenis;
    }

    public void setJenis(Short jenis) {
        this.jenis = jenis;
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
        hash += (darah != null ? darah.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DarahTbl)) {
            return false;
        }
        DarahTbl other = (DarahTbl) object;
        if ((this.darah == null && other.darah != null) || (this.darah != null && !this.darah.equals(other.darah))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.DarahTbl[ darah=" + darah + " ]";
    }
    
}
