package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/git-sample")
public class GitController {
    @GetMapping("")
    public String index(){
        return "git-sample";
    }
}
