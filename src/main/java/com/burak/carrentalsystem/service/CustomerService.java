package com.burak.carrentalsystem.service;

import com.burak.carrentalsystem.repository.ICustomerRepository;
import com.burak.carrentalsystem.repository.entity.Customer;
import com.burak.carrentalsystem.repository.entity.Gender;
import com.burak.carrentalsystem.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService extends ServiceManager<Customer, Long> {

    private final ICustomerRepository iCustomerRepository;

    public CustomerService(ICustomerRepository iCustomerRepository) {
        super(iCustomerRepository);
        this.iCustomerRepository = iCustomerRepository;
    }

    public Optional<Customer> login (String email, String password){

        Optional<Customer> customer = iCustomerRepository.findOptionalByEmailAndPassword(email,password);
        if (customer.isEmpty()){

            System.out.println("Kullanıcı Bulunamadı");
            return Optional.ofNullable(null);
        }

        return customer;
    }
}
