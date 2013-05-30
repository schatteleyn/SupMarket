
package com.supsellers.us.sales.export;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.supsellers.us.sales.export package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Promotion_QNAME = new QName("http://us.supsellers.com/sales/export", "promotion");
    private final static QName _GetFranceSales_QNAME = new QName("http://us.supsellers.com/sales/export", "getFranceSales");
    private final static QName _Product_QNAME = new QName("http://us.supsellers.com/sales/export", "product");
    private final static QName _GetFranceSalesResponse_QNAME = new QName("http://us.supsellers.com/sales/export", "getFranceSalesResponse");
    private final static QName _Sale_QNAME = new QName("http://us.supsellers.com/sales/export", "sale");
    private final static QName _Customer_QNAME = new QName("http://us.supsellers.com/sales/export", "customer");
    private final static QName _Channel_QNAME = new QName("http://us.supsellers.com/sales/export", "channel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.supsellers.us.sales.export
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link GetFranceSales }
     * 
     */
    public GetFranceSales createGetFranceSales() {
        return new GetFranceSales();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link GetFranceSalesResponse }
     * 
     */
    public GetFranceSalesResponse createGetFranceSalesResponse() {
        return new GetFranceSalesResponse();
    }

    /**
     * Create an instance of {@link Sale }
     * 
     */
    public Sale createSale() {
        return new Sale();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Promotion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://us.supsellers.com/sales/export", name = "promotion")
    public JAXBElement<Promotion> createPromotion(Promotion value) {
        return new JAXBElement<Promotion>(_Promotion_QNAME, Promotion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFranceSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://us.supsellers.com/sales/export", name = "getFranceSales")
    public JAXBElement<GetFranceSales> createGetFranceSales(GetFranceSales value) {
        return new JAXBElement<GetFranceSales>(_GetFranceSales_QNAME, GetFranceSales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://us.supsellers.com/sales/export", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFranceSalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://us.supsellers.com/sales/export", name = "getFranceSalesResponse")
    public JAXBElement<GetFranceSalesResponse> createGetFranceSalesResponse(GetFranceSalesResponse value) {
        return new JAXBElement<GetFranceSalesResponse>(_GetFranceSalesResponse_QNAME, GetFranceSalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://us.supsellers.com/sales/export", name = "sale")
    public JAXBElement<Sale> createSale(Sale value) {
        return new JAXBElement<Sale>(_Sale_QNAME, Sale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://us.supsellers.com/sales/export", name = "customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Channel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://us.supsellers.com/sales/export", name = "channel")
    public JAXBElement<Channel> createChannel(Channel value) {
        return new JAXBElement<Channel>(_Channel_QNAME, Channel.class, null, value);
    }

}
