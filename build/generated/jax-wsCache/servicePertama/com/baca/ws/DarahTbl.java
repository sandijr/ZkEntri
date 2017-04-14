
package com.baca.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for darahTbl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="darahTbl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="darah" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="jenis" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmdarah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pegawaiList" type="{http://ade.kang.com/}pegawai" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "darahTbl", propOrder = {
    "darah",
    "jenis",
    "nmdarah",
    "pegawaiList"
})
public class DarahTbl {

    protected Short darah;
    protected Short jenis;
    protected String nmdarah;
    @XmlElement(nillable = true)
    protected List<Pegawai> pegawaiList;

    /**
     * Gets the value of the darah property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDarah() {
        return darah;
    }

    /**
     * Sets the value of the darah property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDarah(Short value) {
        this.darah = value;
    }

    /**
     * Gets the value of the jenis property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getJenis() {
        return jenis;
    }

    /**
     * Sets the value of the jenis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setJenis(Short value) {
        this.jenis = value;
    }

    /**
     * Gets the value of the nmdarah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmdarah() {
        return nmdarah;
    }

    /**
     * Sets the value of the nmdarah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmdarah(String value) {
        this.nmdarah = value;
    }

    /**
     * Gets the value of the pegawaiList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pegawaiList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPegawaiList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pegawai }
     * 
     * 
     */
    public List<Pegawai> getPegawaiList() {
        if (pegawaiList == null) {
            pegawaiList = new ArrayList<Pegawai>();
        }
        return this.pegawaiList;
    }

}
