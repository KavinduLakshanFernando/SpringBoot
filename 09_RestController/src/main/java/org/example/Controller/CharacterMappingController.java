package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
public class CharacterMappingController {
    @GetMapping(path = "test1/I???")
    public String test5(){
        return "Chatacter Mapping";
    }
    @GetMapping(path = "I???/test2")
    public String test6(){
        return "Chatacter Mapping test2";
    }
}
