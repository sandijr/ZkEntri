/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
@Table(name = "USER_TBL")
@NamedQueries({
    @NamedQuery(name = "UserTbl.findAll", query = "SELECT u FROM UserTbl u")})
public class UserTbls implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "PEMAKAI")
    private String pemakai;
    @Basic(optional = false)
    @Column(name = "NRK")
    @Id
    private String nrk;
    @Column(name = "TGL1")
    @Temporal(TemporalType.DATE)
    private Date tgl1;
    @Column(name = "PERSONALTS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date personalts;
    @Lob
    @Column(name = "REFERPA")
    private byte[] referpa;
    @Column(name = "NUM3")
    private Short num3;
    @Lob
    @Column(name = "REFERPRE")
    private byte[] referpre;
    @Column(name = "NUM6")
    private Short num6;
    @Column(name = "KIRIP")
    private String kirip;
    @Column(name = "KIRIQ")
    private String kiriq;
    @Column(name = "KETERANGAN")
    private String keterangan;
    //
    private String pwd;

    public UserTbls() {
    }

    public String getPemakai() {
        return pemakai;
    }

    public void setPemakai(String pemakai) {
        this.pemakai = pemakai;
    }

    public String getNrk() {
        return nrk;
    }

    public void setNrk(String nrk) {
        this.nrk = nrk;
    }

    public Date getTgl1() {
        return tgl1;
    }

    public void setTgl1(Date tgl1) {
        this.tgl1 = tgl1;
    }

    public Date getPersonalts() {
        return personalts;
    }

    public void setPersonalts(Date personalts) {
        this.personalts = personalts;
    }

    public byte[] getReferpa() {
        return referpa;
    }

    public void setReferpa(byte[] referpa) {
        this.referpa = referpa;
    }

    public Short getNum3() {
        return num3;
    }

    public void setNum3(Short num3) {
        this.num3 = num3;
    }

    public byte[] getReferpre() {
        return referpre;
    }

    public void setReferpre(byte[] referpre) {
        this.referpre = referpre;
    }

    public Short getNum6() {
        return num6;
    }

    public void setNum6(Short num6) {
        this.num6 = num6;
    }

    public String getKirip() {
        return kirip;
    }

    public void setKirip(String kirip) {
        this.kirip = kirip;
    }

    public String getKiriq() {
        return kiriq;
    }

    public void setKiriq(String kiriq) {
        this.kiriq = kiriq;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
