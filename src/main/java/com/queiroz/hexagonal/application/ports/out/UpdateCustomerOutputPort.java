package com.queiroz.hexagonal.application.ports.out;

import com.queiroz.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
