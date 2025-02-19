package org.example;

import org.example.bean.Bean01;
import org.example.bean.Boy;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Boy boy = context.getBean(Boy.class);
        boy.chatWithHer();

        context.registerShutdownHook();


    }
}
