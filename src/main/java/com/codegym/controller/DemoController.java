package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class DemoController {
    @GetMapping("/students")
    public ModelAndView listStudent(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("ten1", "Thanh Bình");
        return modelAndView;
    }
}
