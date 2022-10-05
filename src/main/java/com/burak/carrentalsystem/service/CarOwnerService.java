package com.burak.carrentalsystem.service;


import com.burak.carrentalsystem.repository.ICarOwnerRepository;
import com.burak.carrentalsystem.repository.ICarRepository;
import com.burak.carrentalsystem.repository.entity.CarOwner;
import com.burak.carrentalsystem.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CarOwnerService extends ServiceManager<CarOwner, Long> {

    private final ICarOwnerRepository iCarOwnerRepository;

    public CarOwnerService(ICarOwnerRepository iCarOwnerRepository) {
        super(iCarOwnerRepository);
        this.iCarOwnerRepository = iCarOwnerRepository;
    }
}
