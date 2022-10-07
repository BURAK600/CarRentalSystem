package com.burak.carrentalsystem.mapper;

import com.burak.carrentalsystem.dto.request.CustomerLoginRequestDto;
import com.burak.carrentalsystem.dto.request.CustomerRegisterRequestDto;
import com.burak.carrentalsystem.repository.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICustomerMapper {

    ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);

    Customer toCustomer(final CustomerLoginRequestDto customerLoginRequestDto);
    Customer toCustomerRegister(final CustomerRegisterRequestDto customerRegisterRequestDto);

}
