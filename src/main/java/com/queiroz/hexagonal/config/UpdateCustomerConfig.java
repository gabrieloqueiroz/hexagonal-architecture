package com.queiroz.hexagonal.config;

import com.queiroz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.queiroz.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.queiroz.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.queiroz.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.queiroz.hexagonal.application.core.usecase.UpdateCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerByIdUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter

            ){
        return new UpdateCustomerByIdUseCase(findCustomerByIdUseCase,findAddressByZipCodeAdapter, updateCustomerAdapter );
    }
}
