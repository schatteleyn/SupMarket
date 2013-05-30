/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.dao.jpa;

import com.google.gson.Gson;
import com.supinfo.supmarket.dao.SaleDao;
import com.supinfo.supmarket.entity.Sales;
import com.supinfo.supmarket.models.Channel;
import com.supinfo.supmarket.models.Customer;
import com.supinfo.supmarket.models.Product;
import com.supinfo.supmarket.models.Promotion;
import com.supinfo.supmarket.models.Result;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author schatteleyn
 */
@Stateless
public class JpaSaleDao implements SaleDao {

    @PersistenceContext
    private EntityManager em;
    
    // Apparently, this does not work, but I can't find why
    @Override
    public String buildWhere(String country, String gender, String status, String income) {
        String whereQuery = " WHERE ";
        List<String> arg = null;
        if (country != null) { String c = " s.custId.countryId.countryName = " + country; arg.add(c);}
        if (gender != null) { String c = " s.custId.custGender = " + gender; arg.add(c); }
        if (status != null) { String c = " s.custId.custMaritalStatus = " + status; arg.add(c); }
        if (income != null) { String c = " s.custId.custIncomeLevel = " + income; arg.add(c); }
        
        if (arg.isEmpty()) { return ""; }
        else {
            for (String bar : arg) {
              if (!arg.get(0).equals(bar)) {
                  whereQuery += " AND" + bar;
              } else {
                  whereQuery += bar;
              }
            }
          return whereQuery;
        }
    }
        
    @Override
    public Integer getTotalSales(String country, String gender, String status, String income) {
        
        String queryString = "SELECT COUNT(s) FROM Sales s" /*+ buildWhere(country, gender, status, income)*/;
        String totalSales = em.createQuery(queryString).getSingleResult().toString();
        return Integer.parseInt(totalSales);
    }

    @Override
    public BigDecimal getTotalAmountSold(String country, String gender, String status, String income) {
        String queryString = "SELECT SUM(s.amountSold) FROM Sales s" /*+ buildWhere(country, gender, status, income)*/;
        String amountSold = em.createQuery(queryString).getSingleResult().toString();
        return new BigDecimal(amountSold);
    }

    @Override
    public List<Sales> getBestSellingProduct(String country, String gender, String status, String income) {
        String queryString = "SELECT s, SUM(s.quantitySold) as TotalNum FROM Sales s GROUP BY s.prodId.prodId ORDER BY TotalNum DESC";
        List<Sales> products = em.createQuery(queryString).setMaxResults(10).getResultList();
        return products;
    }

    @Override
    public List<Sales> getWorstSellingProduct(String country, String gender, String status, String income) {
        String queryString = "SELECT s, SUM(s.quantitySold) as TotalNum FROM Sales s GROUP BY s.prodId.prodId ORDER BY TotalNum";
        List<Sales> products = em.createQuery(queryString).setMaxResults(10).getResultList();
        return products;
    }
    
    @Override
    public List<Sales> salesByChannels(String country, String gender, String status, String income) {
        String queryString = "SELECT s, COUNT(s.saleId) FROM Sales s GROUP BY s.channelId.channelId";
        List<Sales> breakdown = em.createQuery(queryString).getResultList();
        return breakdown;
    }
    
    @Override
    public List<Sales> salesByCountries(String country, String gender, String status, String income) {
        String queryString = "SELECT s, COUNT(s.saleId) FROM Sales s  GROUP BY s.custId.countryId.countryId";
        List<Sales> breakdown = em.createQuery(queryString).getResultList();
        return breakdown;
    }
    @Override
    public List<Sales> LastSalesByCountries(Integer country) {
        String queryString = "SELECT s FROM Sales s WHERE s.custId.countryId.countryId = '"+ country +"' ORDER BY s.saleId DESC";
        List<Sales> breakdown = em.createQuery(queryString).setMaxResults(100).getResultList();
        return breakdown;
    }
    
