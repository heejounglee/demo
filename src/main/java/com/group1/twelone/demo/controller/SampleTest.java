package com.group1.twelone.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleTest {

    @GetMapping ("/test")
    public String test() {
        System.out.println("Hello World");

        return "test";
    }
}
