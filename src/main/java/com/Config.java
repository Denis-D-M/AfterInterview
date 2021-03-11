package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com")
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public Person person(){
        Person person = new Person();
        person.name = "Denis";
        return  person;
    }

}
