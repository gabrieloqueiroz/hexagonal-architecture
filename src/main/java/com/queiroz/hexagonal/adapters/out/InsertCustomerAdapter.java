package com.queiroz.hexagonal.adapters.out;

import com.queiroz.hexagonal.adapters.out.repository.CustomerRepository;
import com.queiroz.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.out.InsertCostumerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCostumerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }
}
