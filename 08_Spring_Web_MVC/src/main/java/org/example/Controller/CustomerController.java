package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//WEB MVC
//MODEL ,VIEW ,CONTROLLER
@RestController
@RequestMapping("Customer")
public class CustomerController {

    @GetMapping
    public String getCustomer(){
        return "Customer Controller";
    }
}
