
package com.supsellers.us.sales.export;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour product complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodCategoryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prodDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodEffFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodEffTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prodListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prodMinPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodPackSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodSrcId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prodStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodSubcategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodSubcategoryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodSubcategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prodTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodTotalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prodUnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodWeightClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "prodCategory",
    "prodCategoryDesc",
    "prodCategoryId",
    "prodDesc",
    "prodEffFrom",
    "prodEffTo",
    "prodId",
    "prodListPrice",
    "prodMinPrice",
    "prodName",
    "prodPackSize",
    "prodSrcId",
    "prodStatus",
    "prodSubcategory",
    "prodSubcategoryDesc",
    "prodSubcategoryId",
    "prodTotal",
    "prodTotalId",
    "prodUnitOfMeasure",
    "prodValid",
    "prodWeightClass",
    "supplierId"
})
public class Product {

    protected String prodCategory;
    protected String prodCategoryDesc;
    protected Integer prodCategoryId;
    protected String prodDesc;
    protected String prodEffFrom;
    protected String prodEffTo;
    protected Integer prodId;
    protected BigDecimal prodListPrice;
    protected BigDecimal prodMinPrice;
    protected String prodName;
    protected String prodPackSize;
    protected Integer prodSrcId;
    protected String prodStatus;
    protected String prodSubcategory;
    protected String prodSubcategoryDesc;
    protected Integer prodSubcategoryId;
    protected String prodTotal;
    protected Integer prodTotalId;
    protected String prodUnitOfMeasure;
    protected String prodValid;
    protected Integer prodWeightClass;
    protected Integer supplierId;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCategory() {
        return prodCategory;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCategory(String value) {
        this.prodCategory = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodCategoryDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCategoryDesc() {
        return prodCategoryDesc;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodCategoryDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCategoryDesc(String value) {
        this.prodCategoryDesc = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodCategoryId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdCategoryId() {
        return prodCategoryId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodCategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdCategoryId(Integer value) {
        this.prodCategoryId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdDesc() {
        return prodDesc;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdDesc(String value) {
        this.prodDesc = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodEffFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdEffFrom() {
        return prodEffFrom;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodEffFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdEffFrom(String value) {
        this.prodEffFrom = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodEffTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdEffTo() {
        return prodEffTo;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodEffTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdEffTo(String value) {
        this.prodEffTo = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdId() {
        return prodId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdId(Integer value) {
        this.prodId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodListPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProdListPrice() {
        return prodListPrice;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodListPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProdListPrice(BigDecimal value) {
        this.prodListPrice = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodMinPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProdMinPrice() {
        return prodMinPrice;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodMinPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProdMinPrice(BigDecimal value) {
        this.prodMinPrice = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdName(String value) {
        this.prodName = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodPackSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPackSize() {
        return prodPackSize;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodPackSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPackSize(String value) {
        this.prodPackSize = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodSrcId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdSrcId() {
        return prodSrcId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodSrcId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdSrcId(Integer value) {
        this.prodSrcId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdStatus() {
        return prodStatus;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdStatus(String value) {
        this.prodStatus = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodSubcategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdSubcategory() {
        return prodSubcategory;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodSubcategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdSubcategory(String value) {
        this.prodSubcategory = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodSubcategoryDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdSubcategoryDesc() {
        return prodSubcategoryDesc;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodSubcategoryDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdSubcategoryDesc(String value) {
        this.prodSubcategoryDesc = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodSubcategoryId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdSubcategoryId() {
        return prodSubcategoryId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodSubcategoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdSubcategoryId(Integer value) {
        this.prodSubcategoryId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdTotal() {
        return prodTotal;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdTotal(String value) {
        this.prodTotal = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodTotalId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdTotalId() {
        return prodTotalId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodTotalId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdTotalId(Integer value) {
        this.prodTotalId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodUnitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdUnitOfMeasure() {
        return prodUnitOfMeasure;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodUnitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdUnitOfMeasure(String value) {
        this.prodUnitOfMeasure = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdValid() {
        return prodValid;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdValid(String value) {
        this.prodValid = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 prodWeightClass.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdWeightClass() {
        return prodWeightClass;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 prodWeightClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdWeightClass(Integer value) {
        this.prodWeightClass = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 supplierId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 supplierId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierId(Integer value) {
        this.supplierId = value;
    }

}
