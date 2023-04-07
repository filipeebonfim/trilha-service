package com.br.trilhaservice.core.boundary;

import com.br.trilhaservice.core.model.Trilha;

public interface InsertTrilhaRDBBoundary {

    void execute(final Trilha trilha);

}
