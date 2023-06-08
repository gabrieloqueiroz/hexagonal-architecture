package com.queiroz.hexagonal.application.core.usecase;

import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.queiroz.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.queiroz.hexagonal.application.ports.out.InsertCostumerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCostumerOutputPort insertCostumerOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCostumerOutputPort insertCostumerOutputPort){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCostumerOutputPort = insertCostumerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCostumerOutputPort.insert(customer);
    }
}
