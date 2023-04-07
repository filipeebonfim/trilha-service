package com.br.trilhaservice.gateway.database.mapper;

import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.gateway.database.entity.TrilhaNREntity;
import com.br.trilhaservice.gateway.database.entity.TrilhaRDBEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class TrilhaEntityDbMapper {

    public static final TrilhaEntityDbMapper INSTANCE = Mappers.getMapper(TrilhaEntityDbMapper.class);

    public abstract TrilhaRDBEntity modelToTrilhaRDB(Trilha trilha);

    public abstract TrilhaNREntity modelToTrilhaNR(Trilha trilha);

    public abstract Trilha trilhaNREntityToTrilha(TrilhaNREntity trilhaNREntity);
}
