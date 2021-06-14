package com.co.sofka.Bakimi.Domain.routines.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.co.sofka.Bakimi.Domain.routines.Routines;
import com.co.sofka.Bakimi.Domain.routines.commands.CreateRoutines;

public class CreateRoutinesUseCase extends UseCase<RequestCommand<CreateRoutines>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateRoutines> createRoutinesRequestCommand) {
            var command = createRoutinesRequestCommand.getCommand();
            var routines = new Routines(command.RoutinesId(), command.RoutinesName(), command.Products(), command.DescriptionRoutines(), command.IdUsuario(), command.TypeSkin());
            emit().onResponse(new ResponseEvents(routines.getUncommittedChanges()));
        }
    }
