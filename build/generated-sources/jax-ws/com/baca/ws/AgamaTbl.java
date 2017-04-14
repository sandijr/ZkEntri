
package com.baca.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agamaTbl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agamaTbl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kdagama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namaAgama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "agamaTbl", propOrder = {
    "kdagama",
    "namaAgama",
    "pegawaiList"
})
public class AgamaTbl {

    protected String kdagama;
    protected String namaAgama;
    @XmlElement(nillable = true)
    protected List<Pegawai> pegawaiList;

    /**
     * Gets the value of the kdagama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdagama() {
        return kdagama;
    }

    /**
     * Sets the value of the kdagama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdagama(String value) {
        this.kdagama = value;
    }

    /**
     * Gets the value of the namaAgama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaAgama() {
        return namaAgama;
    }

    /**
     * Sets the value of the namaAgama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaAgama(String value) {
        this.namaAgama = value;
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
