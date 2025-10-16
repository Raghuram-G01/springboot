package com.raghu.hello.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello() {
        return "Hello Raghuram!,How are you? Have a great day!";
    }
    public String getMethodName(String param) {
        return "The name of the student is " + param;
    }
}
