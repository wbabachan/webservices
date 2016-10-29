package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "Product", portName = "ProductPort", serviceName = "ProductService", targetNamespace = "http://www.ourproducts.de")
public interface ProductCatalog {

    @WebMethod(action = "categories", operationName = "listProductCategories")
    @WebResult(partName = "listOfCategories")
    List<String> getProductCategories();

    @WebMethod(action = "list", operationName = "listAllProducts")
    @WebResult(partName = "listOfProducts")
    List<String> getProducts(@WebParam(partName = "categoryName") String category);

    @WebMethod(action = "add", operationName = "addProduct")
    @WebResult(partName = "productAdded")
    boolean addProduct(@WebParam(partName = "categoryName") String category, @WebParam(partName = "productName") String product);

}
