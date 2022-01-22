package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String Boom(){
        return("<h1>Weolcome bombom</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return("<h1>Weolcome User</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return("<h1>Weolcome Admin</h1>");
    }

}
