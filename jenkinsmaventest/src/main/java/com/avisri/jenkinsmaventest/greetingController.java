package com.avisri.jenkinsmaventest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {

    @RequestMapping("/check")
    public String name() {
        System.out.println("check the application");
        System.out.println("Testing the application");
        return "Success";
    }
}
