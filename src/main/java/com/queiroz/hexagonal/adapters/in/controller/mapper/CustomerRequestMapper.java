package com.queiroz.hexagonal.adapters.in.controller.mapper;

import com.queiroz.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.queiroz.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.queiroz.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerRequestMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    @Mapping(target = "address", source = "address")
    CustomerResponse toCustomerResponse(Customer customer);
}
