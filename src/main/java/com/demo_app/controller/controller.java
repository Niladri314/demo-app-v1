package com.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class controller {
    @GetMapping
    public String getMethod()
    {
        return "Hello World";
    }
}
