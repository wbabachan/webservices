
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _AddProduct_QNAME = new QName("http://www.ourproducts.de", "addProduct");
    private final static QName _AddProductResponse_QNAME = new QName("http://www.ourproducts.de", "addProductResponse");
    private final static QName _ListAllProducts_QNAME = new QName("http://www.ourproducts.de", "listAllProducts");
    private final static QName _ListAllProductsResponse_QNAME = new QName("http://www.ourproducts.de", "listAllProductsResponse");
    private final static QName _ListProductCategories_QNAME = new QName("http://www.ourproducts.de", "listProductCategories");
    private final static QName _ListProductCategoriesResponse_QNAME = new QName("http://www.ourproducts.de", "listProductCategoriesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link ListAllProducts }
     * 
     */
    public ListAllProducts createListAllProducts() {
        return new ListAllProducts();
    }

    /**
     * Create an instance of {@link ListAllProductsResponse }
     * 
     */
    public ListAllProductsResponse createListAllProductsResponse() {
        return new ListAllProductsResponse();
    }

    /**
     * Create an instance of {@link ListProductCategories }
     * 
     */
    public ListProductCategories createListProductCategories() {
        return new ListProductCategories();
    }

    /**
     * Create an instance of {@link ListProductCategoriesResponse }
     * 
     */
    public ListProductCategoriesResponse createListProductCategoriesResponse() {
        return new ListProductCategoriesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ourproducts.de", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ourproducts.de", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ourproducts.de", name = "listAllProducts")
    public JAXBElement<ListAllProducts> createListAllProducts(ListAllProducts value) {
        return new JAXBElement<ListAllProducts>(_ListAllProducts_QNAME, ListAllProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ourproducts.de", name = "listAllProductsResponse")
    public JAXBElement<ListAllProductsResponse> createListAllProductsResponse(ListAllProductsResponse value) {
        return new JAXBElement<ListAllProductsResponse>(_ListAllProductsResponse_QNAME, ListAllProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ourproducts.de", name = "listProductCategories")
    public JAXBElement<ListProductCategories> createListProductCategories(ListProductCategories value) {
        return new JAXBElement<ListProductCategories>(_ListProductCategories_QNAME, ListProductCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ourproducts.de", name = "listProductCategoriesResponse")
    public JAXBElement<ListProductCategoriesResponse> createListProductCategoriesResponse(ListProductCategoriesResponse value) {
        return new JAXBElement<ListProductCategoriesResponse>(_ListProductCategoriesResponse_QNAME, ListProductCategoriesResponse.class, null, value);
    }

}
