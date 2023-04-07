package com.br.trilhaservice.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AlternativeContent extends Content {

    private List<Alternative> alternatives;
    private List<Long> correctAlternatives;
    private List<Long> alternativesOrder;
    private List<Long> alternativeAnswered;
}
