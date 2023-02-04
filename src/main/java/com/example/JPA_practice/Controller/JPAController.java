package com.example.JPA_practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JPAController {

    @GetMapping("/selectForJPA")
    public String select() {


        return "main/result";
    }
}
