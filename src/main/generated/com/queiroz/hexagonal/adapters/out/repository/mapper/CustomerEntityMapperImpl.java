package com.queiroz.hexagonal.adapters.out.repository.mapper;

import com.queiroz.hexagonal.adapters.out.repository.entity.AddressEntity;
import com.queiroz.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.queiroz.hexagonal.application.core.domain.Address;
import com.queiroz.hexagonal.application.core.domain.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-08T21:27:32-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Azul Systems, Inc.)"
)
@Component
public class CustomerEntityMapperImpl implements CustomerEntityMapper {

    @Override
    public CustomerEntity toCustomerEntity(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setId( customer.getId() );
        customerEntity.setName( customer.getName() );
        customerEntity.setCpf( customer.getCpf() );
        customerEntity.setValidCpf( customer.isValidCpf() );
        customerEntity.setAddress( addressToAddressEntity( customer.getAddress() ) );

        return customerEntity;
    }

    @Override
    public Customer toCustomer(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerEntity.getId() );
        customer.setName( customerEntity.getName() );
        customer.setCpf( customerEntity.getCpf() );
        customer.setValidCpf( customerEntity.isValidCpf() );
        customer.setAddress( addressEntityToAddress( customerEntity.getAddress() ) );

        return customer;
    }

    protected AddressEntity addressToAddressEntity(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setStreet( address.getStreet() );
        addressEntity.setCity( address.getCity() );
        addressEntity.setState( address.getState() );

        return addressEntity;
    }

    protected Address addressEntityToAddress(AddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        Address address = new Address();

        address.setStreet( addressEntity.getStreet() );
        address.setCity( addressEntity.getCity() );
        address.setState( addressEntity.getState() );

        return address;
    }
}
