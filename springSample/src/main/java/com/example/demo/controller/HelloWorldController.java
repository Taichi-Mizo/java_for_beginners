package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;

@Controller
public class HelloWorldController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("/")
    public String helloWorld(Model model) throws UnsupportedEncodingException {
        List<Test> testlist = testRepository.findAll();
        model.addAttribute("message", testlist.get(0).getText());
        
        return "index";
    }
    
}
