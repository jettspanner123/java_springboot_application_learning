package com.uddeshyaSingh.MyFirstApplciation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClassification {


    @GetMapping("say_hello")
    public String sayHello() {
        return "Hello world";
    }
}
