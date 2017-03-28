/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
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
@Table(name = "AGAMA_TBL")
@NamedQueries({
    @NamedQuery(name = "AgamaTbl.findAll", query = "SELECT a FROM AgamaTbl a")})
public class AgamaTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KDAGAMA")
    private String kdagama;
    @Basic(optional = false)
    @Column(name = "NAMA_AGAMA")
    private String namaAgama;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kdagama")
    private List<Pegawai> pegawaiList;

    public AgamaTbl() {
    }

    public AgamaTbl(String kdagama) {
        this.kdagama = kdagama;
    }

    public AgamaTbl(String kdagama, String namaAgama) {
        this.kdagama = kdagama;
        this.namaAgama = namaAgama;
    }

    public String getKdagama() {
        return kdagama;
    }

    public void setKdagama(String kdagama) {
        this.kdagama = kdagama;
    }

    public String getNamaAgama() {
        return namaAgama;
    }

    public void setNamaAgama(String namaAgama) {
        this.namaAgama = namaAgama;
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
        hash += (kdagama != null ? kdagama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgamaTbl)) {
            return false;
        }
        AgamaTbl other = (AgamaTbl) object;
        if ((this.kdagama == null && other.kdagama != null) || (this.kdagama != null && !this.kdagama.equals(other.kdagama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.AgamaTbl[ kdagama=" + kdagama + " ]";
    }
    
}
