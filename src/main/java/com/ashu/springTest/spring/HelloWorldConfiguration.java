package com.ashu.springTest.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Adarsh";
    }
    @Bean(name = "Age")
    public int age(){
        return 29;
    }

    @Bean
    public Person person(){
        Person person = new Person("Ashu", 29);
        return person;
    }
}
