/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.models;

/**
 *
 * @author schatteleyn
 */
public class Channel {
    public Integer channelId;
    public String channelDesc;
    public String channelClass;
    public Integer channelClassId;
    public String channelTotal;
    public Integer channelTotalId;

    public Channel(Integer channelId, String channelDesc, String channelClass, Integer channelClassId, String channelTotal, Integer channelTotalId) {
        this.channelId = channelId;
        this.channelDesc = channelDesc;
        this.channelClass = channelClass;
        this.channelClassId = channelClassId;
        this.channelTotal = channelTotal;
        this.channelTotalId = channelTotalId;
    }
    
    
}
