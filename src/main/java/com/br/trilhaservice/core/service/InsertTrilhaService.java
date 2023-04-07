package com.br.trilhaservice.core.service;

import com.br.trilhaservice.core.boundary.InsertTrilhaNRBoundary;
import com.br.trilhaservice.core.boundary.InsertTrilhaRDBBoundary;
import com.br.trilhaservice.core.model.Trilha;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class InsertTrilhaService {

    private final InsertTrilhaNRBoundary insertTrilhaNRBoundary;
    private final InsertTrilhaRDBBoundary insertTrilhaRDBBoundary;

    public Trilha execute(final Trilha trilha) {
        log.info("Inserting trilha in databases");
        final Trilha inserted = insertTrilhaNRBoundary.execute(trilha);
        insertTrilhaRDBBoundary.execute(inserted);

        return inserted;
    }
}
