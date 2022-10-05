package com.burak.carrentalsystem.dto.request;


import com.burak.carrentalsystem.repository.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CustomerLoginRequestDto {
    private String email;
    private String password;


}
