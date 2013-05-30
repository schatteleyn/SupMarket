
package com.supsellers.us.sales.export;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SalesExportService", targetNamespace = "http://us.supsellers.com/sales/export", wsdlLocation = "file:/Users/schatteleyn/NetBeansProjects/SupMarket/src/conf/xml-resources/web-services/NewWebServiceFromWSDL/wsdl/supseller-paris.servme.fr_80/app/SalesExportService.wsdl")
public class SalesExportService
    extends Service
{

    private final static URL SALESEXPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException SALESEXPORTSERVICE_EXCEPTION;
    private final static QName SALESEXPORTSERVICE_QNAME = new QName("http://us.supsellers.com/sales/export", "SalesExportService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/schatteleyn/NetBeansProjects/SupMarket/src/conf/xml-resources/web-services/NewWebServiceFromWSDL/wsdl/supseller-paris.servme.fr_80/app/SalesExportService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SALESEXPORTSERVICE_WSDL_LOCATION = url;
        SALESEXPORTSERVICE_EXCEPTION = e;
    }

    public SalesExportService() {
        super(__getWsdlLocation(), SALESEXPORTSERVICE_QNAME);
    }

    public SalesExportService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SALESEXPORTSERVICE_QNAME, features);
    }

    public SalesExportService(URL wsdlLocation) {
        super(wsdlLocation, SALESEXPORTSERVICE_QNAME);
    }

    public SalesExportService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SALESEXPORTSERVICE_QNAME, features);
    }

    public SalesExportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SalesExportService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SalesExport
     */
    @WebEndpoint(name = "SalesExportPort")
    public SalesExport getSalesExportPort() {
        return super.getPort(new QName("http://us.supsellers.com/sales/export", "SalesExportPort"), SalesExport.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalesExport
     */
    @WebEndpoint(name = "SalesExportPort")
    public SalesExport getSalesExportPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://us.supsellers.com/sales/export", "SalesExportPort"), SalesExport.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SALESEXPORTSERVICE_EXCEPTION!= null) {
            throw SALESEXPORTSERVICE_EXCEPTION;
        }
        return SALESEXPORTSERVICE_WSDL_LOCATION;
    }

}