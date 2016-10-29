package services;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    
    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();
    
    public ProductServiceImpl() {
        
        bookList.add("GWT");
        bookList.add("Java");
        bookList.add("C++");
    
        musicList.add("Michael Jackson");
        musicList.add("Elvis Presley");
        musicList.add("John Lenon");
    
        movieList.add("Star Wars");
        movieList.add("Forest Gump");
        movieList.add("Space 1999");
        
    }
    
    @Override
    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }
    
    @Override
    public List<String> getProducts(String category) {
        switch (category.toLowerCase()) {
            case "books":
                return bookList;
            case "music":
                return musicList;
            case "movies":
                return movieList;
        }
        return null;
    }
    
    @Override
    public boolean addProduct(String category, String product) {
        switch (category.toLowerCase()) {
            case "books":
                bookList.add(product);
                break;
            case "music":
                musicList.add(product);
                break;
            case "movies":
                movieList.add(product);
                break;
        }
        return true;
    }
    
}
