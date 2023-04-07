package com.br.trilhaservice.gateway.database.repository;

import com.br.trilhaservice.gateway.database.entity.TrilhaRDBEntity;
import org.springframework.data.repository.CrudRepository;

public interface TrilhaRDBRepository extends CrudRepository<TrilhaRDBEntity, String> {
}
