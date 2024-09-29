package com.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebflixController {

    @GetMapping("/home")
    public String getFlix(){
        return "Welcome to  home New";
    }

    @GetMapping("/index")
    public String getIndex(){
        return "Welcome to CI/CD demo of Index";
    }
    @GetMapping("/goal")
            public String getGoal()
    {
        return "This is the goal ";
    }
}
