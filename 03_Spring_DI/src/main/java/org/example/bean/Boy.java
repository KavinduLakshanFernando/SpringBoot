package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Qualifier("girl")
    @Autowired
    Aggrement girl;

    public Boy(){
        System.out.println("Boy constructor");
    }
    public void chatWithHer(){
//        Girl girl = new Girl();
        girl.chat();
    }
}
