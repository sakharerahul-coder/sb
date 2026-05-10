package com.sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("welcome")
    public String Welcome(){
        return "Welcome Spring boot Appication";
    }
}
