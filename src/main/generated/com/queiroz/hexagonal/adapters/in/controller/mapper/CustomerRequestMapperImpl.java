package com.queiroz.hexagonal.adapters.in.controller.mapper;

import com.queiroz.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.queiroz.hexagonal.adapters.in.controller.response.AddressResponse;
import com.queiroz.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.queiroz.hexagonal.application.core.domain.Address;
import com.queiroz.hexagonal.application.core.domain.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-08T22:56:33-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Azul Systems, Inc.)"
)
@Component
public class CustomerRequestMapperImpl implements CustomerRequestMapper {

    @Override
    public Customer toCustomer(CustomerRequest customerRequest) {
        if ( customerRequest == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setName( customerRequest.getName() );
        customer.setCpf( customerRequest.getCpf() );

        return customer;
    }

    @Override
    public CustomerResponse toCustomerResponse(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerResponse customerResponse = new CustomerResponse();

        customerResponse.setAddress( addressToAddressResponse( customer.getAddress() ) );
        customerResponse.setName( customer.getName() );
        customerResponse.setCpf( customer.getCpf() );
        customerResponse.setValidCpf( customer.isValidCpf() );

        return customerResponse;
    }

    protected AddressResponse addressToAddressResponse(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressResponse addressResponse = new AddressResponse();

        addressResponse.setStreet( address.getStreet() );
        addressResponse.setCity( address.getCity() );
        addressResponse.setState( address.getState() );

        return addressResponse;
    }
}
