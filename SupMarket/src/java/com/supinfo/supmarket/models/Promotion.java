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
public class Promotion {
    public Integer promoId;
    public String promoName;
    public String promoSubcategory;
    public Integer promoSubcategoryId;
    public String promoCategory;
    public Integer promoCategoryId;
    public BigDecimal promoCost;
    public Date promoBeginDate;
    public Date promoEndDate;
    public String promoTotal;
    public Long promoTotalId;

    public Promotion(Integer promoId, String promoName, String promoSubcategory, Integer promoSubcategoryId, String promoCategory, Integer promoCategoryId, BigDecimal promoCost, Date promoBeginDate, Date promoEndDate, String promoTotal, Long promoTotalId) {
        this.promoId = promoId;
        this.promoName = promoName;
        this.promoSubcategory = promoSubcategory;
        this.promoSubcategoryId = promoSubcategoryId;
        this.promoCategory = promoCategory;
        this.promoCategoryId = promoCategoryId;
        this.promoCost = promoCost;
        this.promoBeginDate = promoBeginDate;
        this.promoEndDate = promoEndDate;
        this.promoTotal = promoTotal;
        this.promoTotalId = promoTotalId;
    }

}
