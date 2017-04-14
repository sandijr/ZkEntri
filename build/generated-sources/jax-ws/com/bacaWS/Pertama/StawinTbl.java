
package com.bacaWS.Pertama;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stawinTbl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stawinTbl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IKeluarga" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pegawaiList" type="{http://ade.kang.com/}pegawai" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stawin" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="uraian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stawinTbl", propOrder = {
    "iKeluarga",
    "pegawaiList",
    "stawin",
    "uraian"
})
public class StawinTbl {

    @XmlElement(name = "IKeluarga")
    protected BigDecimal iKeluarga;
    @XmlElement(nillable = true)
    protected List<Pegawai> pegawaiList;
    protected Short stawin;
    protected String uraian;

    /**
     * Gets the value of the iKeluarga property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIKeluarga() {
        return iKeluarga;
    }

    /**
     * Sets the value of the iKeluarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIKeluarga(BigDecimal value) {
        this.iKeluarga = value;
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

    /**
     * Gets the value of the stawin property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStawin() {
        return stawin;
    }

    /**
     * Sets the value of the stawin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStawin(Short value) {
        this.stawin = value;
    }

    /**
     * Gets the value of the uraian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUraian() {
        return uraian;
    }

    /**
     * Sets the value of the uraian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUraian(String value) {
        this.uraian = value;
    }

}
