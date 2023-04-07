package com.br.trilhaservice.entrypoint.entities;

import lombok.Data;

import java.util.List;

@Data
public class InputContent {

    private Integer id;
    private String title;
    private String description;
    private String type;
    private List<Integer> alternativesOrder;
    private List<InputAlternative> alternatives;
    private List<Integer> skills;
    private List<Integer> competences;
    private Boolean readByStudent;
    private List<Integer> alternativeAnswered;
    private List<Integer> correctAlternatives;
}
