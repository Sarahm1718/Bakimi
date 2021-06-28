package com.co.sofka.Bakimi.Domain.username.controller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreateRoutines;
import com.co.sofka.Bakimi.Domain.username.useCase.CreateRoutinesUseCase;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.RoutinesId;
import com.co.sofka.Bakimi.Domain.username.values.RoutinesName;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class RoutinesController{

    @Autowired
    private CreateRoutinesUseCase useCase;

    @PostMapping(value = "api/{RoutinesId}/{nameRutines}/{idUsuario}/{TypeSkin}")
    public String save(@PathVariable("RoutinesId") String routinesId,
                       @PathVariable("nameRutines") String nameRutines,
                       @PathVariable("idUsuario") String idUsuario,
                       @PathVariable("TypeSkin") String TypeSkin
    ) {
        var command = new CreateRoutines(RoutinesId.of(routinesId), new RoutinesName(nameRutines), new IdUsuario(idUsuario), descriptionRoutines, new TypeSkin(TypeSkin));
        CreateRoutinesUseCase.Response routinesCreated = executedUseCase(command);
        return (routinesCreated.getResponse().getRoutinesName().value()+ " "+routinesCreated.getResponse().getIdUsuario().value()+ " "+routinesCreated.getResponse().getTypeSkin());

    }

    private CreateRoutinesUseCase.Response executedUseCase(CreateRoutines command) {
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        var RoutinesCreated = events;
        return RoutinesCreated;
    }


}