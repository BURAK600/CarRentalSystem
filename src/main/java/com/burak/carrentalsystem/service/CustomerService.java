package com.burak.carrentalsystem.service;

import com.burak.carrentalsystem.dto.request.CustomerLoginRequestDto;
import com.burak.carrentalsystem.dto.request.CustomerRegisterRequestDto;
import com.burak.carrentalsystem.mapper.ICustomerMapper;
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

    public Optional<Customer> login (CustomerLoginRequestDto customerLoginRequestDto){

        Optional<Customer> customer = iCustomerRepository.findOptionalByEmailAndPassword(customerLoginRequestDto.getEmail(),customerLoginRequestDto.getPassword());
        if (customer.isEmpty()){

            System.out.println("Kullanıcı Bulunamadı");
            return Optional.ofNullable(null);
        }

        return customer;
    }

    public Customer save(CustomerRegisterRequestDto customerRegisterRequestDto){
        Customer customer = ICustomerMapper.INSTANCE.toCustomerRegister(customerRegisterRequestDto);
        iCustomerRepository.save(customer);
        return customer;
    }
}
