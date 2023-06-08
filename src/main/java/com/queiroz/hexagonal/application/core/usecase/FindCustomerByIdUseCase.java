package com.queiroz.hexagonal.application.core.usecase;

import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.queiroz.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    @Autowired
    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(() ->
                new RuntimeException("Customer not find"));
    }
}
