/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarketjsf.api;

import com.supinfo.supmarketjsf.entity.User;
import com.supinfo.supmarketjsf.service.SaleService;
import com.supinfo.supmarketjsf.service.UserService;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
    private UserService userService;
    
    @GET
    @Path("canada.json")
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
     
    @POST
    @Path("loginApi")
    public Response LoginApi(String email, String password) {
        User user = userService.authenticateApi(email, password);
        return Response.ok(user).build();
    }
    
    @GET
    @Path("dashboard.json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response dashboardJson() {
        String dashboardJson = saleService.dashboardData();
        return Response.ok(dashboardJson).build();
    }
    
}
