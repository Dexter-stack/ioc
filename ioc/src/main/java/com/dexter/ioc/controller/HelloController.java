package com.dexter.ioc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
    //or
    @GetMapping("/")
    public String helloworld(){
        return "Welcome  to Dexter aaa ddd dexet";

    }

}
