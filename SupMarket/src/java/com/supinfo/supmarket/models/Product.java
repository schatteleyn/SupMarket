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
public class Product {
  public Integer prodId;
  public String prodName;
  public String prodDesc;
  public String prodSubcategory;
  public Integer prodSubcategoryId;
  public String prodSubcategoryDesc;
  public String prodCategory;
  public Integer prodCategoryId;
  public String prodCategoryDesc;
  public Short prodWeightClass;
  public String prodUnitOfMeasure;
  public String prodPackSize;
  public Integer supplierId;
  public String prodStatus;
  public BigDecimal prodListPrice;
  public BigDecimal prodMinPrice;
  public String prodTotal;
  public Integer prodTotalId;
  public Integer prodSrcId;
  public Date prodEffFrom;
  public Date prodEffTo;
  public String prodValid;

    public Product(Integer prodId, String prodName, String prodDesc, String prodSubcategory, Integer prodSubcategoryId, String prodSubcategoryDesc, String prodCategory, Integer prodCategoryId, String prodCategoryDesc, Short prodWeightClass, String prodUnitOfMeasure, String prodPackSize, Integer supplierId, String prodStatus, BigDecimal prodListPrice, BigDecimal prodMinPrice, String prodTotal, Integer prodTotalId, Integer prodSrcId, Date prodEffFrom, Date prodEffTo, String prodValid) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodSubcategory = prodSubcategory;
        this.prodSubcategoryId = prodSubcategoryId;
        this.prodSubcategoryDesc = prodSubcategoryDesc;
        this.prodCategory = prodCategory;
        this.prodCategoryId = prodCategoryId;
        this.prodCategoryDesc = prodCategoryDesc;
        this.prodWeightClass = prodWeightClass;
        this.prodUnitOfMeasure = prodUnitOfMeasure;
        this.prodPackSize = prodPackSize;
        this.supplierId = supplierId;
        this.prodStatus = prodStatus;
        this.prodListPrice = prodListPrice;
        this.prodMinPrice = prodMinPrice;
        this.prodTotal = prodTotal;
        this.prodTotalId = prodTotalId;
        this.prodSrcId = prodSrcId;
        this.prodEffFrom = prodEffFrom;
        this.prodEffTo = prodEffTo;
        this.prodValid = prodValid;
    }
  
  
}