    @Override
    public List<Sales> salesByGenders(String country, String gender, String status, String income) {
        String queryString = "SELECT s, COUNT(s.saleId) FROM Sales s GROUP BY s.custId.custGender";
        List<Sales> breakdown = em.createQuery(queryString).getResultList();
        return breakdown;
    }
    
    @Override
    public List<Sales> salesByMaritalStatus(String country, String gender, String status, String income) {
        String queryString = "SELECT s, COUNT(s.saleId) FROM Sales s GROUP BY s.custId.custMaritalStatus";
        List<Sales> breakdown = em.createQuery(queryString).getResultList();
        return breakdown;
    }
    
    @Override
    public List<Sales> salesByIncome(String country, String gender, String status, String income) {
        String queryString = "SELECT s, COUNT(s) AS total FROM Sales s GROUP BY s.custId.custIncomeLevel";
        List<Sales> breakdown = em.createQuery(queryString).getResultList();
        return breakdown;
    }
    
    @Override
    public List<Sales> mostLoyal(String country, String gender, String status, String income) {
        String queryString = "SELECT s, COUNT(s.saleId) as TotalNum FROM Sales s GROUP BY s.custId.custLastName ORDER BY TotalNum DESC";
        List<Sales> breakdown = em.createQuery(queryString).setMaxResults(10).getResultList();
        return breakdown;
    }

    @Override
    public String getJapanSales() {
        return generateCsvFile(); 
    }
    
