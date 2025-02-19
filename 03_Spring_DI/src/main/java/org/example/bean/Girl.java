package org.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl implements Aggrement {

    public Girl(){
        System.out.println("girl constructor");
    }
    public void chat(){
        System.out.println("chating.....");
    }
}
