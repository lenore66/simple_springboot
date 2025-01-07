package org.example.controller;
import
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/account")
    public String getAccount(){
        return "123456";
    }
}
