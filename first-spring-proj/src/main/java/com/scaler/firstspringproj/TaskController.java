package com.scaler.firstspringproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello</h1> World!";
    }



}
