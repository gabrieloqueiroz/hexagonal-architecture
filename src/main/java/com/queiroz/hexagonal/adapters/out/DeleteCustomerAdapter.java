package com.queiroz.hexagonal.adapters.out;

import com.queiroz.hexagonal.adapters.out.repository.CustomerRepository;
import com.queiroz.hexagonal.application.ports.out.DeleteCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerAdapter implements DeleteCustomerOutputPort  {
    private CustomerRepository customerRepository;

    @Autowired
    public DeleteCustomerAdapter(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void delete(String id){
        customerRepository.deleteById(id);
    }
}
