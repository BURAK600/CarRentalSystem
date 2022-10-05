package com.burak.carrentalsystem.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tblcustomer")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Customer extends Default {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String idNumber;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Long carId;
    private Gender gender;
    private String email;
    private String password;





}
