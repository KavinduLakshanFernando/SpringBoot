package org.example.springboot_13.Controller;

import org.example.springboot_13.dto.CustomerDTO;
import org.example.springboot_13.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerService customerService;

    @GetMapping("getAll")
    public List<CustomerDTO> getCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping("save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.addCustomer(customerDTO);
        return customerDTO.toString();
    }

    @PutMapping("update")
    public String updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.updateCustomer(customerDTO);
        return customerDTO.toString();
    }

    @DeleteMapping("delete/{id}")
    public String deleteCustomer(@PathVariable String id){
       return customerService.deleteCustomer(id);

    }
}
