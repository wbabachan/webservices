package webservices;

import services.ProductService;
import services.ProductServiceImpl;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "webservices.ProductCatalog", name = "Product", portName = "ProductPort", serviceName = "ProductService", targetNamespace = "http://www.ourproducts.de")
public class ProductCatalogImpl implements ProductCatalog {

    @Resource
    private WebServiceContext webServiceContext;

    ProductService productService = new ProductServiceImpl();

    @Override
    public List<String> getProductCategories() {
        if (!authenticate()) {
            return new ArrayList();
        }
        return productService.getProductCategories();
    }
    
    @Override
    public List<String> getProducts(String category) {
        if (!authenticate()) {
            return new ArrayList();
        }
        return productService.getProducts(category);
    }
    
    @Override
    public boolean addProduct(String category, String product) {
        if (!authenticate()) {
            return false;
        }
        return productService.addProduct(category, product);
    }

    private boolean authenticate() {
        boolean successful = false;
        MessageContext messageContext = webServiceContext.getMessageContext();

        Map requestHeaders = (Map)messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List)requestHeaders.get("Username");
        List passwordList = (List)requestHeaders.get("Password");

        if (userList != null && passwordList != null) {
            String username = (String)userList.get(0);
            String password = (String) passwordList.get(0);
            if (username.equals("admin") && password.equals("admin123")) {
                successful = true;
            }
        }

        return successful;
    }

}
