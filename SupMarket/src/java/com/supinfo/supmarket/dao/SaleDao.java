/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.dao;

import com.supinfo.supmarket.entity.Sales;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author schatteleyn
 */
@Local
public interface SaleDao {
    
    String buildWhere(String country, String gender, String status, String income);
    
    Integer getTotalSales(String country, String gender, String status, String income);
    
    BigDecimal getTotalAmountSold(String country, String gender, String status, String income);
    
    List<Sales> getBestSellingProduct(String country, String gender, String status, String income);
    
    List<Sales> getWorstSellingProduct(String country, String gender, String status, String income);
    
    List<Sales> salesByChannels(String country, String gender, String status, String income);
    
    List<Sales> salesByCountries(String country, String gender, String status, String income);
    
    List<Sales> LastSalesByCountries(Integer country);
    
    List<Sales> salesByGenders(String country, String gender, String status, String income);
    
    List<Sales> salesByMaritalStatus(String country, String gender, String status, String income);
    
    List<Sales> salesByIncome(String country, String gender, String status, String income);
    
    List<Sales> mostLoyal(String country, String gender, String status, String income);
    
    String getJapanSales();
    
    List<Sales> getFranceSales();
    
    String getCanadaSales();
}
