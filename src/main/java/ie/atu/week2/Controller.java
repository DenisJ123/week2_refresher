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

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        Product productToUpdate = null;

        // Find the product by its id
        for (Product product : products) {
            if (product.getId() == id) {
                productToUpdate = product;
                break;
            }
        }

        // If the product is found, update its details
        if (productToUpdate != null) {
            productToUpdate.setName(updatedProduct.getName());
            productToUpdate.setPrice(updatedProduct.getPrice());

            return "Product with id " + id + " updated successfully: " + productToUpdate;
        } else {
            return "Product with id " + id + " not found!";
        }
    }


    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        Product productToRemove = null;

        // Find the product by its id
        for (Product product : products) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }

        // If the product is found, remove it
        if (productToRemove != null) {
            products.remove(productToRemove);
            return service.removeProduct(productToRemove); // Inform the service
        } else {
            return "Product with id " + id + " not found!";
        }
    }

}