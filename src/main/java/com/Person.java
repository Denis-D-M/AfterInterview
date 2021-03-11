package com;

import org.springframework.stereotype.Component;

@Component
public class Person {
    String name;

    public void showName(){

        System.out.println("Hi, I'm " + name);
    }

    public void someMethod(){
        System.out.println(name + " is doing something");
    }

    @Logging
    public String returnSomeString(){
        return "Hello, I was returned";
    }

}
