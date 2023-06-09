package com.queiroz.hexagonal.adapters.in.consumer.mapper;

import com.queiroz.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.queiroz.hexagonal.application.core.domain.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-08T21:27:32-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Azul Systems, Inc.)"
)
@Component
public class CustomerMessageMapperImpl implements CustomerMessageMapper {

    @Override
    public Customer toCustomer(CustomerMessage customerMessage) {
        if ( customerMessage == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerMessage.getId() );
        customer.setName( customerMessage.getName() );
        customer.setCpf( customerMessage.getCpf() );

        return customer;
    }
}