    private String generateCsvFile() {

            StringBuilder writer = new StringBuilder();
            
            writer.append("timeId,");
            writer.append("quantitySold,");
            writer.append("AmountSold,");
            writer.append("saleId,");
            
            writer.append("prodId,");
            writer.append("prodName,");
            writer.append("prodDesc,");
            writer.append("prodSubcategory,");
            writer.append("prodSubcategoryId,");
            writer.append("prodSubcategoryDesc,");
            writer.append("prodCategory,");
            writer.append("prodCategoryId,");
            writer.append("prodCategoryDesc,");
            writer.append("prodWeightClass,");
            writer.append("prodUnitOfMeasure,");
            writer.append("prodPackSize,");
            writer.append("supplierId,");
            writer.append("prodStatus,");
            writer.append("prodListPrice,");
            writer.append("prodMinPrice,");
            writer.append("prodTotal,");
            writer.append("prodTotalId,");
            writer.append("prodSrcId,");
            writer.append("prodEffFrom,");
            writer.append("prodEffTo,");
            writer.append("prodValid,");
            
            writer.append("custId,");
            writer.append("custFirstName,");
            writer.append("custLastName,");
            writer.append("custGender,");
            writer.append("custYearOfBirth,");
            writer.append("custMaritalStatus,");
            writer.append("custStreetAddress,");
            writer.append("custPostalCode,");
            writer.append("custCity,");
            writer.append("custCityId,");
            writer.append("custStateProvince,");
            writer.append("custStateProvinceId,");
            writer.append("custMainPhoneNumber,");
            writer.append("custIncomeLevel,");
            writer.append("custCreditLimit,");
            writer.append("custEmail,");
            writer.append("custTotal,");
            writer.append("custTotalId,");
            writer.append("custSrcId,");
            writer.append("custEffFrom,");
            writer.append("custEffTo,");
            writer.append("custValid,");
            writer.append("countryId,");
            
            writer.append("promoId,");
            writer.append("promoName,");
            writer.append("promoSubcategory,");
            writer.append("promoSubcategoryId,");
            writer.append("promoCategory,");
            writer.append("promoCategoryId,");
            writer.append("promoCost,");
            writer.append("promoBeginDate,");
            writer.append("promoEndDate,");
            writer.append("promoTotal,");
            writer.append("promoTotalId,");
            
            writer.append("channelId,");
            writer.append("channelDesc,");
            writer.append("channelClass,");
            writer.append("channelClassId,");
            writer.append("channelTotal,");
            writer.append("channelTotalId");
            
            writer.append('\n');
            
            List<Sales> japanSales = LastSalesByCountries(52782);
            
            for (Sales sales : japanSales) {
               writer.append(sales.getTimeId()).append(",");
               writer.append(sales.getQuantitySold()).append(",");
               writer.append(sales.getAmountSold()).append(",");
               writer.append(sales.getSaleId()).append(",");
               
               writer.append(sales.getProdId().getProdId()).append(",");
               writer.append(sales.getProdId().getProdName()).append(",");
               writer.append(sales.getProdId().getProdDesc()).append(",");
               writer.append(sales.getProdId().getProdSubcategory()).append(",");
               writer.append(sales.getProdId().getProdSubcategoryId()).append(",");
               writer.append(sales.getProdId().getProdSubcategoryDesc()).append(",");
               writer.append(sales.getProdId().getProdCategory()).append(",");
               writer.append(sales.getProdId().getProdCategoryId()).append(",");
               writer.append(sales.getProdId().getProdCategoryDesc()).append(",");
               writer.append(sales.getProdId().getProdWeightClass()).append(",");
               writer.append(sales.getProdId().getProdUnitOfMeasure()).append(",");
               writer.append(sales.getProdId().getProdPackSize()).append(",");
               writer.append(sales.getProdId().getSupplierId()).append(",");
               writer.append(sales.getProdId().getProdStatus()).append(",");
               writer.append(sales.getProdId().getProdListPrice()).append(",");
               writer.append(sales.getProdId().getProdMinPrice()).append(",");
               writer.append(sales.getProdId().getProdTotal()).append(",");
               writer.append(sales.getProdId().getProdTotalId()).append(",");
               writer.append(sales.getProdId().getProdSrcId()).append(",");
               writer.append(sales.getProdId().getProdEffFrom()).append(",");
               writer.append(sales.getProdId().getProdEffTo()).append(",");
               writer.append(sales.getProdId().getProdValid()).append(",");
               
               writer.append(sales.getCustId().getCustId()).append(",");
               writer.append(sales.getCustId().getCustFirstName()).append(",");
               writer.append(sales.getCustId().getCustLastName()).append(",");
               writer.append(sales.getCustId().getCustGender()).append(",");
               writer.append(sales.getCustId().getCustYearOfBirth()).append(",");
               writer.append(sales.getCustId().getCustMaritalStatus()).append(",");
               writer.append(sales.getCustId().getCustStreetAddress()).append(",");
               writer.append(sales.getCustId().getCustPostalCode()).append(",");
               writer.append(sales.getCustId().getCustCity()).append(",");
               writer.append(sales.getCustId().getCustCityId()).append(",");
               writer.append(sales.getCustId().getCustStateProvince()).append(",");
               writer.append(sales.getCustId().getCustStateProvinceId()).append(",");
               writer.append(sales.getCustId().getCustMainPhoneNumber()).append(",");
               String income = sales.getCustId().getCustIncomeLevel();
               income = income.replace(",", ".");
               writer.append(income).append(",");
               writer.append(sales.getCustId().getCustCreditLimit()).append(",");
               writer.append(sales.getCustId().getCustEmail()).append(",");
               writer.append(sales.getCustId().getCustTotal()).append(",");
               writer.append(sales.getCustId().getCustTotalId()).append(",");
               writer.append(sales.getCustId().getCustSrcId()).append(",");
               writer.append(sales.getCustId().getCustEffFrom()).append(",");
               writer.append(sales.getCustId().getCustEffTo()).append(",");
               writer.append(sales.getCustId().getCustValid()).append(",");
               writer.append(sales.getCustId().getCountryId().getCountryId()).append(",");
               
               writer.append(sales.getPromoId().getPromoId()).append(",");
               writer.append(sales.getPromoId().getPromoName()).append(",");
               writer.append(sales.getPromoId().getPromoSubcategory()).append(",");
               writer.append(sales.getPromoId().getPromoSubcategoryId()).append(",");
               writer.append(sales.getPromoId().getPromoCategory()).append(",");
               writer.append(sales.getPromoId().getPromoCategoryId()).append(",");
               writer.append(sales.getPromoId().getPromoCost()).append(",");
               writer.append(sales.getPromoId().getPromoBeginDate()).append(",");
               writer.append(sales.getPromoId().getPromoEndDate()).append(",");
               writer.append(sales.getPromoId().getPromoTotal()).append(",");
               writer.append(sales.getPromoId().getPromoTotalId()).append(",");
               
               writer.append(sales.getChannelId().getChannelId()).append(",");
               writer.append(sales.getChannelId().getChannelDesc()).append(",");
               writer.append(sales.getChannelId().getChannelClass()).append(",");
               writer.append(sales.getChannelId().getChannelClassId()).append(",");
               writer.append(sales.getChannelId().getChannelTotal()).append(",");
               writer.append(sales.getChannelId().getChannelTotalId());
               writer.append("\n");
            }
            return writer.toString();
    }

