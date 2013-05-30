/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author schatteleyn
 */
public class Result {
    public Channel channel;
    public Date timeId;
    public Product product;
    public Customer customer;
    public Promotion promotion;
    public BigDecimal quantitySold;
    public BigDecimal amountSold;
    public Integer saleId;

    public Result(Channel channel, Date timeId, Product product, Customer customer, Promotion promotion, BigDecimal quantitySold, BigDecimal amountSold, Integer saleId) {
        this.channel = channel;
        this.timeId = timeId;
        this.product = product;
        this.customer = customer;
        this.promotion = promotion;
        this.quantitySold = quantitySold;
        this.amountSold = amountSold;
        this.saleId = saleId;
    }
}
