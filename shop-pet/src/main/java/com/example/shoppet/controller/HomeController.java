package com.example.shoppet.controller;

import com.example.shoppet.repository.user.HomeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{


    @RequestMapping(value = {"/", "/welcome","/home"}, method = RequestMethod.GET)
    public ModelAndView Index(){
        _mvShare.addObject("slides",_homeServiceImp.GetDataSlide());
        _mvShare.addObject("category",_homeServiceImp.GetDatacategorys());
        _mvShare.addObject("products",_homeServiceImp.GetDataProducts());
        _mvShare.addObject("productsNew",_homeServiceImp.GetDataProductsNew());
        _mvShare.setViewName("user/Index");
        return _mvShare;
    }

}

