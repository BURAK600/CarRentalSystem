package com.burak.carrentalsystem.repository;

import com.burak.carrentalsystem.repository.entity.CarOwner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarOwnerRepository extends JpaRepository<CarOwner, Long> {

}
