package com.queiroz.hexagonal.application.core.usecase;

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

    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerOutputPort.delete(id);
    }
}
