package webservices;

import javax.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/webservices-1.0/ProductService", new ProductCatalogImpl());
    }
}
