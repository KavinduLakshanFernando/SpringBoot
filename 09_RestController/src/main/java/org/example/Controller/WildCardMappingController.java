package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildcard")
public class WildCardMappingController {
    @GetMapping(path = "test1/*/hello")
    public String test3(){
        return "wildCard Mapping";
    }

    @GetMapping(path = "test2/*/*")
    public String test4(){
        return "wildCard 4 Mapping";
    }
}
