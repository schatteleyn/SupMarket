/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarketjsf.managedbean;

import com.supinfo.supmarketjsf.entity.Sales;
import com.supinfo.supmarketjsf.service.SaleService;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author schatteleyn
 */
@ManagedBean
@RequestScoped
public class DashboardController {
    
    // Properties ---------------------------------------------------------------------------------
    
    @EJB
    private SaleService saleService;
    
    private String country;
    private String gender;
    private String status;
    private String income;

    @PersistenceContext 
    public EntityManager em;
    
    public DashboardController() {
    }
    
    // Actions ------------------------------------------------------------------------------------
    
    public String getTotalSale() {
        String totalSale = saleService.getTotalSales(country,gender,status,income);
        return totalSale;
    }
    
    public String getTotalAmountSold() {
        String totalAmountSold = saleService.getTotalAmountSold(country,gender,status,income);
        return totalAmountSold;
    }
    
    public List<Sales> getBestSelling() {
        List<Sales> bestSelling = saleService.getBestSellingProduct(country,gender,status,income);
        return bestSelling;
    }
    
    public List<Sales> getWorstSelling() {
        List<Sales> worstSelling = saleService.getWorstSellingProduct(country,gender,status,income);
        return worstSelling;
    }
    
    public List<Sales> getSalesByChannels() {
        List<Sales> salesByChannels = saleService.salesByChannels(country,gender,status,income);
        return salesByChannels;
    }
    public List<Sales> getSalesByCountries() {
        List<Sales> salesByCountries = saleService.salesByCountries(country,gender,status,income);
        return salesByCountries;
    }
    public List<Sales> getSalesByGenders() {
        List<Sales> salesByGenders = saleService.salesByGenders(country,gender,status,income);
        return salesByGenders;
    }
    public List<Sales> getSalesByIncome() {
        List<Sales> salesByIncome = saleService.salesByIncome(country,gender,status,income);
        return salesByIncome;
    }
    public List<Sales> getSalesByStatus() {
        List<Sales> salesByStatus = saleService.salesByMaritalStatus(country,gender,status,income);
        return salesByStatus;
    }
    public List<Sales> getMostLoyal() {
        List<Sales> mostLoyal = saleService.mostLoyal(country, gender, status, income);
        return mostLoyal;
    }
   
    public String submit(ActionEvent e) {
        return "./all.xhtml?faces-redirect=true";
    }
     
    // Getters/setters ----------------------------------------------------------------------------
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
