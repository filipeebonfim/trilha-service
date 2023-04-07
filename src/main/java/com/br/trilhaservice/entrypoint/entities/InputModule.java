package com.br.trilhaservice.entrypoint.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InputModule {

    private Integer id;
    private String title;
    private String description;
    private List<Integer> nextModules;
    private List<Integer> contentsOrder;
    private List<MapInputContent> contents;
}
