
package com.bacaWS.Pertama;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kelkerTbl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kelkerTbl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kelker" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmkelker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "kelkerTbl", propOrder = {
    "kelker",
    "nmkelker",
    "pegawaiList"
})
public class KelkerTbl {

    protected Short kelker;
    protected String nmkelker;
    @XmlElement(nillable = true)
    protected List<Pegawai> pegawaiList;

    /**
     * Gets the value of the kelker property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKelker() {
        return kelker;
    }

    /**
     * Sets the value of the kelker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKelker(Short value) {
        this.kelker = value;
    }

    /**
     * Gets the value of the nmkelker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmkelker() {
        return nmkelker;
    }

    /**
     * Sets the value of the nmkelker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmkelker(String value) {
        this.nmkelker = value;
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
