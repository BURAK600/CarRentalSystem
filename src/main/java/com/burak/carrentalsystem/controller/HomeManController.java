package com.burak.carrentalsystem.controller;


import com.burak.carrentalsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/homeman")
@RequiredArgsConstructor
public class HomeManController {

    private final CustomerService customerService;

    @GetMapping("homeman1")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("homeman");

        return modelAndView;
    }
}

