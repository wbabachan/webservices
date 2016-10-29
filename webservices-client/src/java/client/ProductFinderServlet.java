package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import webservices.Product;
import webservices.ProductService;

@WebServlet(name = "ProductFinder", urlPatterns = {"/ProductFinder"})
public class ProductFinderServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
    
            ProductService productService = new ProductService();
            Product productPort = productService.getProductPort();
    
            Map<String, Object> requestContext = ((BindingProvider) productPort).getRequestContext();
    
            Map<String, List<String>> headers = new HashMap();
            headers.put("Username", Collections.singletonList("admin"));
            headers.put("Password", Collections.singletonList("admin123"));
            requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
    
            List<String> strings = productPort.listProductCategories();
            for(String product : strings) {
                out.println("===> " + product);
                System.err.println("==>>> " + product);
            }
        }
    }
}
