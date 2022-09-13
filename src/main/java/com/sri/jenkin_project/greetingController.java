package com.sri.jenkin_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {
    
    @RequestMapping("/Hey")
    public String name() {
        System.out.println("let's say hi to jenkins");
        return "jenkins build maven project successfully";
    }
    
}
