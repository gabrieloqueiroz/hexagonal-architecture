package com.queiroz.hexagonal.adapters.out.repository;

import com.queiroz.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CostumerRepository  extends MongoRepository<CustomerEntity, String>{
}
