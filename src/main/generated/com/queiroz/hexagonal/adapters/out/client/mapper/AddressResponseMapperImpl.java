package com.queiroz.hexagonal.adapters.out.client.mapper;

import com.queiroz.hexagonal.adapters.out.client.response.AddressResponse;
import com.queiroz.hexagonal.application.core.domain.Address;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-08T21:27:32-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Azul Systems, Inc.)"
)
@Component
public class AddressResponseMapperImpl implements AddressResponseMapper {

    @Override
    public Address toAddress(AddressResponse addressResponse) {
        if ( addressResponse == null ) {
            return null;
        }

        Address address = new Address();

        address.setStreet( addressResponse.getStreet() );
        address.setCity( addressResponse.getCity() );
        address.setState( addressResponse.getState() );

        return address;
    }
}
