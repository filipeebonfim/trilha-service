package com.br.trilhaservice.gateway.database.impl;

import com.br.trilhaservice.core.boundary.InsertTrilhaRDBBoundary;
import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.gateway.database.entity.TrilhaRDBEntity;
import com.br.trilhaservice.gateway.database.mapper.TrilhaEntityDbMapper;
import com.br.trilhaservice.gateway.database.repository.TrilhaRDBRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class InsertNewTrilhaRDB implements InsertTrilhaRDBBoundary {

    private final TrilhaRDBRepository trilhaRDBRepository;

    public void execute(final Trilha trilha) {
        TrilhaEntityDbMapper mapper = TrilhaEntityDbMapper.INSTANCE;
        TrilhaRDBEntity trilhaRDBEntity = mapper.modelToTrilhaRDB(trilha);
        trilhaRDBRepository.save(trilhaRDBEntity);
    }
}
