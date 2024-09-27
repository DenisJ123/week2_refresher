package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class Controller {
    private List<Product> products = new ArrayList<>();
    Service service = new Service();

    @GetMapping("/get")
    public List<Product> getProducts() {
        return service.getProductList();
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
        products.add(product);
        return service.addProduct(product);
    }
    @DeleteMapping("/delete")
    public String deleteProductByPrice(@RequestParam double price) {
        Product productToRemove = null;

        // Find the product with the matching price
        for (Product product : products) {
            if (product.getPrice() == price) {
                productToRemove = product;
                break; // Stop after finding the first match
            }
        }

        // If a product is found, remove it
        if (productToRemove != null) {
            products.remove(productToRemove);
            return service.removeProduct(productToRemove); // Inform the service
        } else {
            return "Product not found!"; // Handle case when no product matches the price
        }

    }
    @PutMapping("/update")
    public String updateProduct(@RequestBody Product product) {
        products.add(product);
        return service.addProduct(product);
    }

}