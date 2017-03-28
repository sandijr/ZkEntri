/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "STAWIN_TBL")
@NamedQueries({
    @NamedQuery(name = "StawinTbl.findAll", query = "SELECT s FROM StawinTbl s")})
public class StawinTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STAWIN")
    private Short stawin;
    @Column(name = "URAIAN")
    private String uraian;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "I_KELUARGA")
    private BigDecimal iKeluarga;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stawin")
    private List<Pegawai> pegawaiList;

    public StawinTbl() {
    }

    public StawinTbl(Short stawin) {
        this.stawin = stawin;
    }

    public StawinTbl(Short stawin, BigDecimal iKeluarga) {
        this.stawin = stawin;
        this.iKeluarga = iKeluarga;
    }

    public Short getStawin() {
        return stawin;
    }

    public void setStawin(Short stawin) {
        this.stawin = stawin;
    }

    public String getUraian() {
        return uraian;
    }

    public void setUraian(String uraian) {
        this.uraian = uraian;
    }

    public BigDecimal getIKeluarga() {
        return iKeluarga;
    }

    public void setIKeluarga(BigDecimal iKeluarga) {
        this.iKeluarga = iKeluarga;
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
        hash += (stawin != null ? stawin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StawinTbl)) {
            return false;
        }
        StawinTbl other = (StawinTbl) object;
        if ((this.stawin == null && other.stawin != null) || (this.stawin != null && !this.stawin.equals(other.stawin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.StawinTbl[ stawin=" + stawin + " ]";
    }
    
}
