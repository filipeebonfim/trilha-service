package com.br.trilhaservice.gateway.database.impl;

import com.br.trilhaservice.core.boundary.GetTrilhaByIdBoundary;
import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.gateway.database.entity.TrilhaNREntity;
import com.br.trilhaservice.gateway.database.mapper.TrilhaEntityDbMapper;
import com.br.trilhaservice.gateway.database.repository.TrilhaNRRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@RequiredArgsConstructor
@Component
public class GetTrilhaNRById implements GetTrilhaByIdBoundary {

    private final TrilhaNRRepository trilhaNRRepository;

    public Trilha execute(final String uuid) {
        TrilhaNREntity trilhaNR = trilhaNRRepository.findById(uuid)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Trilha with uuid %s not found", uuid)));

        return TrilhaEntityDbMapper.INSTANCE.trilhaNREntityToTrilha(trilhaNR);
    }
}
