package com.example.shoppet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = {"/", "/welcome","/home"}, method = RequestMethod.GET)
    public ModelAndView Index(){
        ModelAndView mv = new ModelAndView("user/Index");
        return mv;
    }
}

