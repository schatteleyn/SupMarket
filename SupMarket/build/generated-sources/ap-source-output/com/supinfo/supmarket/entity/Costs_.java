package com.supinfo.supmarket.entity;

import com.supinfo.supmarket.entity.Channels;
import com.supinfo.supmarket.entity.Products;
import com.supinfo.supmarket.entity.Promotions;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-23T18:52:45")
@StaticMetamodel(Costs.class)
public class Costs_ { 

    public static volatile SingularAttribute<Costs, Promotions> promoId;
    public static volatile SingularAttribute<Costs, BigDecimal> unitCost;
    public static volatile SingularAttribute<Costs, Channels> channelId;
    public static volatile SingularAttribute<Costs, Products> prodId;
    public static volatile SingularAttribute<Costs, BigDecimal> unitPrice;
    public static volatile SingularAttribute<Costs, Date> timeId;
    public static volatile SingularAttribute<Costs, Integer> costId;

}