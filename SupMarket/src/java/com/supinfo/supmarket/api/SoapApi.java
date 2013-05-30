/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.api;

import com.supinfo.supmarket.entity.Sales;
import com.supinfo.supmarket.service.SaleService;
import com.supsellers.us.sales.export.Channel;
import com.supsellers.us.sales.export.Customer;
import com.supsellers.us.sales.export.Product;
import com.supsellers.us.sales.export.Promotion;
import com.supsellers.us.sales.export.Sale;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author schatteleyn
 */
@WebService(serviceName = "SalesExportService", portName = "SalesExportPort", endpointInterface = "com.supsellers.us.sales.export.SalesExport", targetNamespace = "http://us.supsellers.com/sales/export", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/supseller-paris.servme.fr_80/app/SalesExportService.wsdl")
@Stateless
public class SoapApi {
    @EJB
    private SaleService saleService;
    
        public List<com.supsellers.us.sales.export.Sale> getFranceSales() {
        List<Sales> franceSales = saleService.getFranceSales();
        ArrayList<Sale> result = new ArrayList<com.supsellers.us.sales.export.Sale>();
        for (Sales sales : franceSales) {
            Sale exportSale = new com.supsellers.us.sales.export.Sale();
            exportSale.setAmountSold(sales.getAmountSold());
            
            Channel channel = new com.supsellers.us.sales.export.Channel();
            channel.setChannelClass(sales.getChannelId().getChannelClass());
            channel.setChannelClassId(sales.getChannelId().getChannelClassId());
            channel.setChannelDesc(sales.getChannelId().getChannelDesc());
            channel.setChannelId(sales.getChannelId().getChannelId());
            channel.setChannelTotal(sales.getChannelId().getChannelTotal());
            channel.setChannelTotalId(sales.getChannelId().getChannelTotalId());
            exportSale.setChannel(channel);
            
            Customer customer = new com.supsellers.us.sales.export.Customer();
            customer.setCountryId(customer.getCountryId());
            customer.setCustCity(customer.getCustCity());
            customer.setCustCityId(customer.getCustCityId());
            customer.setCustCreditLimit(customer.getCustCreditLimit());
            customer.setCustEffFrom(customer.getCustEffFrom());
            customer.setCustEffTo(customer.getCustEffTo());
            customer.setCustEmail(customer.getCustEmail());
            customer.setCustFirstName(customer.getCustFirstName());
            customer.setCustLastName(customer.getCustLastName());
            customer.setCustGender(customer.getCustGender());
            customer.setCustId(customer.getCustId());
            customer.setCustIncomeLevel(customer.getCustIncomeLevel());
            customer.setCustMainPhoneNumber(customer.getCustMainPhoneNumber());
            customer.setCustMaritalStatus(customer.getCustMaritalStatus());
            customer.setCustPostalCode(customer.getCustPostalCode());
            customer.setCustSrcId(customer.getCustSrcId());
            customer.setCustStateProvince(customer.getCustStateProvince());
            customer.setCustStreetAddress(customer.getCustStreetAddress());
            customer.setCustTotal(customer.getCustTotal());
            customer.setCustTotalId(customer.getCustTotalId());
            customer.setCustValid(customer.getCustValid());
            customer.setCustYearOfBirth(customer.getCustYearOfBirth());
            
            Sale sale = new com.supsellers.us.sales.export.Sale();
            sale.setAmountSold(sale.getAmountSold());
            sale.setChannel(sale.getChannel());
            sale.setCustomer(sale.getCustomer());
            sale.setProduct(sale.getProduct());
            sale.setPromotion(sale.getPromotion());
            sale.setQuantitySold(sale.getAmountSold());
            sale.setSaleId(sale.getSaleId());
            sale.setTimeId(sale.getTimeId());
            
            Product product = new com.supsellers.us.sales.export.Product();
            product.setProdCategory(sale.getProduct().getProdCategory());
            product.setProdCategoryDesc(sale.getProduct().getProdCategoryDesc());
            product.setProdCategoryId(sale.getProduct().getProdCategoryId());
            product.setProdEffFrom(sale.getProduct().getProdEffFrom());
            product.setProdEffTo(sale.getProduct().getProdEffTo());
            product.setProdId(sale.getProduct().getProdId());
            product.setProdListPrice(sale.getProduct().getProdListPrice());
            product.setProdMinPrice(sale.getProduct().getProdMinPrice());
            product.setProdName(sale.getProduct().getProdName());
            product.setProdPackSize(sale.getProduct().getProdPackSize());
            product.setProdSrcId(sale.getProduct().getProdSrcId());
            product.setProdStatus(sale.getProduct().getProdStatus());
            product.setProdSubcategory(sale.getProduct().getProdSubcategory());
            product.setProdSubcategoryDesc(sale.getProduct().getProdSubcategoryDesc());
            product.setProdSubcategoryId(sale.getProduct().getProdSubcategoryId());
            product.setProdTotal(sale.getProduct().getProdTotal());
            product.setProdTotalId(sale.getProduct().getProdTotalId());
            product.setProdUnitOfMeasure(sale.getProduct().getProdUnitOfMeasure());
            product.setProdValid(sale.getProduct().getProdValid());
            product.setProdWeightClass(sale.getProduct().getProdWeightClass());
            product.setSupplierId(sale.getProduct().getSupplierId());
            
            Promotion promotion = new com.supsellers.us.sales.export.Promotion();
            promotion.setPromoBeginDate(sale.getPromotion().getPromoBeginDate());
            promotion.setPromoCategory(sale.getPromotion().getPromoCategory());
            promotion.setPromoCategoryId(sale.getPromotion().getPromoCategoryId());
            promotion.setPromoCost(sale.getPromotion().getPromoCost());
            promotion.setPromoEndDate(sale.getPromotion().getPromoEndDate());
            promotion.setPromoId(sale.getPromotion().getPromoId());
            promotion.setPromoName(sale.getPromotion().getPromoName());
            promotion.setPromoSubcategory(sale.getPromotion().getPromoSubcategory());
            promotion.setPromoSubcategoryId(sale.getPromotion().getPromoSubcategoryId());
            promotion.setPromoTotal(sale.getPromotion().getPromoTotal());
            promotion.setPromoTotalId(sale.getPromotion().getPromoTotalId());
            
            result.add(exportSale);
        }   
        return result;
    }   
}