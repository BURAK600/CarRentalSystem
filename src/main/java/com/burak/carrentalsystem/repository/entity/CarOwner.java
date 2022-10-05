package com.burak.carrentalsystem.repository.entity;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tblcarowner")
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class CarOwner extends Default{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Long carId;



}
