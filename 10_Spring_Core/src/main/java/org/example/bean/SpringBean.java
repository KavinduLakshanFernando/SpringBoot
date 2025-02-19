package org.example.bean;

import org.springframework.stereotype.Component;

@Component("bean2")
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean constructor");
    }
    public void sayHello() {
        System.out.println("Hello Spring Bean");
    }
}
