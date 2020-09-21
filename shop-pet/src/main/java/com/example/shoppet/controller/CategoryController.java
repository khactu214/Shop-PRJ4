package com.example.shoppet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {


    @RequestMapping(path = "/san-pham/{id}")
    public ModelAndView Product(@PathVariable String id){
        ModelAndView mv = new ModelAndView("user/products");
        mv.addObject("idCategory", id);
        return mv;
    }
}
