package com.co.sofka.Bakimi.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.commands.CreateRoutines;
import com.co.sofka.Bakimi.events.RoutinesCreated;
import com.co.sofka.Bakimi.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateRoutinesUseCaseTest {
    @Test
    public void createRoutinesUseCaseTest(){
        var command = new CreateRoutines(RoutinesId.of("0"), new RoutinesName("RoutinesName"), new Products("Products"), new IdUsuario("IdUsuario"), new DescriptionRoutines("DescriptionRoutines"), new TypeSkin("TypeSkin"));
        RoutinesCreated routinesCreated = executeUseCase(command);
        Assertions.assertEquals("0", routinesCreated.RoutinesId().value());
    }

    private RoutinesCreated executeUseCase(CreateRoutines command){
        var usecase = new CreateRoutinesUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var routinesCreated =(RoutinesCreated) events.get(0);
        return routinesCreated;
    }

}