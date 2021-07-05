package com.co.sofka.Bakimi.Domain.username.controller;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreateRoutines;
import com.co.sofka.Bakimi.Domain.username.repository.RoutineData;
import com.co.sofka.Bakimi.Domain.username.useCase.CreateRoutinesUseCase;
import com.co.sofka.Bakimi.Domain.username.useCase.TransformationRoutinesUseCase;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
public class RoutinesController{

    @Autowired
    private CreateRoutinesUseCase useCase;

    @Autowired
    private TransformationRoutinesUseCase transformationRoutinesUseCase;

    @PostMapping(value = "api/save/{routinesId}/{routinesName}/{descriptionRoutines}/{idUsuario}/{typeSkin}")
    public String save(@PathVariable("routinesId") String routinesId,
                       @PathVariable("routinesName") String routinesName,
                       @PathVariable("descriptionRoutines") String descriptionRoutines,
                       @PathVariable("idUsuario") String idUsuario,
                       @PathVariable("typeSkin") String TypeSkin

    ) {
        var command = new CreateRoutines(RoutinesId.of(routinesId), new RoutinesName(routinesName), new DescriptionRoutines(descriptionRoutines),  IdUsuario.of(idUsuario), new TypeSkin(TypeSkin));
        CreateRoutinesUseCase.Response routinesCreated = executedUseCase(command);
        String string="{"
                + "\"routinesId\":" + "\""+routinesCreated.getResponse().identity().value()+"\""+ ","
                + "\"nameRutines\":" + "\""+routinesCreated.getResponse().getRoutinesName().value()+"\""+ ","
                + "\"descriptionRoutines\":" + "\""+routinesCreated.getResponse().getDescriptionRoutines().value()+"\""+ ","
                + "\"idUsuario\":" + "\""+routinesCreated.getResponse().getIdUsuario().value()+"\""+ ","
                + "\"typeSkin\":" + "\""+routinesCreated.getResponse().getTypeSkin().value()
                +"}";
        return string;
    }

    private CreateRoutinesUseCase.Response executedUseCase(CreateRoutines command) {
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        var RoutinesCreated = events;
        return RoutinesCreated;
    }

    @GetMapping(value = "api/routines")
    public Iterable<RoutineData> searchRoutines(){ return (transformationRoutinesUseCase.searchRoutine());
    }}

