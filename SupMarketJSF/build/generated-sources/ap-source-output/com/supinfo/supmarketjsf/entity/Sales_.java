package com.supinfo.supmarketjsf.entity;

import com.supinfo.supmarketjsf.entity.Channels;
import com.supinfo.supmarketjsf.entity.Customers;
import com.supinfo.supmarketjsf.entity.Products;
import com.supinfo.supmarketjsf.entity.Promotions;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-05-22T15:17:41")
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