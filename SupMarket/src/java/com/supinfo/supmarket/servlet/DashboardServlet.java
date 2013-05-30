/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.servlet;

import com.supinfo.supmarket.entity.Sales;
import com.supinfo.supmarket.service.SaleService;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author schatteleyn
 */
@WebServlet(name = "DashboardServlet", urlPatterns = {"/all"})
public class DashboardServlet extends HttpServlet {
    
    @EJB
    private SaleService saleService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //  Parameters for filter
        // Either a string, or null
        
        final String countryParam = req.getParameter("country") != null ? req.getParameter("country") : null;
        final String genderParam = req.getParameter("gender") != null ? req.getParameter("gender") : null;
        final String statusParam = req.getParameter("status") != null ? req.getParameter("status") : null;
        final String incomeParam = req.getParameter("income") != null ? req.getParameter("income") : null;
        
        // Send datas for the graph
        
        Integer totalSales = saleService.getTotalSales(countryParam, genderParam, statusParam, incomeParam);
        BigDecimal amountSold = saleService.getTotalAmountSold(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> bestSoldProduct = saleService.getBestSellingProduct(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> worstSoldProduct = saleService.getWorstSellingProduct(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> salesByChannels = saleService.salesByChannels(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> salesByCountries = saleService.salesByCountries(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> salesByGenders = saleService.salesByGenders(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> salesByMaritalStatus = saleService.salesByMaritalStatus(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> salesByIncome = saleService.salesByIncome(countryParam, genderParam, statusParam, incomeParam);
        List<Sales> mostLoyal = saleService.mostLoyal(countryParam, genderParam, statusParam, incomeParam);

        
        req.setAttribute("totalSales", totalSales);
        req.setAttribute("amountSold", amountSold);
        req.setAttribute("bestSoldProduct", bestSoldProduct);
        req.setAttribute("worstSoldProduct", worstSoldProduct);
        req.setAttribute("salesByChannels", salesByChannels);
        req.setAttribute("salesByCountries", salesByCountries);
        req.setAttribute("salesByGenders", salesByGenders);
        req.setAttribute("salesByMaritalStatus", salesByMaritalStatus);
        req.setAttribute("salesByIncome", salesByIncome);
        req.setAttribute("mostLoyal", mostLoyal);
        
        req.getRequestDispatcher("/jsp/all.jsp").forward(req, resp);
    } 
}