
package com.supsellers.us.sales.export;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour sale complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountSold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element ref="{http://us.supsellers.com/sales/export}channel" minOccurs="0"/>
 *         &lt;element ref="{http://us.supsellers.com/sales/export}customer" minOccurs="0"/>
 *         &lt;element ref="{http://us.supsellers.com/sales/export}product" minOccurs="0"/>
 *         &lt;element ref="{http://us.supsellers.com/sales/export}promotion" minOccurs="0"/>
 *         &lt;element name="quantitySold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sale", propOrder = {
    "amountSold",
    "channel",
    "customer",
    "product",
    "promotion",
    "quantitySold",
    "saleId",
    "timeId"
})
public class Sale {

    protected BigDecimal amountSold;
    @XmlElement(namespace = "http://us.supsellers.com/sales/export")
    protected Channel channel;
    @XmlElement(namespace = "http://us.supsellers.com/sales/export")
    protected Customer customer;
    @XmlElement(namespace = "http://us.supsellers.com/sales/export")
    protected Product product;
    @XmlElement(namespace = "http://us.supsellers.com/sales/export")
    protected Promotion promotion;
    protected BigDecimal quantitySold;
    protected Integer saleId;
    protected String timeId;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 amountSold.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountSold() {
        return amountSold;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 amountSold.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountSold(BigDecimal value) {
        this.amountSold = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 channel.
     * 
     * @return
     *     possible object is
     *     {@link Channel }
     *     
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 channel.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel }
     *     
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 customer.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 customer.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promotion.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promotion.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 quantitySold.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantitySold() {
        return quantitySold;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 quantitySold.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantitySold(BigDecimal value) {
        this.quantitySold = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 saleId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaleId() {
        return saleId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 saleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaleId(Integer value) {
        this.saleId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 timeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeId() {
        return timeId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 timeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeId(String value) {
        this.timeId = value;
    }

}
