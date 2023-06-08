package com.queiroz.hexagonal.application.core.usecase;

import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase {

    private FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(() ->
                new RuntimeException("Customer not find"));
    }
}
