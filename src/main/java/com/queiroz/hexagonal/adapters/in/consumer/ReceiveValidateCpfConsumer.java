package com.queiroz.hexagonal.adapters.in.consumer;

import com.queiroz.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.queiroz.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.queiroz.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.queiroz.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;
    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "queiroz")
    public void update(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
