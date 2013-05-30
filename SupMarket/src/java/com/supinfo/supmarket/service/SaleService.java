/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.service;

import com.supinfo.supmarket.dao.SaleDao;
import com.supinfo.supmarket.entity.Sales;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author schatteleyn
 */
@Stateless
public class SaleService {
    
    @EJB
    private SaleDao saleDao;
    
     public String buildWhere(String country, String gender, String status, String income) {
         return saleDao.buildWhere(country, gender, status, income);
     }
     
     public Integer getTotalSales(String country, String gender, String status, String income) {
         return saleDao.getTotalSales(country, gender, status, income);
     }
     
     public BigDecimal getTotalAmountSold(String country, String gender, String status, String income) {
         return saleDao.getTotalAmountSold(country, gender, status, income);
     }
     
     public List<Sales> getBestSellingProduct(String country, String gender, String status, String income) {
         return saleDao.getBestSellingProduct(country, gender, status, income);
     }
     
     public List<Sales> getWorstSellingProduct(String country, String gender, String status, String income) {
         return saleDao.getWorstSellingProduct(country, gender, status, income);
     }
     
     public List<Sales> salesByChannels(String country, String gender, String status, String income) {
         return saleDao.salesByChannels(country, gender, status, income);
     }
     
     public List<Sales> salesByCountries(String country, String gender, String status, String income) {
         return saleDao.salesByCountries(country, gender, status, income);
     }
     
     public List<Sales> salesByGenders(String country, String gender, String status, String income) {
         return saleDao.salesByGenders(country, gender, status, income);
     }
     
     public List<Sales> salesByMaritalStatus(String country, String gender, String status, String income) {
         return saleDao.salesByMaritalStatus(country, gender, status, income);
     }
     
     public List<Sales> salesByIncome(String country, String gender, String status, String income) {
         return saleDao.salesByIncome(country, gender, status, income);
     }
     
     public List<Sales> mostLoyal(String country, String gender, String status, String income) {
         return saleDao.mostLoyal(country, gender, status, income);
     }
     
     public String getJapanSales() {
         return saleDao.getJapanSales();
     }
     
     public List<Sales> getFranceSales() {
         return saleDao.getFranceSales();
     }
     
     public String getCanadaSales() {
         return saleDao.getCanadaSales();
     }
    
}