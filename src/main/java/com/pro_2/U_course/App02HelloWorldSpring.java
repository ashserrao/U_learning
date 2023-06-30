package com.pro_2.U_course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //Launch spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println("My name is " + context.getBean("name"));
        System.out.println("I'm " + context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

    }
}
