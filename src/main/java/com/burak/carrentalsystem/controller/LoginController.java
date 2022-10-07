package com.burak.carrentalsystem.controller;


import com.burak.carrentalsystem.dto.request.CustomerLoginRequestDto;
import com.burak.carrentalsystem.repository.entity.Customer;
import com.burak.carrentalsystem.repository.entity.Gender;
import com.burak.carrentalsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import static com.burak.carrentalsystem.constants.EndPoint.*;

@Controller
@RequiredArgsConstructor
@RequestMapping(VERSION+API+LOGIN)
public class LoginController {

    private final CustomerService customerService;

    @GetMapping(LOGINPAGE)
    public ModelAndView login() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        return modelAndView;
    }

    @PostMapping(DOLOGIN)
    public ModelAndView dologin(CustomerLoginRequestDto customerLoginRequestDto) {

        ModelAndView modelAndView = new ModelAndView();
        Optional<Customer> customer = customerService.login(customerLoginRequestDto);
        if (customer.isPresent()) {
            if (customer.get().getGender().equals(Gender.MAN)) {
                List<Customer> users =  customerService.findAll();
                modelAndView.addObject("customer", customer);
                modelAndView.setViewName("homeman");
            } else {
                modelAndView.addObject("customer", customer);
                modelAndView.setViewName("homewoman");
            }
        } else {

            return new ModelAndView("redirect:loginpage");
        }
        return modelAndView;
    }


}
