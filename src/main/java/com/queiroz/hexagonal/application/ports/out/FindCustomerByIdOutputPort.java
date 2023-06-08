package com.queiroz.hexagonal.application.ports.out;

import com.queiroz.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
