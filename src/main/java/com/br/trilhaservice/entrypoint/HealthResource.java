package com.br.trilhaservice.entrypoint;

import com.br.trilhaservice.core.model.Module;
import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.gateway.database.impl.InsertNewTrilhaRDB;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;

@RestController
public class HealthResource {

    @Autowired
    private InsertNewTrilhaRDB insertNewTrilhaDb;

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        MeterRegistry registry = new SimpleMeterRegistry();
        Counter counter = registry.counter("hello.metric");
        counter.increment();
        DistributionSummary.builder("salve").tag("salve-key", "salve-value").register(registry).record(2.2);
//        insertNewTrilhaDb.execute(load());
        return ResponseEntity.ok(OffsetDateTime.now().toString());
    }

    public Trilha load() {
        HashMap<String, Module> map = new HashMap<>();

        return Trilha.builder()
                .title("Sondas espaciais")
//                .imageUrl(URI.create("www.sondas.com"))
//                .modules(map)
                .firstModules(Collections.singletonList(1))
                .description("Trilha para aprender sobre sondas espaciais")
                .build();
    }
}
