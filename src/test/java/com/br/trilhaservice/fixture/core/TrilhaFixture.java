package com.br.trilhaservice.fixture.core;

import com.br.trilhaservice.core.model.Module;
import com.br.trilhaservice.core.model.Trilha;

import java.util.Collections;

public class TrilhaFixture {

    public static Trilha load() {
        Module module = ModuleFixture.load1();

        return Trilha.builder()
                .title("Sondas espaciais")
                .imageUrl("www.sondas.com")
                .firstModules(Collections.singletonList(module.getId()))
                .description("Trilha para aprender sobre sondas espaciais")
                .build();
    }
}
