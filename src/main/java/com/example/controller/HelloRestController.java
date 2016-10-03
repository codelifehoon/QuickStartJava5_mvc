package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloRestController {

    @RequestMapping("/rest")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    

    @RequestMapping("/rest/hellow")
    public String hellow() {  String a = "2222222222221111 "; return a;}
    
    @RequestMapping("/rest/hellow2")
    public String hellow2() { return "hellow res  t222";}
   

}