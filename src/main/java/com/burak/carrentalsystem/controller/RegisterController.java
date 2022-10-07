package com.burak.carrentalsystem.controller;


import com.burak.carrentalsystem.dto.request.CustomerRegisterRequestDto;
import com.burak.carrentalsystem.repository.entity.Customer;
import com.burak.carrentalsystem.repository.entity.Gender;
import com.burak.carrentalsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static com.burak.carrentalsystem.constants.EndPoint.*;

@Controller
@RequestMapping(VERSION+API+REGISTER)
@RequiredArgsConstructor
public class RegisterController {

    private final CustomerService customerService;

    @GetMapping(REGISTERPAGE)
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @PostMapping(DOREGISTER)
    public ModelAndView doregister(CustomerRegisterRequestDto customerRegisterRequestDto) {
        customerService.save(customerRegisterRequestDto);

        return new ModelAndView("redirect:/mkv/web/login/loginpage");

    }

}