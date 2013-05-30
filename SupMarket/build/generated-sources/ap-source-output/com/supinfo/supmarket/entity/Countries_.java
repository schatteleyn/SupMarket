package com.supinfo.supmarket.entity;

import com.supinfo.supmarket.entity.Customers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-23T18:52:45")
@StaticMetamodel(Countries.class)
public class Countries_ { 

    public static volatile SingularAttribute<Countries, Integer> countryId;
    public static volatile CollectionAttribute<Countries, Customers> customersCollection;
    public static volatile SingularAttribute<Countries, String> countryIsoCode;
    public static volatile SingularAttribute<Countries, String> countryName;
    public static volatile SingularAttribute<Countries, Integer> countryRegionId;
    public static volatile SingularAttribute<Countries, String> countryTotal;
    public static volatile SingularAttribute<Countries, Integer> countrySubregionId;
    public static volatile SingularAttribute<Countries, String> countrySubregion;
    public static volatile SingularAttribute<Countries, Integer> countryTotalId;
    public static volatile SingularAttribute<Countries, String> countryNameHist;
    public static volatile SingularAttribute<Countries, String> countryRegion;

}