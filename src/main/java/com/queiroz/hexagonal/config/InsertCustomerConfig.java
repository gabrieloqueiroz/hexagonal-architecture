package com.queiroz.hexagonal.config;

import com.queiroz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.queiroz.hexagonal.adapters.out.InsertCustomerAdapter;
import com.queiroz.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.queiroz.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
