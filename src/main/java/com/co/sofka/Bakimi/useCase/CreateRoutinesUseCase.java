package com.co.sofka.Bakimi.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.co.sofka.Bakimi.Routines;
import com.co.sofka.Bakimi.commands.CreateRoutines;

public class CreateRoutinesUseCase extends UseCase<RequestCommand<CreateRoutines>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateRoutines> createRoutinesRequestCommand) {
        var command = createRoutinesRequestCommand.getCommand();
        var routines = new Routines(command.RoutinesId(), command.RoutinesName(), command.Products(), command.DescriptionRoutines(), command.IdUsuario(), command.TypeSkin());
        emit().onResponse(new ResponseEvents(routines.getUncommittedChanges()));
    }
}
