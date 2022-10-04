package com.burak.carrentalsystem.repository;

import com.burak.carrentalsystem.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
