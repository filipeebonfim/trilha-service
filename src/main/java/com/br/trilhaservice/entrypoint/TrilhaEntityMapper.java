package com.br.trilhaservice.entrypoint;

import com.br.trilhaservice.core.model.Module;
import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.entrypoint.entities.InputModule;
import com.br.trilhaservice.entrypoint.entities.InputTrilha;
import com.br.trilhaservice.entrypoint.entities.MapInputModule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface TrilhaEntityMapper {

    @Mapping(source = "modules", target = "modules", qualifiedByName = "InputModuleToMapModule")
    Trilha toCoreModel(final InputTrilha inputTrilha);

    Module toCoreModule(final InputModule inputModule);


    @Named("InputModuleToMapModule")
    default Map<Integer, Module> MapInputModuleToModule(final List<MapInputModule> mapInputModules) {
        return mapInputModules.stream()
                .map(mapInputModule -> toCoreModule(mapInputModule.getValue()))
                .collect(Collectors.toMap(Module::getId, module -> module));
    }
}
