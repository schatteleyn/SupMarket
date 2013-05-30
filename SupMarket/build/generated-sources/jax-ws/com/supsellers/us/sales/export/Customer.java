
package com.supsellers.us.sales.export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour customer complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="custCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custCityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custCreditLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custEffFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="custEffTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="custEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custIncomeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custMainPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custMaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSrcId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custStateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custStateProvinceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custTotalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custYearOfBirth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "countryId",
    "custCity",
    "custCityId",
    "custCreditLimit",
    "custEffFrom",
    "custEffTo",
    "custEmail",
    "custFirstName",
    "custGender",
    "custId",
    "custIncomeLevel",
    "custLastName",
    "custMainPhoneNumber",
    "custMaritalStatus",
    "custPostalCode",
    "custSrcId",
    "custStateProvince",
    "custStateProvinceId",
    "custStreetAddress",
    "custTotal",
    "custTotalId",
    "custValid",
    "custYearOfBirth"
})
public class Customer {

    protected Long countryId;
    protected String custCity;
    protected Integer custCityId;
    protected Integer custCreditLimit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar custEffFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar custEffTo;
    protected String custEmail;
    protected String custFirstName;
    protected String custGender;
    protected Integer custId;
    protected String custIncomeLevel;
    protected String custLastName;
    protected String custMainPhoneNumber;
    protected String custMaritalStatus;
    protected String custPostalCode;
    protected Integer custSrcId;
    protected String custStateProvince;
    protected Integer custStateProvinceId;
    protected String custStreetAddress;
    protected String custTotal;
    protected Integer custTotalId;
    protected String custValid;
    protected Integer custYearOfBirth;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 countryId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 countryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountryId(Long value) {
        this.countryId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCity() {
        return custCity;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCity(String value) {
        this.custCity = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custCityId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustCityId() {
        return custCityId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custCityId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustCityId(Integer value) {
        this.custCityId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custCreditLimit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustCreditLimit() {
        return custCreditLimit;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custCreditLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustCreditLimit(Integer value) {
        this.custCreditLimit = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custEffFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustEffFrom() {
        return custEffFrom;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custEffFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustEffFrom(XMLGregorianCalendar value) {
        this.custEffFrom = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custEffTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustEffTo() {
        return custEffTo;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custEffTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustEffTo(XMLGregorianCalendar value) {
        this.custEffTo = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustEmail(String value) {
        this.custEmail = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustFirstName() {
        return custFirstName;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustFirstName(String value) {
        this.custFirstName = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custGender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGender() {
        return custGender;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custGender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGender(String value) {
        this.custGender = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustId(Integer value) {
        this.custId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custIncomeLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIncomeLevel() {
        return custIncomeLevel;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custIncomeLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIncomeLevel(String value) {
        this.custIncomeLevel = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLastName() {
        return custLastName;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLastName(String value) {
        this.custLastName = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custMainPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMainPhoneNumber() {
        return custMainPhoneNumber;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custMainPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMainPhoneNumber(String value) {
        this.custMainPhoneNumber = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custMaritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMaritalStatus() {
        return custMaritalStatus;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custMaritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMaritalStatus(String value) {
        this.custMaritalStatus = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPostalCode() {
        return custPostalCode;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPostalCode(String value) {
        this.custPostalCode = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custSrcId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustSrcId() {
        return custSrcId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custSrcId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustSrcId(Integer value) {
        this.custSrcId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custStateProvince.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustStateProvince() {
        return custStateProvince;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custStateProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustStateProvince(String value) {
        this.custStateProvince = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custStateProvinceId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustStateProvinceId() {
        return custStateProvinceId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custStateProvinceId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustStateProvinceId(Integer value) {
        this.custStateProvinceId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custStreetAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustStreetAddress() {
        return custStreetAddress;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custStreetAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustStreetAddress(String value) {
        this.custStreetAddress = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTotal() {
        return custTotal;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTotal(String value) {
        this.custTotal = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custTotalId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustTotalId() {
        return custTotalId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custTotalId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustTotalId(Integer value) {
        this.custTotalId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustValid() {
        return custValid;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustValid(String value) {
        this.custValid = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 custYearOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustYearOfBirth() {
        return custYearOfBirth;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 custYearOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustYearOfBirth(Integer value) {
        this.custYearOfBirth = value;
    }

}
