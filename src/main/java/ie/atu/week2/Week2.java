package ie.atu.week2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week2 {

    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }

}
