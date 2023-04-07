package com.br.trilhaservice.entrypoint.queries;

import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.core.service.TrilhaByIdService;
import com.br.trilhaservice.entrypoint.entities.TrilhaFilterEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@RequiredArgsConstructor
public class TrilhaQuery {

    private final TrilhaByIdService trilhaByIdService;

    @QueryMapping
    public Trilha trilha(@Argument TrilhaFilterEntity data) {
        return trilhaByIdService.execute(data.getId());
    }
}

