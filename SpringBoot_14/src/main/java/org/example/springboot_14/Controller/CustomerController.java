package org.example.springboot_14.Controller;
import org.example.springboot_14.dto.CustomerDTO;
import org.example.springboot_14.service.CustomerService;
import org.example.springboot_14.utill.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin(origins = "http://localhost:63342")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerService customerService;

    @GetMapping("getAll")
    public List<CustomerDTO> getCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping("save")
    public ResponseUtill saveCustomer(@RequestBody CustomerDTO customerDTO){
        boolean res = customerService.addCustomer(customerDTO);
        if (res){
            return new ResponseUtill(201,"Customer Added",null);

        }else {
            return new ResponseUtill(400,"Customer Not Added",null);
        }



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
