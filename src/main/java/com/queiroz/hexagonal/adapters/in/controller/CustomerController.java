package com.queiroz.hexagonal.adapters.in.controller;

import com.queiroz.hexagonal.adapters.in.controller.mapper.CustomerRequestMapper;
import com.queiroz.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.queiroz.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.queiroz.hexagonal.application.core.domain.Customer;
import com.queiroz.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.queiroz.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;
    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;
    @Autowired
    private CustomerRequestMapper customerRequestMapper;


    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest customerRequest){

        insertCustomerInputPort.insert(
                customerRequestMapper.toCustomer(customerRequest),
                customerRequest.getZipCode()
        );

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable String id){
        Customer customer = findCustomerByIdInputPort.find(id);
        CustomerResponse customerResponse = customerRequestMapper.toCustomerResponse(customer);

        return ResponseEntity.ok(customerResponse);
    }
}
