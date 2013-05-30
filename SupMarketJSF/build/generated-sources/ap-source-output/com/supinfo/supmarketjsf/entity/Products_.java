package com.supinfo.supmarketjsf.entity;

import com.supinfo.supmarketjsf.entity.Costs;
import com.supinfo.supmarketjsf.entity.Sales;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-05-22T15:17:41")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> prodCategoryDesc;
    public static volatile SingularAttribute<Products, String> prodValid;
    public static volatile SingularAttribute<Products, Integer> supplierId;
    public static volatile SingularAttribute<Products, BigDecimal> prodMinPrice;
    public static volatile SingularAttribute<Products, Integer> prodId;
    public static volatile CollectionAttribute<Products, Costs> costsCollection;
    public static volatile SingularAttribute<Products, Date> prodEffFrom;
    public static volatile SingularAttribute<Products, String> prodTotal;
    public static volatile SingularAttribute<Products, BigDecimal> prodListPrice;
    public static volatile SingularAttribute<Products, Integer> prodCategoryId;
    public static volatile SingularAttribute<Products, String> prodStatus;
    public static volatile SingularAttribute<Products, Short> prodWeightClass;
    public static volatile SingularAttribute<Products, Integer> prodSrcId;
    public static volatile SingularAttribute<Products, String> prodUnitOfMeasure;
    public static volatile SingularAttribute<Products, String> prodName;
    public static volatile SingularAttribute<Products, String> prodSubcategoryDesc;
    public static volatile SingularAttribute<Products, String> prodDesc;
    public static volatile SingularAttribute<Products, String> prodCategory;
    public static volatile SingularAttribute<Products, Date> prodEffTo;
    public static volatile SingularAttribute<Products, Integer> prodSubcategoryId;
    public static volatile SingularAttribute<Products, String> prodPackSize;
    public static volatile CollectionAttribute<Products, Sales> salesCollection;
    public static volatile SingularAttribute<Products, Integer> prodTotalId;
    public static volatile SingularAttribute<Products, String> prodSubcategory;

}