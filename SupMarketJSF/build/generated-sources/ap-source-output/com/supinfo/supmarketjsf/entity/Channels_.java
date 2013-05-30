package com.supinfo.supmarketjsf.entity;

import com.supinfo.supmarketjsf.entity.Costs;
import com.supinfo.supmarketjsf.entity.Sales;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-05-22T15:17:41")
@StaticMetamodel(Channels.class)
public class Channels_ { 

    public static volatile SingularAttribute<Channels, String> channelDesc;
    public static volatile SingularAttribute<Channels, Integer> channelClassId;
    public static volatile SingularAttribute<Channels, String> channelTotal;
    public static volatile SingularAttribute<Channels, String> channelClass;
    public static volatile SingularAttribute<Channels, Integer> channelId;
    public static volatile SingularAttribute<Channels, Integer> channelTotalId;
    public static volatile CollectionAttribute<Channels, Sales> salesCollection;
    public static volatile CollectionAttribute<Channels, Costs> costsCollection;

}