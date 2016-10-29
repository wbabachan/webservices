package services;

import java.util.List;

public interface ProductService {
    
    List<String> getProductCategories();
    
    List<String> getProducts(String category);
    
    boolean addProduct(String category, String product);
}
