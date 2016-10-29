package client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import webservices.Product;
import webservices.ProductService;

public class ProductFinder {
    
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Product productPort = productService.getProductPort();
    
        Map<String, Object> requestContext = ((BindingProvider) productPort).getRequestContext();
        
        Map<String, List<String>> headers = new HashMap();
        headers.put("Username", Collections.singletonList("admin"));
        headers.put("Password", Collections.singletonList("admin123"));
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
    
        List<String> strings = productPort.listProductCategories();
    
        System.err.println("==>>>" + strings);
    }
}
