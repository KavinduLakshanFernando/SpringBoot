package org.example.Controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formData")
public class FormDataController {
    @PostMapping
    public String test2(@RequestParam("id")String id){
        return id;
    }
//    @PostMapping
//    public String test3(@ModelAttribute CustomerDTO customerDTO){
//        return customerDTO.toString();
//
//    }
}