    @Override
    public List<Sales> getFranceSales() {
        return LastSalesByCountries(52779);
    }
    
    private String getJson() {
        List<Sales> canadaSales = LastSalesByCountries(52772);
       // I can't make Gson works so I had to did it all by hand. Fuck.
        
        // List<Result> data = null ;
       // Gson gson = new Gson();
       // for (Sales sales : canadaSales) {
       //     Channel channel = new Channel(sales.getChannelId().getChannelId(), sales.getChannelId().getChannelDesc(), sales.getChannelId().getChannelClass(), sales.getChannelId().getChannelClassId(), sales.getChannelId().getChannelTotal(), sales.getChannelId().getChannelTotalId());
       //     Product product = new Product(sales.getProdId().getProdId(), sales.getProdId().getProdName(), sales.getProdId().getProdDesc(), sales.getProdId().getProdSubcategory(), sales.getProdId().getProdSubcategoryId(), sales.getProdId().getProdSubcategoryDesc(), sales.getProdId().getProdCategory(), sales.getProdId().getProdCategoryId(),  sales.getProdId().getProdCategoryDesc(),  sales.getProdId().getProdWeightClass(), sales.getProdId().getProdUnitOfMeasure(), sales.getProdId().getProdPackSize(), sales.getProdId().getSupplierId(), sales.getProdId().getProdStatus(), sales.getProdId().getProdListPrice(), sales.getProdId().getProdMinPrice(), sales.getProdId().getProdTotal(), sales.getProdId().getProdTotalId(), sales.getProdId().getProdSrcId(), sales.getProdId().getProdEffFrom(), sales.getProdId().getProdEffTo(), sales.getProdId().getProdValid());
       //     Customer customer = new Customer(sales.getCustId().getCountryId(), sales.getCustId().getCustId(), sales.getCustId().getCustFirstName(), sales.getCustId().getCustLastName(), sales.getCustId().getCustGender(), sales.getCustId().getCustYearOfBirth(), sales.getCustId().getCustMaritalStatus(), sales.getCustId().getCustStreetAddress(), sales.getCustId().getCustPostalCode(), sales.getCustId().getCustCity(), sales.getCustId().getCustCityId(), sales.getCustId().getCustStateProvince(), sales.getCustId().getCustStateProvinceId(), sales.getCustId().getCustMainPhoneNumber(), sales.getCustId().getCustIncomeLevel(), sales.getCustId().getCustCreditLimit(), sales.getCustId().getCustEmail(), sales.getCustId().getCustTotal(), sales.getCustId().getCustTotalId(), sales.getCustId().getCustSrcId(), sales.getCustId().getCustEffFrom(), sales.getCustId().getCustEffTo(), sales.getCustId().getCustValid());
       //     Promotion promotion = new Promotion(sales.getPromoId().getPromoId(), sales.getPromoId().getPromoName(), sales.getPromoId().getPromoSubcategory(), sales.getPromoId().getPromoSubcategoryId(), sales.getPromoId().getPromoCategory(), sales.getPromoId().getPromoCategoryId(), sales.getPromoId().getPromoCost(), sales.getPromoId().getPromoBeginDate(), sales.getPromoId().getPromoEndDate(), sales.getPromoId().getPromoTotal(), sales.getPromoId().getPromoTotalId());
       //     Result result = new Result(channel, sales.getTimeId(), product, customer, promotion, sales.getQuantitySold(), sales.getAmountSold(), sales.getSaleId());
       //     data.add(result);
       // }
        
        StringBuilder writer = new StringBuilder();
        
        writer.append("[");
        for (Sales sales : canadaSales) {
            writer.append("{");
                writer.append("\"channel\":{");
                    writer.append("\"channelId\":").append(sales.getChannelId().getChannelId()).append(",");
                    writer.append("\"channelDesc\":").append("\""+sales.getChannelId().getChannelDesc().toString()+"\"").append(",");
                    writer.append("\"channelClass\":").append("\""+sales.getChannelId().getChannelClass()+"\"").append(",");
                    writer.append("\"channelClassId\":").append(sales.getChannelId().getChannelClassId()).append(",");
                    writer.append("\"channelTotal\":").append("\""+sales.getChannelId().getChannelTotal()+"\"").append(",");
                    writer.append("\"channelTotalId\":").append(sales.getChannelId().getChannelTotalId());
                writer.append("},\"timeId\":").append("\""+sales.getTimeId()+"\"").append(",");
                writer.append("\"product\":{");
                    writer.append("\"prodId\":").append(sales.getProdId().getProdId()).append(",");
                    writer.append("\"prodName\":").append("\""+sales.getProdId().getProdName()+"\"").append(",");
                    writer.append("\"prodDesc\":").append("\""+sales.getProdId().getProdDesc()+"\"").append(",");
                    writer.append("\"prodSubcategory\":").append("\""+sales.getProdId().getProdSubcategory()+"\"").append(",");
                    writer.append("\"prodSubcategoryId\":").append(sales.getProdId().getProdSubcategoryId()).append(",");
                    writer.append("\"prodSubcategoryDesc\":").append("\""+sales.getProdId().getProdSubcategoryDesc()+"\"").append(",");
                    writer.append("\"prodCategory\":").append("\""+sales.getProdId().getProdCategory()+"\"").append(",");
                    writer.append("\"prodCategoryId\":").append(sales.getProdId().getProdCategoryId()).append(",");
                    writer.append("\"prodCategoryDesc\":").append("\""+sales.getProdId().getProdCategory()+"\"").append(",");
                    writer.append("\"prodWeightClass\":").append(sales.getProdId().getProdWeightClass()).append(",");
                    writer.append("\"prodUnitOfMeasure\":").append("\""+sales.getProdId().getProdUnitOfMeasure()+"\"").append(",");
                    writer.append("\"prodPackSize\":").append("\""+sales.getProdId().getProdPackSize()+"\"").append(",");
                    writer.append("\"supplierId\":").append(sales.getProdId().getSupplierId()).append(",");
                    writer.append("\"prodStatus\":").append("\""+sales.getProdId().getProdStatus()+"\"").append(",");
                    writer.append("\"prodListPrice\":").append(sales.getProdId().getProdListPrice()).append(",");
                    writer.append("\"prodMinPrice\":").append(sales.getProdId().getProdMinPrice()).append(",");
                    writer.append("\"prodTotal\":").append("\""+sales.getProdId().getProdTotal()+"\"").append(",");
                    writer.append("\"prodTotalId\":").append(sales.getProdId().getProdTotalId()).append(",");
                    writer.append("\"prodSrcId\":").append(sales.getProdId().getProdSrcId()).append(",");
                    writer.append("\"prodEffFrom\":").append("\""+sales.getProdId().getProdEffFrom()+"\"").append(",");
                    writer.append("\"prodEffTo\":").append("\""+sales.getProdId().getProdEffTo()+"\"").append(",");
                    writer.append("\"prodValid\":").append("\""+sales.getProdId().getProdValid()+"\"");
                writer.append("},\"customer\":{");
                    writer.append("\"custId\":").append(sales.getCustId().getCustId()).append(",");
                    writer.append("\"custFirstName\":").append("\""+sales.getCustId().getCustFirstName()+"\"").append(",");
                    writer.append("\"custLastName\":").append("\""+sales.getCustId().getCustLastName()+"\"").append(",");
                    writer.append("\"custGender\":").append("\""+sales.getCustId().getCustGender()+"\"").append(",");
                    writer.append("\"custYearOfBirth\":").append(sales.getCustId().getCustYearOfBirth()).append(",");
                    writer.append("\"custMaritalStatus\":").append("\""+sales.getCustId().getCustMaritalStatus()+"\"").append(",");
                    writer.append("\"custStreetAddress\":").append("\""+sales.getCustId().getCustStreetAddress()+"\"").append(",");
                    writer.append("\"custPostalCode\":").append("\""+sales.getCustId().getCustPostalCode()+"\"").append(",");
                    writer.append("\"custCity\":").append("\""+sales.getCustId().getCustCity()+"\"").append(",");
                    writer.append("\"custCityId\":").append(sales.getCustId().getCustCityId()).append(",");
                    writer.append("\"custStateProvince\":").append("\""+sales.getCustId().getCustStateProvince()+"\"").append(",");
                    writer.append("\"custStateProvinceId\":").append(sales.getCustId().getCustStateProvinceId()).append(",");
                    writer.append("\"custMainPhoneNumber\":").append("\""+sales.getCustId().getCustMainPhoneNumber()+"\"").append(",");
                    writer.append("\"custIncomeLevel\":").append("\""+sales.getCustId().getCustIncomeLevel()+"\"").append(",");
                    writer.append("\"custCreditLimit\":").append(sales.getCustId().getCustCreditLimit()).append(",");
                    writer.append("\"custEmail\":").append("\""+sales.getCustId().getCustEmail()+"\"").append(",");
                    writer.append("\"custTotal\":").append("\""+sales.getCustId().getCustTotal()+"\"").append(",");
                    writer.append("\"custTotalId\":").append(sales.getCustId().getCustTotalId()).append(",");
                    writer.append("\"custSrcId\":").append(sales.getCustId().getCustSrcId()).append(",");
                    writer.append("\"custEffFrom\":").append("\""+sales.getCustId().getCustEffFrom()+"\"").append(",");
                    writer.append("\"custEffTo\":").append("\""+sales.getCustId().getCustEffTo()+"\"").append(",");
                    writer.append("\"custValid\":").append("\""+sales.getCustId().getCustValid()+"\"").append(",");
                    writer.append("\"countryId\":").append(sales.getCustId().getCountryId().getCountryId());
                writer.append("},\"promotion\":{");
                    writer.append("\"promoId\":").append(sales.getPromoId().getPromoId()).append(",");
                    writer.append("\"promoName\":").append("\""+sales.getPromoId().getPromoName()+"\"").append(",");
                    writer.append("\"promoSubcategory\":").append("\""+sales.getPromoId().getPromoSubcategory()+"\"").append(",");
                    writer.append("\"promoSubcategoryId\":").append(sales.getPromoId().getPromoSubcategoryId()).append(",");
                    writer.append("\"promoCategory\":").append("\""+sales.getPromoId().getPromoCategory()+"\"").append(",");
                    writer.append("\"promoCategoryId\":").append(sales.getPromoId().getPromoCategoryId()).append(",");
                    writer.append("\"promoCost\":").append(sales.getPromoId().getPromoCost()).append(",");
                    writer.append("\"promoBeginDate\":").append("\""+sales.getPromoId().getPromoBeginDate()+"\"").append(",");
                    writer.append("\"promoEndDate\":").append("\""+sales.getPromoId().getPromoEndDate()+"\"").append(",");
                    writer.append("\"promoTotal\":").append("\""+sales.getPromoId().getPromoTotal()+"\"").append(",");
                    writer.append("\"promoTotalId\":").append(sales.getPromoId().getPromoTotalId());
               writer.append("},\"quantitySold\":").append(sales.getQuantitySold()).append(",");
               writer.append("\"amountSold\":").append(sales.getAmountSold()).append(",");
               writer.append("\"saleId\":").append(sales.getSaleId());
           writer.append("},");
        }
        writer.append("]");
        
        return writer.toString().replace(",]", "]");
    }

    @Override
    public String getCanadaSales() {
        return getJson();
    }
    
}