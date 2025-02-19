package org.example;

import org.example.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.register(AppConfig.class);

//        Map<String, String> env = System.getenv();
//        for (Map.Entry<String, String> entry : env.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        Properties properties = System.getProperties();
//        for(String key : properties.stringPropertyNames()) {
//            System.out.println(key + ": " + properties.getProperty(key));
//        }
        context.registerShutdownHook();
    }
}
