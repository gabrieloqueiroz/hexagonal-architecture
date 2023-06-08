package com.queiroz.hexagonal.adapters.out;

import com.queiroz.hexagonal.adapters.out.repository.CustomerRepository;
import com.queiroz.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.out.DeleteCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerAdapter implements DeleteCustomerOutputPort  {

    private CustomerEntityMapper customerEntityMapper;
    private CustomerRepository customerRepository;

    @Autowired
    public DeleteCustomerAdapter(CustomerEntityMapper customerEntityMapper, CustomerRepository customerRepository) {
        this.customerEntityMapper = customerEntityMapper;
        this.customerRepository = customerRepository;
    }

    public void delete(Customer customer){
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.delete(customerEntity);
    }
}
