package com.br.trilhaservice.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Module {

    private Integer id;
    private String title;
    private String description;
    private List<Integer> skills;
    private List<Integer> competences;
    private List<Integer> nextModules;
    private List<Content> contents;
    private List<Integer> contentsOrder;
}
