package com.br.trilhaservice.gateway.database.repository;

import com.br.trilhaservice.gateway.database.entity.TrilhaNREntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrilhaNRRepository extends MongoRepository<TrilhaNREntity, String> {
}
