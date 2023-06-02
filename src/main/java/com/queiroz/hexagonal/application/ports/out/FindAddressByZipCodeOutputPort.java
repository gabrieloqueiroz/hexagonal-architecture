package com.queiroz.hexagonal.application.ports.out;

import com.queiroz.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
