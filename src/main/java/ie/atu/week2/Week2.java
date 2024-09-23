package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

public class Week2 {

    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }
    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your name is " + name;
    }

    @GetMapping("/search")
    public String search(@RequestParam String search1, @RequestParam String search2)
    {
        return search1 + " " + search2;
    }
}
