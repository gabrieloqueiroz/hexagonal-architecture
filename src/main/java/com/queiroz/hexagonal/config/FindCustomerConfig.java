package com.queiroz.hexagonal.config;

import com.queiroz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.queiroz.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.queiroz.hexagonal.adapters.out.InsertCustomerAdapter;
import com.queiroz.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.queiroz.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
