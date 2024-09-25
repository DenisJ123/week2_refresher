package ie.atu.week2;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class Controller {
    Service service = new Service();

    @GetMapping("/get")
    public List<Product> getProducts() {
        return service.getProductList();
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

}
