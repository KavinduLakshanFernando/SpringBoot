package org.example.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class TestBean01 {
    public TestBean01() {
        System.out.println("TestBean01 constructor");
    }
}
