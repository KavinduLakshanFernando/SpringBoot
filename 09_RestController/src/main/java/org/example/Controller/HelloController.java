package org.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String sayHello(){
        return "helloooo";
    }
    @PostMapping
    public String sayHelloPost(){
        return "helloooo post";
    }
    @PutMapping
    public String sayHelloPut(){
        return "helloooo Put";
    }
    @DeleteMapping
    public String sayHelloDelete(){
        return "helloooo Delete";
    }
}
