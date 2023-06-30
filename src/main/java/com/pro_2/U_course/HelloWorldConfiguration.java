package com.pro_2.U_course;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){ };
record Address (String firstLine, String city){ };
@Configuration
public class HelloWorldConfiguration {
    // you can define spring beans
    // define the method of creating spring beans

    @Bean
    public String name(){
        return "Anush";
    }
    @Bean
    public int age(){
        return 23;
    }
    @Bean
    public Person person() {
        return new Person("Sachin", 22);
    }
    @Bean
    public Address address() {
        return new Address("First Line", "Blr");
    }
}
