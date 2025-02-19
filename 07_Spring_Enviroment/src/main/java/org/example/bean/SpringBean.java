package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;

    @Value("${db.user}")
    private String userName;

    @Value("${db.password0}")
    private String password;

    public SpringBean(){
        System.out.println("constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(userName);
        System.out.println(password);
    }
}
