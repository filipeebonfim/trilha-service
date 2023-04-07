package com.br.trilhaservice.entrypoint.entities;

import lombok.Data;

import java.util.List;

@Data
public class InputTrilha {

    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private List<MapInputModule> modules;
    private List<Integer> firstModules;
    private List<Integer> subjects;
}
