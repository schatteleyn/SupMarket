/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.models;

import com.supinfo.supmarket.entity.Countries;
import java.util.Date;

/**
 *
 * @author schatteleyn
 */
public class Customer {
    public Countries countryId;
    public Integer custId;
    public String custFirstName;
    public String custLastName;
    public Character custGender;
    public Short custYearOfBirth;
    public String custMaritalStatus;
    public String custStreetAddress;
    public String custPostalCode;
    public String custCity;
    public Integer custCityId;
    public String custStateProvince;
    public Integer custStateProvinceId;
    public String custMainPhoneNumber;
    public String custIncomeLevel;
    public Integer custCreditLimit;
    public String custEmail;
    public String custTotal;
    public Integer custTotalId;
    public Integer custSrcId;
    public Date custEffFrom;
    public Date custEffTo;
    public String custValid;

    public Customer(Countries countryId, Integer custId, String custFirstName, String custLastName, Character custGender, Short custYearOfBirth, String custMaritalStatus, String custStreetAddress, String custPostalCode, String custCity, Integer custCityId, String custStateProvince, Integer custStateProvinceId, String custMainPhoneNumber, String custIncomeLevel, Integer custCreditLimit, String custEmail, String custTotal, Integer custTotalId, Integer custSrcId, Date custEffFrom, Date custEffTo, String custValid) {
        this.countryId = countryId;
        this.custId = custId;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
        this.custGender = custGender;
        this.custYearOfBirth = custYearOfBirth;
        this.custMaritalStatus = custMaritalStatus;
        this.custStreetAddress = custStreetAddress;
        this.custPostalCode = custPostalCode;
        this.custCity = custCity;
        this.custCityId = custCityId;
        this.custStateProvince = custStateProvince;
        this.custStateProvinceId = custStateProvinceId;
        this.custMainPhoneNumber = custMainPhoneNumber;
        this.custIncomeLevel = custIncomeLevel;
        this.custCreditLimit = custCreditLimit;
        this.custEmail = custEmail;
        this.custTotal = custTotal;
        this.custTotalId = custTotalId;
        this.custSrcId = custSrcId;
        this.custEffFrom = custEffFrom;
        this.custEffTo = custEffTo;
        this.custValid = custValid;
    }
}
