package com.br.trilhaservice.fixture.core;

import com.br.trilhaservice.core.model.Module;
import com.br.trilhaservice.core.model.Trilha;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;

public class TrilhaFixture {

    public static Trilha load() {
        Module module = ModuleFixture.load1();
        HashMap<String, Module> map = new HashMap<>();

//        map.put(module.getId(), module);
        return Trilha.builder()
                .title("Sondas espaciais")
                .imageUrl("www.sondas.com")
//                .modules(map)
                .firstModules(Collections.singletonList(module.getId()))
                .description("Trilha para aprender sobre sondas espaciais")
                .build();
    }
}
