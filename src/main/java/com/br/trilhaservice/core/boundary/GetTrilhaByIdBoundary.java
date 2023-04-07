package com.br.trilhaservice.core.boundary;

import com.br.trilhaservice.core.model.Trilha;

public interface GetTrilhaByIdBoundary {

    Trilha execute(final String uuid);
}
