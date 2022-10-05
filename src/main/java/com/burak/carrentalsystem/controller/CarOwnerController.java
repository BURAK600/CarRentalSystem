package com.burak.carrentalsystem.controller;

import com.burak.carrentalsystem.repository.entity.CarOwner;
import com.burak.carrentalsystem.service.CarOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.burak.carrentalsystem.constants.EndPoint.*;

@Controller
@RequestMapping(VERSION+API+CAROWNER)
@RequiredArgsConstructor
public class CarOwnerController {

    private final CarOwnerService carOwnerService;

    @GetMapping(SAVE)
public ResponseEntity<CarOwner> save(String firstName, String lastName, String phoneNumber, Long carId )    {
        CarOwner carOwner = CarOwner.builder().firstName(firstName).lastName(lastName).phoneNumber(phoneNumber).carId(carId)
        .build();
        return ResponseEntity.ok(carOwnerService.save(carOwner));

    }

    @GetMapping(DELETEBYID)
    public void deleteById(Long id){
        carOwnerService.deleteById(id);

    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<CarOwner>> findAll(){
        return ResponseEntity.ok(carOwnerService.findAll());
    }


}
