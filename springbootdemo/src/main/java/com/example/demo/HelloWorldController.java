package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello World (again)!!!";
    }
    
    @RequestMapping(value={"", "/", "/index"})
    @ResponseBody
    String index() {
        return "This is the index page";
    }
    
}
