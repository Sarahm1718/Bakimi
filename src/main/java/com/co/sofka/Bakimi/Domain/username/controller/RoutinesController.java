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
    private CreateRoutinesUseCase createRoutinesUseCase;

    @Autowired
    private TransformationRoutinesUseCase transformationRoutinesUseCase;

    @PostMapping(value = "api/guardar/{idr}/{routinesName}/{descriptionRoutines}/{idUsuario}/{typeSkin}")
    public String guardar(@PathVariable("idr") String idr,
                       @PathVariable("routinesName") String routinesName,
                       @PathVariable("descriptionRoutines") String descriptionRoutines,
                       @PathVariable("idUsuario") String idUsuario,
                       @PathVariable("typeSkin") String TypeSkin

    ) {
        var command = new CreateRoutines(RoutinesId.of(idr), new RoutinesName(routinesName), new DescriptionRoutines(descriptionRoutines),  IdUsuario.of(idUsuario), new TypeSkin(TypeSkin));
        CreateRoutinesUseCase.Response routinesCreated = executedUseCase(command);
        String string="{"
                + "\"idr\":" + "\""+routinesCreated.getResponse().identity().value()+"\""+ ","
                + "\"nameRutines\":" + "\""+routinesCreated.getResponse().getRoutinesName().value()+"\""+ ","
                + "\"descriptionRoutines\":" + "\""+routinesCreated.getResponse().getDescriptionRoutines().value()+"\""+ ","
                + "\"idUsuario\":" + "\""+routinesCreated.getResponse().getIdUsuario().value()+"\""+ ","
                + "\"typeSkin\":" + "\""+routinesCreated.getResponse().getTypeSkin().value()
                +"}";
        return string;
    }

    private CreateRoutinesUseCase.Response executedUseCase(CreateRoutines command) {
        var events = UseCaseHandler.getInstance()
                .syncExecutor(createRoutinesUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var RoutinesCreated = events;
        return RoutinesCreated;
    }

    @GetMapping(value = "api/routines")
    public Iterable<RoutineData> searchRoutines(){ return (transformationRoutinesUseCase.searchRoutine());
    }}

