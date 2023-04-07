package com.br.trilhaservice.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Content {

    private Long id;
    private Long idOnTrail;
    private String title;
    private String description;
    private String type;
    private List<Long> skills;
    private List<Long> competences;
    private Boolean readByStudent;
    private Boolean studentHit;

}
