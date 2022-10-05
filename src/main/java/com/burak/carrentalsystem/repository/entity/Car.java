package com.burak.carrentalsystem.repository.entity;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tblcar")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder

public class Car extends Default {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String type;
    private String brand;
    private String model;


}
