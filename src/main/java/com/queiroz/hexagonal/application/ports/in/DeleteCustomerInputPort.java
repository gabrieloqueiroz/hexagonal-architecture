package com.queiroz.hexagonal.application.ports.in;

import com.queiroz.hexagonal.application.core.domain.Customer;

public interface DeleteCustomerInputPort {

    void delete(String id);
}
