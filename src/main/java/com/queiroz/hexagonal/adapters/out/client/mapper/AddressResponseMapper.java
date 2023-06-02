package com.queiroz.hexagonal.adapters.out.client.mapper;

import com.queiroz.hexagonal.adapters.out.client.response.AddressResponse;
import com.queiroz.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
