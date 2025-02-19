package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig1.class})
public class AppConfig {
    @Bean
    public SpringBean SpringBean() {
        return new SpringBean();
    }

}
