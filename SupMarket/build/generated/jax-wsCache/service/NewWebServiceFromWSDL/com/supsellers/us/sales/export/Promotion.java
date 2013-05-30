
package com.supsellers.us.sales.export;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour promotion complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="promotion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promoBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="promoCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="promoEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="promoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoSubcategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoSubcategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="promoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoTotalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotion", propOrder = {
    "promoBeginDate",
    "promoCategory",
    "promoCategoryId",
    "promoCost",
    "promoEndDate",
    "promoId",
    "promoName",
    "promoSubcategory",
    "promoSubcategoryId",
    "promoTotal",
    "promoTotalId"
})
public class Promotion {

    protected String promoBeginDate;
    protected String promoCategory;
    protected Integer promoCategoryId;
    protected BigDecimal promoCost;
    protected String promoEndDate;
    protected Integer promoId;
    protected String promoName;
    protected String promoSubcategory;
    protected Integer promoSubcategoryId;
    protected String promoTotal;
    protected Integer promoTotalId;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoBeginDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoBeginDate() {
        return promoBeginDate;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoBeginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoBeginDate(String value) {
        this.promoBeginDate = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCategory() {
        return promoCategory;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCategory(String value) {
        this.promoCategory = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoCategoryId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromoCategoryId() {
        return promoCategoryId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoCategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromoCategoryId(Integer value) {
        this.promoCategoryId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromoCost() {
        return promoCost;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromoCost(BigDecimal value) {
        this.promoCost = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoEndDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoEndDate() {
        return promoEndDate;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoEndDate(String value) {
        this.promoEndDate = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromoId() {
        return promoId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromoId(Integer value) {
        this.promoId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoName(String value) {
        this.promoName = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoSubcategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoSubcategory() {
        return promoSubcategory;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoSubcategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoSubcategory(String value) {
        this.promoSubcategory = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoSubcategoryId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromoSubcategoryId() {
        return promoSubcategoryId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoSubcategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromoSubcategoryId(Integer value) {
        this.promoSubcategoryId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoTotal() {
        return promoTotal;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoTotal(String value) {
        this.promoTotal = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 promoTotalId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromoTotalId() {
        return promoTotalId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 promoTotalId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromoTotalId(Integer value) {
        this.promoTotalId = value;
    }

}
