package com.burak.carrentalsystem.controller;


import com.burak.carrentalsystem.repository.entity.Car;
import com.burak.carrentalsystem.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.burak.carrentalsystem.constants.EndPoint.*;

@Controller
@RequestMapping(VERSION+API+CAR)
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping(SAVE)
    public ResponseEntity<Car> save(String type, String brand, String model ){
        Car car = (Car.builder().type(type).brand(brand).model(model)
                 .build());

        return ResponseEntity.ok(carService.save(car));
    }

    @GetMapping(DELETEBYID)
    public void deleteById(Long id){
        carService.deleteById(id);


    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }


}
