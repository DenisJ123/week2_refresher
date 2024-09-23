package ie.atu.week2;


import org.springframework.web.bind.annotation.*;

import java.util.List;

private List< productlist = new ArrayLists<Product>();
@RestController
public class Week2 {

    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your name is ";
    }

    @GetMapping("/search")
    public String search(@RequestParam String search1, @RequestParam String search2)
    {
        return search1 + " " + search2;
    }

    @GetMapping
    public List<Product> getProductList()
    {
        return ProductList;
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        productlist.add(product);
        return product;
    }

}
