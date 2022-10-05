package com.burak.carrentalsystem.utility;


import com.burak.carrentalsystem.repository.ICarOwnerRepository;
import com.burak.carrentalsystem.repository.ICarRepository;
import com.burak.carrentalsystem.repository.ICustomerRepository;
import com.burak.carrentalsystem.repository.entity.Car;
import com.burak.carrentalsystem.repository.entity.CarOwner;
import com.burak.carrentalsystem.repository.entity.Customer;
import com.burak.carrentalsystem.repository.entity.Gender;
import com.burak.carrentalsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DefaultDataImpl {

    private final ICarOwnerRepository iCarOwnerRepository;

    private final ICarRepository iCarRepository;

    private final ICustomerRepository iCustomerRepository;

   @PostConstruct
    private void create(){
        saveCustomer();
        saveCar();
        saveCarOwner();

    }

    private void saveCar(){
        Car car = Car.builder().type("Sedan").brand("Toyoto").model("A200").build();
        Car car2 = Car.builder().type("Sedan").brand("Volvo").model("B300").build();
        Car car3= Car.builder().type("Sedan").brand("Mercedes").model("C300").build();
        Car car4= Car.builder().type("Crossover").brand("Renault").model("CESA12").build();
        Car car5= Car.builder().type("Minivan").brand("Toyoto").model("C600").build();
        Car car6= Car.builder().type("SportCar").brand("Hondo").model("Civic").build();



        iCarRepository.saveAll(Arrays.asList(car,car2,car3,car4,car5,car6));
    }

    public void saveCarOwner() {
        CarOwner carOwner = CarOwner.builder().firstName("Ali").lastName("Mana").phoneNumber("05554564434").carId(1l).
                build();
        CarOwner carOwner2 = CarOwner.builder().firstName("Mehmet").lastName("Dasa").phoneNumber("05551232323").carId(2l).
                build();
        CarOwner carOwner3 = CarOwner.builder().firstName("Cengiz").lastName("Aktu").phoneNumber("05553454434").carId(3l).
                build();
        CarOwner carOwner4 = CarOwner.builder().firstName("Burak").lastName("Özer").phoneNumber("05554574434").carId(4l).
                build();
        CarOwner carOwner5 = CarOwner.builder().firstName("Hasan").lastName("Dada").phoneNumber("05554564434").carId(5l).
                build();
        CarOwner carOwner6= CarOwner.builder().firstName("Hasan").lastName("Dada").phoneNumber("05554564434").carId(6l).
                build();
        iCarOwnerRepository.saveAll(Arrays.asList(carOwner,carOwner2,carOwner3,carOwner4,carOwner5,carOwner6));


    }
    public void saveCustomer(){
        Customer customer = Customer.builder().idNumber("600321234555").firstName("Aytug").lastName("Dogan").address("Ankara").phoneNumber("05666662334").carId(2l)
                .build();
        Customer customer2 = Customer.builder().idNumber("60034532123").firstName("Ramazan").lastName("Aktı").address("İtanbul").phoneNumber("05666662334").carId(1l)
                .build();
        Customer customer3 = Customer.builder().idNumber("60032768934").firstName("Kerem").lastName("Merdan").address("Malatya").phoneNumber("05666662334").carId(5l)
                .build();
        Customer customer4 = Customer.builder().idNumber("60098045623").firstName("Merve").lastName("Bogdan").address("İzmir").phoneNumber("05666662334").carId(3l).email("burakozer539@gmail.com").gender(Gender.MAN).password("12345").build();
        Customer customer5 = Customer.builder().idNumber("60098045623").firstName("Merve").lastName("Bogdan").address("İzmir").phoneNumber("05666662334").carId(3l).email("burakozer@gmail.com").gender(Gender.WOMAN).password("12345")
                .build();

        iCustomerRepository.saveAll(Arrays.asList(customer,customer2,customer3,customer4,customer5));


    }
    }



