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

    public String removeProduct(Product product) {
        productList.remove(product);
        return "Product removed";
    }
    public String updateProduct(Product product) {
        int index = productList.indexOf(product);
        productList.set(index, product);
        return "Product updated";
    }
}