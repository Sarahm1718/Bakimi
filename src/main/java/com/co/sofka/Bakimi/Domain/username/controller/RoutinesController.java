package com.co.sofka.Bakimi.Domain.username.controller;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Bakimi.Domain.username.commands.CreateRoutines;
import com.co.sofka.Bakimi.Domain.username.commands.UpdateRoutines;
import com.co.sofka.Bakimi.Domain.username.repository.RoutineData;
import com.co.sofka.Bakimi.Domain.username.useCase.CreateRoutinesUseCase;
import com.co.sofka.Bakimi.Domain.username.useCase.TransformationRoutinesUseCase;
import com.co.sofka.Bakimi.Domain.username.useCase.UpdateRoutinesUseCase;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
public class RoutinesController{

    @Autowired
    private CreateRoutinesUseCase createRoutinesUseCase;

    @Autowired
    private UpdateRoutinesUseCase updateRoutinesUseCase;

    @Autowired
    private TransformationRoutinesUseCase transformationRoutinesUseCase;


    @PostMapping(value = "api/guardar/{idr}/{routinesName}/{descriptionRoutines}/{typeSkin}")
    public String guardar(@PathVariable("idr") String idr,
                       @PathVariable("routinesName") String routinesName,
                       @PathVariable("descriptionRoutines") String descriptionRoutines,
                       @PathVariable("typeSkin") String TypeSkin

    ) {
        CreateRoutines command = new CreateRoutines(RoutinesId.of(idr), new RoutinesName(routinesName), new DescriptionRoutines(descriptionRoutines), new TypeSkin(TypeSkin));
        CreateRoutinesUseCase.Response routinesCreated = executedUseCase(command);
        String string="{"
                + "\"idr\":" + "\""+routinesCreated.getResponse().identity().value()+"\""+ ","
                + "\"nameRutines\":" + "\""+routinesCreated.getResponse().getRoutinesName().value()+"\""+ ","
                + "\"descriptionRoutines\":" + "\""+routinesCreated.getResponse().getDescriptionRoutines().value()+"\""+ ","

                + "\"typeSkin\":" + "\""+routinesCreated.getResponse().getTypeSkin().value()
                +"}";
        return string;
    }

    private CreateRoutinesUseCase.Response executedUseCase(CreateRoutines command) {
        CreateRoutinesUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(createRoutinesUseCase, new RequestCommand<>(command))
                .orElseThrow();
        CreateRoutinesUseCase.Response RoutinesCreated = events;
        return RoutinesCreated;
    }

    @PutMapping(value = "api/updateroutine/{idr}/{routinesName}/{descriptionRoutines}/{typeSkin}")
    public String updateroutine(@PathVariable("idr") String idr,
                          @PathVariable("routinesName") String routinesName,
                          @PathVariable("descriptionRoutines") String descriptionRoutines,
                          @PathVariable("typeSkin") String TypeSkin

    ) {
        UpdateRoutines command = new UpdateRoutines(RoutinesId.of(idr), new RoutinesName(routinesName), new DescriptionRoutines(descriptionRoutines), new TypeSkin(TypeSkin));
        UpdateRoutinesUseCase.Response routinesUpdated = executedUseCase(command);
        String string="{"
                + "\"idr\":" + "\""+routinesUpdated.getResponse().identity().value()+"\""+ ","
                + "\"nameRutines\":" + "\""+routinesUpdated.getResponse().getRoutinesName().value()+"\""+ ","
                + "\"descriptionRoutines\":" + "\""+routinesUpdated.getResponse().getDescriptionRoutines().value()+"\""+ ","
                + "\"typeSkin\":" + "\""+routinesUpdated.getResponse().getTypeSkin().value()
                +"}";
        return string;
    }

    private UpdateRoutinesUseCase.Response executedUseCase(UpdateRoutines command) {
        UpdateRoutinesUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(updateRoutinesUseCase, new RequestCommand<>(command))
                .orElseThrow();
        UpdateRoutinesUseCase.Response RoutinesUpdated = events;
        return (UpdateRoutinesUseCase.Response) RoutinesUpdated;
    }

    @GetMapping(value = "api/routines")
    public Iterable<RoutineData> searchRoutines(){ return (transformationRoutinesUseCase.searchRoutine());
    }

    @GetMapping(value = "api/updateroutine/{idr}")
    public RoutineData searchRoutinesId(@PathVariable("idr") String idr){
        return (transformationRoutinesUseCase.searchRoutinesId(idr));
    }

    @DeleteMapping(value = "api/deleteroutine/{idr}")
    public String delete(@PathVariable("idr") String idr){
        return (transformationRoutinesUseCase.delete(idr));
    }
}

