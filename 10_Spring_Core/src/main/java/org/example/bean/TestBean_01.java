package org.example.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component
@Scope("prototype")
public class TestBean_01 {
    public TestBean_01() {
        System.out.println("TestBean_01 constructor");
    }
}
