package com.queiroz.hexagonal.application.ports.in;

import com.queiroz.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find (String id);
}
