package com.queiroz.hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private String cpf;
    private AddressResponse addressResponse;
    private Boolean isValidCpf;
}
