package org.example.springboot_14.Controller;


import org.example.springboot_14.entity.Customer;
import org.example.springboot_14.service.CustomerService;
import org.example.springboot_14.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/placeOrder")
@CrossOrigin(origins = "http://localhost:63342")
public class PlaceOrderController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("getCId")
    public List<String> getCustomerID(){
        return customerService.getAllCustomerIDS();
    }

    @GetMapping("getCData/{id}")
    public Customer getCustomrData(@PathVariable String id){
        return (Customer) customerService.getCustomerData(id);
    }
}
