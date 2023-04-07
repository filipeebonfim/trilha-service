package com.br.trilhaservice.core.model;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Trilha {

    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private List<Integer> skills;
    private List<Integer> competences;
    private Integer createdBy;
    private Integer statusId;
    private Integer studentStatus;
    private Boolean like;
    private Map<Integer, Module> modules;
    private List<Integer> firstModules;
    private List<Integer> subjects;

}
