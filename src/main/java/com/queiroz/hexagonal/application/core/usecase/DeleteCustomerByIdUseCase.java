package com.queiroz.hexagonal.application.core.usecase;

import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.queiroz.hexagonal.application.ports.out.DeleteCustomerOutputPort;

public class DeleteCustomerByIdUseCase {

    private DeleteCustomerOutputPort deleteCustomerOutputPort;
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    public DeleteCustomerByIdUseCase(DeleteCustomerOutputPort deleteCustomerOutputPort,
                                     FindCustomerByIdInputPort findCustomerByIdInputPort) {
        this.deleteCustomerOutputPort = deleteCustomerOutputPort;
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
    }

    public void delete(Customer customer) {
        findCustomerByIdInputPort.find(customer.getId());
        deleteCustomerOutputPort.delete(customer);
    }
}
