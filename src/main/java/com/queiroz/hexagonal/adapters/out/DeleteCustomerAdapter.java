package com.queiroz.hexagonal.adapters.out;

import com.queiroz.hexagonal.adapters.out.repository.CustomerRepository;
import com.queiroz.hexagonal.application.ports.out.DeleteCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerAdapter implements DeleteCustomerOutputPort  {
    @Autowired
    private CustomerRepository customerRepository;

    public void delete(String id){
        customerRepository.deleteById(id);
    }
}
