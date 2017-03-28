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
@Table(name = "SUKU_TBL")
@NamedQueries({
    @NamedQuery(name = "SukuTbl.findAll", query = "SELECT s FROM SukuTbl s")})
public class SukuTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KDSUKU")
    private String kdsuku;
    @Column(name = "NMSUKU")
    private String nmsuku;
    @Column(name = "LOKAL")
    private Short lokal;
    @OneToMany(mappedBy = "kdsuku")
    private List<Pegawai> pegawaiList;

    public SukuTbl() {
    }

    public SukuTbl(String kdsuku) {
        this.kdsuku = kdsuku;
    }

    public String getKdsuku() {
        return kdsuku;
    }

    public void setKdsuku(String kdsuku) {
        this.kdsuku = kdsuku;
    }

    public String getNmsuku() {
        return nmsuku;
    }

    public void setNmsuku(String nmsuku) {
        this.nmsuku = nmsuku;
    }

    public Short getLokal() {
        return lokal;
    }

    public void setLokal(Short lokal) {
        this.lokal = lokal;
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
        hash += (kdsuku != null ? kdsuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SukuTbl)) {
            return false;
        }
        SukuTbl other = (SukuTbl) object;
        if ((this.kdsuku == null && other.kdsuku != null) || (this.kdsuku != null && !this.kdsuku.equals(other.kdsuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.SukuTbl[ kdsuku=" + kdsuku + " ]";
    }
    
}
