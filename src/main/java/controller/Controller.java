package com.acme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String home() {
        return "<html><body><h2>Hello World</h2></body></html>";
    }
}
