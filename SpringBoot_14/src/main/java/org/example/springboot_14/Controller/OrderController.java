package org.example.springboot_14.Controller;

import org.example.springboot_14.dto.CustomerDTO;
import org.example.springboot_14.dto.ItemDTO;
import org.example.springboot_14.entity.Customer;
import org.example.springboot_14.service.CustomerService;
import org.example.springboot_14.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
@CrossOrigin(origins = "http://localhost:63342")
public class OrderController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ItemService itemService;

    @GetMapping("getCId")
    public List<String> getCustomerID(){
        return customerService.getAllCustomerIDS();
    }

    @GetMapping("getCData/{id}")
    public CustomerDTO getCustomrData(@PathVariable String id){
        return customerService.getCustomerData(id);
    }

    @GetMapping("getIid")
    public List<String> getItemIDs(){
        return itemService.getAllItemIDs();

    }

    @GetMapping("getIData/{iid}")
    public ItemDTO getItemData(@PathVariable String iid){
        return itemService.getItemData(iid);
    }
}
