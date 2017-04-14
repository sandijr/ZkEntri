
package com.bacaWS.Pertama;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sukuTbl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sukuTbl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kdsuku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lokal" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmsuku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "sukuTbl", propOrder = {
    "kdsuku",
    "lokal",
    "nmsuku",
    "pegawaiList"
})
public class SukuTbl {

    protected String kdsuku;
    protected Short lokal;
    protected String nmsuku;
    @XmlElement(nillable = true)
    protected List<Pegawai> pegawaiList;

    /**
     * Gets the value of the kdsuku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdsuku() {
        return kdsuku;
    }

    /**
     * Sets the value of the kdsuku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdsuku(String value) {
        this.kdsuku = value;
    }

    /**
     * Gets the value of the lokal property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLokal() {
        return lokal;
    }

    /**
     * Sets the value of the lokal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLokal(Short value) {
        this.lokal = value;
    }

    /**
     * Gets the value of the nmsuku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsuku() {
        return nmsuku;
    }

    /**
     * Sets the value of the nmsuku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsuku(String value) {
        this.nmsuku = value;
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
