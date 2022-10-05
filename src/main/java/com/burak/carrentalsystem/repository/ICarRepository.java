package com.burak.carrentalsystem.repository;

import com.burak.carrentalsystem.repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.CacheRequest;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {
}
