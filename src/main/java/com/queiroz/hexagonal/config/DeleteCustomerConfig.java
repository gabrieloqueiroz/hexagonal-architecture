package com.queiroz.hexagonal.config;

import com.queiroz.hexagonal.adapters.out.DeleteCustomerAdapter;
import com.queiroz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.queiroz.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.queiroz.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.queiroz.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.queiroz.hexagonal.application.core.usecase.UpdateCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerAdapter deleteCustomerAdapter
    ) {
        return new DeleteCustomerByIdUseCase(deleteCustomerAdapter, findCustomerByIdUseCase);
    }
}
