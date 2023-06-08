package com.queiroz.hexagonal.adapters.out;

import com.queiroz.hexagonal.adapters.out.repository.CustomerRepository;
import com.queiroz.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.queiroz.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {

        Optional<CustomerEntity> optionalById = customerRepository.findById(id);

        return optionalById.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
