package com.ecom.emezon.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloController {
    @GetMapping("/")

    public String f(){
        return "Hello World";
    }
}
