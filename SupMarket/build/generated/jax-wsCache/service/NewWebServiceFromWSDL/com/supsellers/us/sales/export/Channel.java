
package com.supsellers.us.sales.export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour channel complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="channel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="channelDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="channelTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelTotalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel", propOrder = {
    "channelClass",
    "channelClassId",
    "channelDesc",
    "channelId",
    "channelTotal",
    "channelTotalId"
})
public class Channel {

    protected String channelClass;
    protected Integer channelClassId;
    protected String channelDesc;
    protected Integer channelId;
    protected String channelTotal;
    protected Integer channelTotalId;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 channelClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelClass() {
        return channelClass;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 channelClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelClass(String value) {
        this.channelClass = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 channelClassId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelClassId() {
        return channelClassId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 channelClassId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelClassId(Integer value) {
        this.channelClassId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 channelDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelDesc() {
        return channelDesc;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 channelDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelDesc(String value) {
        this.channelDesc = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 channelId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 channelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelId(Integer value) {
        this.channelId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 channelTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelTotal() {
        return channelTotal;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 channelTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelTotal(String value) {
        this.channelTotal = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 channelTotalId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelTotalId() {
        return channelTotalId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 channelTotalId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelTotalId(Integer value) {
        this.channelTotalId = value;
    }

}
