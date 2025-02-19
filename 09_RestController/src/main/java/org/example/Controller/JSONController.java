package org.example.Controller;

import org.example.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test1(@RequestBody CustomerDTO customerDTO) {
            return customerDTO.toString();
        }

        @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
        public CustomerDTO test2() {
            return new CustomerDTO("1", "John", 20);
        }

        @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
        public ArrayList<CustomerDTO> test3(){
            ArrayList<CustomerDTO> list = new ArrayList<>();
            list.add(new CustomerDTO("1", "John", 20));
            list.add(new CustomerDTO("2", "Jane", 21));
            list.add(new CustomerDTO("3", "Mark", 22));
            return list;
        }
    }
