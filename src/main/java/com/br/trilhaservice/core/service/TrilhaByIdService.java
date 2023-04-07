package com.br.trilhaservice.core.service;

import com.br.trilhaservice.core.boundary.GetTrilhaByIdBoundary;
import com.br.trilhaservice.core.model.Trilha;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrilhaByIdService {

    private final GetTrilhaByIdBoundary getTrilhaByIdBoundary;

    public Trilha execute(final String uuid) {

        return getTrilhaByIdBoundary.execute(uuid);
    }
}
