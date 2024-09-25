package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class Controller {
    private List<Product> products = new ArrayList<Product>();

    @GetMapping("/get")
    public List<Product> getProducts() {
        return products;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
        products.add(product);
        return "Product Added";
    }

}
