
package com.bacaWS.Pertama;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pegawai complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pegawai">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aktkno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astekno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baju" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankkey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbmasker" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="berat" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="berhenti" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cacat" type="{http://ade.kang.com/}cacatTbl" minOccurs="0"/>
 *         &lt;element name="celana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="darah" type="{http://ade.kang.com/}darahTbl" minOccurs="0"/>
 *         &lt;element name="handphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inputer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jenkel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="kdagama" type="{http://ade.kang.com/}agamaTbl" minOccurs="0"/>
 *         &lt;element name="kdbank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdsuku" type="{http://ade.kang.com/}sukuTbl" minOccurs="0"/>
 *         &lt;element name="kelker" type="{http://ade.kang.com/}kelkerTbl" minOccurs="0"/>
 *         &lt;element name="kidal" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="kolomd1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="kolomd2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="kolomd3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ktpno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailnw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="muang" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nkpnformal" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nokartu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nondis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="noothers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nosk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noskcp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="npwp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pathir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sepatu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stawin" type="{http://ade.kang.com/}stawinTbl" minOccurs="0"/>
 *         &lt;element name="talhir" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tgsk" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tgskcp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="thtno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinggi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="tmtcp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ttmasker" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="warganegara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pegawai", propOrder = {
    "acctno",
    "aktkno",
    "astekno",
    "baju",
    "bankkey",
    "bbmasker",
    "berat",
    "berhenti",
    "cacat",
    "celana",
    "darah",
    "handphone",
    "inputStamp",
    "inputer",
    "jenkel",
    "kdagama",
    "kdbank",
    "kdsuku",
    "kelker",
    "kidal",
    "kolomd1",
    "kolomd2",
    "kolomd3",
    "ktpno",
    "mailnw",
    "muang",
    "nama",
    "nkpnformal",
    "nokartu",
    "nondis",
    "noothers",
    "nosk",
    "noskcp",
    "npwp",
    "nrk",
    "pathir",
    "sepatu",
    "stawin",
    "talhir",
    "tgsk",
    "tgskcp",
    "thtno",
    "tinggi",
    "tmtcp",
    "ttmasker",
    "warganegara"
})
public class Pegawai {

    protected String acctno;
    protected String aktkno;
    protected String astekno;
    protected String baju;
    protected String bankkey;
    protected Short bbmasker;
    protected Short berat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar berhenti;
    protected CacatTbl cacat;
    protected String celana;
    protected DarahTbl darah;
    protected String handphone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inputStamp;
    protected String inputer;
    protected short jenkel;
    protected AgamaTbl kdagama;
    protected String kdbank;
    protected SukuTbl kdsuku;
    protected KelkerTbl kelker;
    protected Short kidal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kolomd1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kolomd2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kolomd3;
    protected String ktpno;
    protected String mailnw;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar muang;
    protected String nama;
    protected Short nkpnformal;
    protected String nokartu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nondis;
    protected String noothers;
    protected String nosk;
    protected String noskcp;
    protected String npwp;
    protected String nrk;
    protected String pathir;
    protected BigDecimal sepatu;
    protected StawinTbl stawin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar talhir;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tgsk;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tgskcp;
    protected String thtno;
    protected Short tinggi;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmtcp;
    protected Short ttmasker;
    protected String warganegara;

    /**
     * Gets the value of the acctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctno() {
        return acctno;
    }

    /**
     * Sets the value of the acctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctno(String value) {
        this.acctno = value;
    }

    /**
     * Gets the value of the aktkno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktkno() {
        return aktkno;
    }

    /**
     * Sets the value of the aktkno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktkno(String value) {
        this.aktkno = value;
    }

    /**
     * Gets the value of the astekno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstekno() {
        return astekno;
    }

    /**
     * Sets the value of the astekno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstekno(String value) {
        this.astekno = value;
    }

    /**
     * Gets the value of the baju property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaju() {
        return baju;
    }

    /**
     * Sets the value of the baju property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaju(String value) {
        this.baju = value;
    }

    /**
     * Gets the value of the bankkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankkey() {
        return bankkey;
    }

    /**
     * Sets the value of the bankkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankkey(String value) {
        this.bankkey = value;
    }

    /**
     * Gets the value of the bbmasker property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBbmasker() {
        return bbmasker;
    }

    /**
     * Sets the value of the bbmasker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBbmasker(Short value) {
        this.bbmasker = value;
    }

    /**
     * Gets the value of the berat property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBerat() {
        return berat;
    }

    /**
     * Sets the value of the berat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBerat(Short value) {
        this.berat = value;
    }

    /**
     * Gets the value of the berhenti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBerhenti() {
        return berhenti;
    }

    /**
     * Sets the value of the berhenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBerhenti(XMLGregorianCalendar value) {
        this.berhenti = value;
    }

    /**
     * Gets the value of the cacat property.
     * 
     * @return
     *     possible object is
     *     {@link CacatTbl }
     *     
     */
    public CacatTbl getCacat() {
        return cacat;
    }

    /**
     * Sets the value of the cacat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CacatTbl }
     *     
     */
    public void setCacat(CacatTbl value) {
        this.cacat = value;
    }

    /**
     * Gets the value of the celana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelana() {
        return celana;
    }

    /**
     * Sets the value of the celana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelana(String value) {
        this.celana = value;
    }

    /**
     * Gets the value of the darah property.
     * 
     * @return
     *     possible object is
     *     {@link DarahTbl }
     *     
     */
    public DarahTbl getDarah() {
        return darah;
    }

    /**
     * Sets the value of the darah property.
     * 
     * @param value
     *     allowed object is
     *     {@link DarahTbl }
     *     
     */
    public void setDarah(DarahTbl value) {
        this.darah = value;
    }

    /**
     * Gets the value of the handphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandphone() {
        return handphone;
    }

    /**
     * Sets the value of the handphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandphone(String value) {
        this.handphone = value;
    }

    /**
     * Gets the value of the inputStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputStamp() {
        return inputStamp;
    }

    /**
     * Sets the value of the inputStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInputStamp(XMLGregorianCalendar value) {
        this.inputStamp = value;
    }

    /**
     * Gets the value of the inputer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputer() {
        return inputer;
    }

    /**
     * Sets the value of the inputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputer(String value) {
        this.inputer = value;
    }

    /**
     * Gets the value of the jenkel property.
     * 
     */
    public short getJenkel() {
        return jenkel;
    }

    /**
     * Sets the value of the jenkel property.
     * 
     */
    public void setJenkel(short value) {
        this.jenkel = value;
    }

    /**
     * Gets the value of the kdagama property.
     * 
     * @return
     *     possible object is
     *     {@link AgamaTbl }
     *     
     */
    public AgamaTbl getKdagama() {
        return kdagama;
    }

    /**
     * Sets the value of the kdagama property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgamaTbl }
     *     
     */
    public void setKdagama(AgamaTbl value) {
        this.kdagama = value;
    }

    /**
     * Gets the value of the kdbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdbank() {
        return kdbank;
    }

    /**
     * Sets the value of the kdbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdbank(String value) {
        this.kdbank = value;
    }

    /**
     * Gets the value of the kdsuku property.
     * 
     * @return
     *     possible object is
     *     {@link SukuTbl }
     *     
     */
    public SukuTbl getKdsuku() {
        return kdsuku;
    }

    /**
     * Sets the value of the kdsuku property.
     * 
     * @param value
     *     allowed object is
     *     {@link SukuTbl }
     *     
     */
    public void setKdsuku(SukuTbl value) {
        this.kdsuku = value;
    }

    /**
     * Gets the value of the kelker property.
     * 
     * @return
     *     possible object is
     *     {@link KelkerTbl }
     *     
     */
    public KelkerTbl getKelker() {
        return kelker;
    }

    /**
     * Sets the value of the kelker property.
     * 
     * @param value
     *     allowed object is
     *     {@link KelkerTbl }
     *     
     */
    public void setKelker(KelkerTbl value) {
        this.kelker = value;
    }

    /**
     * Gets the value of the kidal property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKidal() {
        return kidal;
    }

    /**
     * Sets the value of the kidal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKidal(Short value) {
        this.kidal = value;
    }

    /**
     * Gets the value of the kolomd1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKolomd1() {
        return kolomd1;
    }

    /**
     * Sets the value of the kolomd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKolomd1(XMLGregorianCalendar value) {
        this.kolomd1 = value;
    }

    /**
     * Gets the value of the kolomd2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKolomd2() {
        return kolomd2;
    }

    /**
     * Sets the value of the kolomd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKolomd2(XMLGregorianCalendar value) {
        this.kolomd2 = value;
    }

    /**
     * Gets the value of the kolomd3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKolomd3() {
        return kolomd3;
    }

    /**
     * Sets the value of the kolomd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKolomd3(XMLGregorianCalendar value) {
        this.kolomd3 = value;
    }

    /**
     * Gets the value of the ktpno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtpno() {
        return ktpno;
    }

    /**
     * Sets the value of the ktpno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtpno(String value) {
        this.ktpno = value;
    }

    /**
     * Gets the value of the mailnw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailnw() {
        return mailnw;
    }

    /**
     * Sets the value of the mailnw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailnw(String value) {
        this.mailnw = value;
    }

    /**
     * Gets the value of the muang property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMuang() {
        return muang;
    }

    /**
     * Sets the value of the muang property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMuang(XMLGregorianCalendar value) {
        this.muang = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the nkpnformal property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNkpnformal() {
        return nkpnformal;
    }

    /**
     * Sets the value of the nkpnformal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNkpnformal(Short value) {
        this.nkpnformal = value;
    }

    /**
     * Gets the value of the nokartu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNokartu() {
        return nokartu;
    }

    /**
     * Sets the value of the nokartu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNokartu(String value) {
        this.nokartu = value;
    }

    /**
     * Gets the value of the nondis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNondis() {
        return nondis;
    }

    /**
     * Sets the value of the nondis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNondis(XMLGregorianCalendar value) {
        this.nondis = value;
    }

    /**
     * Gets the value of the noothers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoothers() {
        return noothers;
    }

    /**
     * Sets the value of the noothers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoothers(String value) {
        this.noothers = value;
    }

    /**
     * Gets the value of the nosk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNosk() {
        return nosk;
    }

    /**
     * Sets the value of the nosk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNosk(String value) {
        this.nosk = value;
    }

    /**
     * Gets the value of the noskcp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoskcp() {
        return noskcp;
    }

    /**
     * Sets the value of the noskcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoskcp(String value) {
        this.noskcp = value;
    }

    /**
     * Gets the value of the npwp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpwp() {
        return npwp;
    }

    /**
     * Sets the value of the npwp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpwp(String value) {
        this.npwp = value;
    }

    /**
     * Gets the value of the nrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrk() {
        return nrk;
    }

    /**
     * Sets the value of the nrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrk(String value) {
        this.nrk = value;
    }

    /**
     * Gets the value of the pathir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathir() {
        return pathir;
    }

    /**
     * Sets the value of the pathir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathir(String value) {
        this.pathir = value;
    }

    /**
     * Gets the value of the sepatu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSepatu() {
        return sepatu;
    }

    /**
     * Sets the value of the sepatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSepatu(BigDecimal value) {
        this.sepatu = value;
    }

    /**
     * Gets the value of the stawin property.
     * 
     * @return
     *     possible object is
     *     {@link StawinTbl }
     *     
     */
    public StawinTbl getStawin() {
        return stawin;
    }

    /**
     * Sets the value of the stawin property.
     * 
     * @param value
     *     allowed object is
     *     {@link StawinTbl }
     *     
     */
    public void setStawin(StawinTbl value) {
        this.stawin = value;
    }

    /**
     * Gets the value of the talhir property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTalhir() {
        return talhir;
    }

    /**
     * Sets the value of the talhir property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTalhir(XMLGregorianCalendar value) {
        this.talhir = value;
    }

    /**
     * Gets the value of the tgsk property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTgsk() {
        return tgsk;
    }

    /**
     * Sets the value of the tgsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTgsk(XMLGregorianCalendar value) {
        this.tgsk = value;
    }

    /**
     * Gets the value of the tgskcp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTgskcp() {
        return tgskcp;
    }

    /**
     * Sets the value of the tgskcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTgskcp(XMLGregorianCalendar value) {
        this.tgskcp = value;
    }

    /**
     * Gets the value of the thtno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThtno() {
        return thtno;
    }

    /**
     * Sets the value of the thtno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThtno(String value) {
        this.thtno = value;
    }

    /**
     * Gets the value of the tinggi property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTinggi() {
        return tinggi;
    }

    /**
     * Sets the value of the tinggi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTinggi(Short value) {
        this.tinggi = value;
    }

    /**
     * Gets the value of the tmtcp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmtcp() {
        return tmtcp;
    }

    /**
     * Sets the value of the tmtcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmtcp(XMLGregorianCalendar value) {
        this.tmtcp = value;
    }

    /**
     * Gets the value of the ttmasker property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTtmasker() {
        return ttmasker;
    }

    /**
     * Sets the value of the ttmasker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTtmasker(Short value) {
        this.ttmasker = value;
    }

    /**
     * Gets the value of the warganegara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarganegara() {
        return warganegara;
    }

    /**
     * Sets the value of the warganegara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarganegara(String value) {
        this.warganegara = value;
    }

}
