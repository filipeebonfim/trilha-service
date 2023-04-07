package com.br.trilhaservice.gateway.database.impl;

import com.br.trilhaservice.core.boundary.InsertTrilhaNRBoundary;
import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.gateway.database.entity.TrilhaNREntity;
import com.br.trilhaservice.gateway.database.mapper.TrilhaEntityDbMapper;
import com.br.trilhaservice.gateway.database.repository.TrilhaNRRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class InsertNewTrilhaNR implements InsertTrilhaNRBoundary {

    private final TrilhaNRRepository trilhaNRRepository;

    public Trilha execute(final Trilha trilha) {
        if (trilha.getId() != null)
            return trilha;

        final TrilhaEntityDbMapper mapper = TrilhaEntityDbMapper.INSTANCE;
        TrilhaNREntity trilhaNREntity = mapper.modelToTrilhaNR(trilha);
        trilhaNREntity = trilhaNRRepository.save(trilhaNREntity);

        trilha.setId(trilhaNREntity.getId());
        return trilha;
    }
}
