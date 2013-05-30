package com.supinfo.supmarket.entity;

import com.supinfo.supmarket.entity.Channels;
import com.supinfo.supmarket.entity.Customers;
import com.supinfo.supmarket.entity.Products;
import com.supinfo.supmarket.entity.Promotions;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-23T18:52:45")
@StaticMetamodel(Sales.class)
public class Sales_ { 

    public static volatile SingularAttribute<Sales, Customers> custId;
    public static volatile SingularAttribute<Sales, Promotions> promoId;
    public static volatile SingularAttribute<Sales, BigDecimal> amountSold;
    public static volatile SingularAttribute<Sales, Channels> channelId;
    public static volatile SingularAttribute<Sales, Integer> saleId;
    public static volatile SingularAttribute<Sales, Products> prodId;
    public static volatile SingularAttribute<Sales, BigDecimal> quantitySold;
    public static volatile SingularAttribute<Sales, Date> timeId;

}