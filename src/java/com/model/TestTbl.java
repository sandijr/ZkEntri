/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author user
 */
@Entity
@Table(name = "TEST_TBL")
@NamedQueries({
    @NamedQuery(name = "TestTbl.findAll", query = "SELECT t FROM TestTbl t")})
public class TestTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NRK")
    @Id
    private String nrk;
    @Basic(optional = false)
    @Column(name = "NAMA")
    private String nama;
    @Basic(optional = false)
    @Column(name = "JENKEL")
    private short jenkel;
    @Column(name = "PATHIR")
    private String pathir;
    @Basic(optional = false)
    @Column(name = "TALHIR")
    @Temporal(TemporalType.DATE)
    private Date talhir;
    @Basic(optional = false)
    @Column(name = "STAWIN")
    private short stawin;
    @Basic(optional = false)
    @Column(name = "MUANG")
    @Temporal(TemporalType.DATE)
    private Date muang;
    @Column(name = "NOSK")
    private String nosk;
    @Column(name = "TGSK")
    @Temporal(TemporalType.DATE)
    private Date tgsk;
    @Column(name = "TTMASKER")
    private Short ttmasker;
    @Column(name = "BBMASKER")
    private Short bbmasker;
    @Column(name = "NKPNFORMAL")
    private Short nkpnformal;
    @Column(name = "DARAH")
    private Short darah;
    @Basic(optional = false)
    @Column(name = "KDAGAMA")
    private Character kdagama;
    @Column(name = "TMTCP")
    @Temporal(TemporalType.DATE)
    private Date tmtcp;
    @Column(name = "NOSKCP")
    private String noskcp;
    @Column(name = "TGSKCP")
    @Temporal(TemporalType.DATE)
    private Date tgskcp;
    @Column(name = "KDSUKU")
    private String kdsuku;
    @Column(name = "KIDAL")
    private Short kidal;
    @Column(name = "CACAT")
    private Short cacat;
    @Column(name = "TINGGI")
    private Short tinggi;
    @Column(name = "BERAT")
    private Short berat;
    @Column(name = "NOOTHERS")
    private String noothers;
    @Column(name = "KTPNO")
    private String ktpno;
    @Column(name = "THTNO")
    private String thtno;
    @Column(name = "AKTKNO")
    private String aktkno;
    @Column(name = "NPWP")
    private String npwp;
    @Column(name = "ASTEKNO")
    private String astekno;
    @Column(name = "ACCTNO")
    private String acctno;
    @Column(name = "KDBANK")
    private String kdbank;
    @Column(name = "BANKKEY")
    private String bankkey;
    @Column(name = "NOKARTU")
    private String nokartu;
    @Column(name = "KELKER")
    private Short kelker;
    @Column(name = "BERHENTI")
    @Temporal(TemporalType.DATE)
    private Date berhenti;
    @Column(name = "INPUTER")
    private String inputer;
    @Column(name = "INPUT_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inputStamp;
    @Column(name = "WARGANEGARA")
    private String warganegara;
    @Column(name = "HANDPHONE")
    private String handphone;
    @Column(name = "KOLOMD1")
    @Temporal(TemporalType.DATE)
    private Date kolomd1;
    @Column(name = "KOLOMD2")
    @Temporal(TemporalType.DATE)
    private Date kolomd2;
    @Column(name = "KOLOMD3")
    @Temporal(TemporalType.DATE)
    private Date kolomd3;
    @Column(name = "BAJU")
    private String baju;
    @Column(name = "CELANA")
    private String celana;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SEPATU")
    private BigDecimal sepatu;
    @Column(name = "MAILNW")
    private String mailnw;
    @Column(name = "NONDIS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nondis;

    public TestTbl() {
    }

    public String getNrk() {
        return nrk;
    }

    public void setNrk(String nrk) {
        this.nrk = nrk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public short getJenkel() {
        return jenkel;
    }

    public void setJenkel(short jenkel) {
        this.jenkel = jenkel;
    }

    public String getPathir() {
        return pathir;
    }

    public void setPathir(String pathir) {
        this.pathir = pathir;
    }

    public Date getTalhir() {
        return talhir;
    }

    public void setTalhir(Date talhir) {
        this.talhir = talhir;
    }

    public short getStawin() {
        return stawin;
    }

    public void setStawin(short stawin) {
        this.stawin = stawin;
    }

    public Date getMuang() {
        return muang;
    }

    public void setMuang(Date muang) {
        this.muang = muang;
    }

    public String getNosk() {
        return nosk;
    }

    public void setNosk(String nosk) {
        this.nosk = nosk;
    }

    public Date getTgsk() {
        return tgsk;
    }

    public void setTgsk(Date tgsk) {
        this.tgsk = tgsk;
    }

    public Short getTtmasker() {
        return ttmasker;
    }

    public void setTtmasker(Short ttmasker) {
        this.ttmasker = ttmasker;
    }

    public Short getBbmasker() {
        return bbmasker;
    }

    public void setBbmasker(Short bbmasker) {
        this.bbmasker = bbmasker;
    }

    public Short getNkpnformal() {
        return nkpnformal;
    }

    public void setNkpnformal(Short nkpnformal) {
        this.nkpnformal = nkpnformal;
    }

    public Short getDarah() {
        return darah;
    }

    public void setDarah(Short darah) {
        this.darah = darah;
    }

    public Character getKdagama() {
        return kdagama;
    }

    public void setKdagama(Character kdagama) {
        this.kdagama = kdagama;
    }

    public Date getTmtcp() {
        return tmtcp;
    }

    public void setTmtcp(Date tmtcp) {
        this.tmtcp = tmtcp;
    }

    public String getNoskcp() {
        return noskcp;
    }

    public void setNoskcp(String noskcp) {
        this.noskcp = noskcp;
    }

    public Date getTgskcp() {
        return tgskcp;
    }

    public void setTgskcp(Date tgskcp) {
        this.tgskcp = tgskcp;
    }

    public String getKdsuku() {
        return kdsuku;
    }

    public void setKdsuku(String kdsuku) {
        this.kdsuku = kdsuku;
    }

    public Short getKidal() {
        return kidal;
    }

    public void setKidal(Short kidal) {
        this.kidal = kidal;
    }

    public Short getCacat() {
        return cacat;
    }

    public void setCacat(Short cacat) {
        this.cacat = cacat;
    }

    public Short getTinggi() {
        return tinggi;
    }

    public void setTinggi(Short tinggi) {
        this.tinggi = tinggi;
    }

    public Short getBerat() {
        return berat;
    }

    public void setBerat(Short berat) {
        this.berat = berat;
    }

    public String getNoothers() {
        return noothers;
    }

    public void setNoothers(String noothers) {
        this.noothers = noothers;
    }

    public String getKtpno() {
        return ktpno;
    }

    public void setKtpno(String ktpno) {
        this.ktpno = ktpno;
    }

    public String getThtno() {
        return thtno;
    }

    public void setThtno(String thtno) {
        this.thtno = thtno;
    }

    public String getAktkno() {
        return aktkno;
    }

    public void setAktkno(String aktkno) {
        this.aktkno = aktkno;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getAstekno() {
        return astekno;
    }

    public void setAstekno(String astekno) {
        this.astekno = astekno;
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    public String getKdbank() {
        return kdbank;
    }

    public void setKdbank(String kdbank) {
        this.kdbank = kdbank;
    }

    public String getBankkey() {
        return bankkey;
    }

    public void setBankkey(String bankkey) {
        this.bankkey = bankkey;
    }

    public String getNokartu() {
        return nokartu;
    }

    public void setNokartu(String nokartu) {
        this.nokartu = nokartu;
    }

    public Short getKelker() {
        return kelker;
    }

    public void setKelker(Short kelker) {
        this.kelker = kelker;
    }

    public Date getBerhenti() {
        return berhenti;
    }

    public void setBerhenti(Date berhenti) {
        this.berhenti = berhenti;
    }

    public String getInputer() {
        return inputer;
    }

    public void setInputer(String inputer) {
        this.inputer = inputer;
    }

    public Date getInputStamp() {
        return inputStamp;
    }

    public void setInputStamp(Date inputStamp) {
        this.inputStamp = inputStamp;
    }

    public String getWarganegara() {
        return warganegara;
    }

    public void setWarganegara(String warganegara) {
        this.warganegara = warganegara;
    }

    public String getHandphone() {
        return handphone;
    }

    public void setHandphone(String handphone) {
        this.handphone = handphone;
    }

    public Date getKolomd1() {
        return kolomd1;
    }

    public void setKolomd1(Date kolomd1) {
        this.kolomd1 = kolomd1;
    }

    public Date getKolomd2() {
        return kolomd2;
    }

    public void setKolomd2(Date kolomd2) {
        this.kolomd2 = kolomd2;
    }

    public Date getKolomd3() {
        return kolomd3;
    }

    public void setKolomd3(Date kolomd3) {
        this.kolomd3 = kolomd3;
    }

    public String getBaju() {
        return baju;
    }

    public void setBaju(String baju) {
        this.baju = baju;
    }

    public String getCelana() {
        return celana;
    }

    public void setCelana(String celana) {
        this.celana = celana;
    }

    public BigDecimal getSepatu() {
        return sepatu;
    }

    public void setSepatu(BigDecimal sepatu) {
        this.sepatu = sepatu;
    }

    public String getMailnw() {
        return mailnw;
    }

    public void setMailnw(String mailnw) {
        this.mailnw = mailnw;
    }

    public Date getNondis() {
        return nondis;
    }

    public void setNondis(Date nondis) {
        this.nondis = nondis;
    }
    
}
