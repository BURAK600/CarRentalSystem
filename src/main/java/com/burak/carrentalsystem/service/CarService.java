package com.burak.carrentalsystem.service;

import com.burak.carrentalsystem.repository.ICarRepository;
import com.burak.carrentalsystem.repository.entity.Car;
import com.burak.carrentalsystem.utility.ServiceManager;

import org.springframework.stereotype.Service;

@Service
public class CarService extends ServiceManager<Car, Long> {

    private final ICarRepository iCarRepository;
    public CarService(ICarRepository iCarRepository) {
        super(iCarRepository);
        this.iCarRepository = iCarRepository;
    }



}
