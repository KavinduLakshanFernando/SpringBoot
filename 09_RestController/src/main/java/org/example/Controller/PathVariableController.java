package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {
    @GetMapping(path = "{id}")
    public String test1(@PathVariable("id") String id){
        return id;
    }

    @GetMapping(path = "{id}/{name}")
    public String test2(@PathVariable("id") String id,@PathVariable("name") String name){
        return id + " " + name;
    }

//    @GetMapping(path = "{id}:[A][0-9]{3}}")
//    public String test3(@PathVariable("id") String id){
//        return id;
//    }
}
