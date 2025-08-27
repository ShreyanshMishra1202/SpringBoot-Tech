package com.scaler.firstspringproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController2 {

    @GetMapping("/abc")
    public String print(){
        return "Hello Shreyansh";
    }




}
