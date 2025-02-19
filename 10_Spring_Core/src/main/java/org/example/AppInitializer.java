package org.example;

import org.example.bean.*;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        SpringBean springBean = new SpringBean();
//        springBean.sayHello();

//        SpringBean bean =context.getBean(SpringBean.class);
//        System.out.println(bean);
//
//        TestBean_01 testbean01 = context.getBean(TestBean_01.class);
//        System.out.println(testbean01);
//
//        TestBean_02 testbean02 = context.getBean(TestBean_02.class);
//        System.out.println(testbean02);

//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            public void run() {
//                System.out.println("shutdown");
//                context.close();
//            }
//        });

//        Object bean = context.getBean("bean");
//        System.out.println(bean);
//
//        TestBean_01 bean_01 = (TestBean_01) context.getBean("testBean_01");
//        System.out.println(bean_01);
//
//        TestBean_02 bean_02 = context.getBean("testBean_02", TestBean_02.class);
//        System.out.println(bean_02);
//
//        TestBean_03 bean_03 = context.getBean("testBean_03", TestBean_03.class);
//        System.out.println(bean_03);
//
//        MyConnection myConnection = (MyConnection) context.getBean("myConnection");
//        System.out.println(myConnection);
//
        context.registerShutdownHook();



//        TestBean_03 testbean03 = context.getBean(TestBean_03.class);
//        System.out.println(testbean03);

    }
}
