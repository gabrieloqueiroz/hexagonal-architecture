package com.queiroz.hexagonal.adapters.in.controller.mapper;

import com.queiroz.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.queiroz.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CostumerRequestMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}
