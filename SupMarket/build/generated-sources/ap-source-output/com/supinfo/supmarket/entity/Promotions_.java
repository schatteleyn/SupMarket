package com.supinfo.supmarket.entity;

import com.supinfo.supmarket.entity.Costs;
import com.supinfo.supmarket.entity.Sales;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-23T18:52:45")
@StaticMetamodel(Promotions.class)
public class Promotions_ { 

    public static volatile SingularAttribute<Promotions, Integer> promoCategoryId;
    public static volatile SingularAttribute<Promotions, Integer> promoId;
    public static volatile SingularAttribute<Promotions, String> promoSubcategory;
    public static volatile SingularAttribute<Promotions, Long> promoTotalId;
    public static volatile SingularAttribute<Promotions, String> promoTotal;
    public static volatile SingularAttribute<Promotions, Date> promoEndDate;
    public static volatile SingularAttribute<Promotions, Date> promoBeginDate;
    public static volatile CollectionAttribute<Promotions, Sales> salesCollection;
    public static volatile CollectionAttribute<Promotions, Costs> costsCollection;
    public static volatile SingularAttribute<Promotions, String> promoName;
    public static volatile SingularAttribute<Promotions, BigDecimal> promoCost;
    public static volatile SingularAttribute<Promotions, Integer> promoSubcategoryId;
    public static volatile SingularAttribute<Promotions, String> promoCategory;

}