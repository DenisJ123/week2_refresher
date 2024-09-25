package ie.atu.week2;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private List<Product> productList = new ArrayList<>();
    public List<Product> getProductList() {
        return productList;
    }
    public String addProduct(Product product) {
        productList.add(product);
        return "Product added";
    }
}
