/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.api;

import com.supinfo.supmarket.service.SaleService;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author schatteleyn
 */
@Stateless
@Path("/")
public class RestApi {
    @EJB
    private SaleService saleService;
    
    @GET
    @Path("canada")
    @Produces(MediaType.APPLICATION_JSON)
    public Response canadaJson() {
        String canadaSales = saleService.getCanadaSales();
        return Response.ok(canadaSales).build();
    }
    
    @GET
    @Path("japan")
    @Produces("text/csv")
    public Response japanJson() {
        String japanSales = saleService.getJapanSales();
        return Response.ok(japanSales).build();
    }
}