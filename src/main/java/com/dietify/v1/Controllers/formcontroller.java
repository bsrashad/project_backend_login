package com.dietify.v1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class formcontroller {
    

    @GetMapping("/formpage")
    public String formpage() {
        return "surveyform";
    }
    
}
