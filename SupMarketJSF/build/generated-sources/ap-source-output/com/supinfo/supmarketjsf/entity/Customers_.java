package com.supinfo.supmarketjsf.entity;

import com.supinfo.supmarketjsf.entity.Countries;
import com.supinfo.supmarketjsf.entity.Sales;
import com.supinfo.supmarketjsf.entity.SupplementaryDemographics;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-05-22T15:17:41")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, Integer> custId;
    public static volatile SingularAttribute<Customers, Countries> countryId;
    public static volatile SingularAttribute<Customers, String> custCity;
    public static volatile SingularAttribute<Customers, String> custMaritalStatus;
    public static volatile SingularAttribute<Customers, Integer> custCreditLimit;
    public static volatile SingularAttribute<Customers, String> custPostalCode;
    public static volatile SingularAttribute<Customers, String> custStateProvince;
    public static volatile SingularAttribute<Customers, String> custIncomeLevel;
    public static volatile SingularAttribute<Customers, Integer> custCityId;
    public static volatile SingularAttribute<Customers, String> custStreetAddress;
    public static volatile SingularAttribute<Customers, String> custLastName;
    public static volatile SingularAttribute<Customers, Date> custEffFrom;
    public static volatile SingularAttribute<Customers, Integer> custTotalId;
    public static volatile SingularAttribute<Customers, String> custFirstName;
    public static volatile SingularAttribute<Customers, String> custTotal;
    public static volatile SingularAttribute<Customers, Integer> custStateProvinceId;
    public static volatile SingularAttribute<Customers, Date> custEffTo;
    public static volatile SingularAttribute<Customers, String> custEmail;
    public static volatile SingularAttribute<Customers, String> custMainPhoneNumber;
    public static volatile CollectionAttribute<Customers, SupplementaryDemographics> supplementaryDemographicsCollection;
    public static volatile SingularAttribute<Customers, Short> custYearOfBirth;
    public static volatile SingularAttribute<Customers, Integer> custSrcId;
    public static volatile SingularAttribute<Customers, String> custValid;
    public static volatile CollectionAttribute<Customers, Sales> salesCollection;
    public static volatile SingularAttribute<Customers, Character> custGender;

}