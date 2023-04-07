package com.br.trilhaservice.entrypoint.mutations;


import com.br.trilhaservice.core.model.Trilha;
import com.br.trilhaservice.core.service.InsertTrilhaService;
import com.br.trilhaservice.entrypoint.TrilhaEntityMapper;
import com.br.trilhaservice.entrypoint.entities.AcceptUserOnTrilha;
import com.br.trilhaservice.entrypoint.entities.InputTrilha;
import com.br.trilhaservice.entrypoint.entities.ReturnInput;
import com.br.trilhaservice.entrypoint.entities.UserLikedTrilha;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@AllArgsConstructor
public class TrilhaMutation {

    private final TrilhaEntityMapper trilhaEntityMapper;
    private final InsertTrilhaService insertTrilhaService;

    @MutationMapping
    public ReturnInput createTrilha(@Argument final InputTrilha data) {
        final Trilha coreModel = trilhaEntityMapper.toCoreModel(data);
        final Trilha inserted = insertTrilhaService.execute(coreModel);
        return genericReturn(String.format("Trilha %s inserted successfully", inserted.getId()));
    }

    @MutationMapping
    public ReturnInput finalizeTrilha(final String String) {
        throw new NotYetImplementedException();
    }

    @MutationMapping
    public ReturnInput userApplyTrilha(final String String) {
        throw new NotYetImplementedException();
    }

    @MutationMapping
    public ReturnInput userLikedTrilha(final UserLikedTrilha userLikedTrilha) {
        throw new NotYetImplementedException();
    }

    @MutationMapping
    public ReturnInput acceptUserOnTrilha(final AcceptUserOnTrilha acceptUserOnTrilha) {
        throw new NotYetImplementedException();
    }

    private ReturnInput genericReturn(final String message) {
        return new ReturnInput(true, message);
    }
}



