package com.co.sofka.Bakimi.Domain.routines.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.routines.commands.CreateUsername;
import com.co.sofka.Bakimi.Domain.routines.entity.Username;
import com.co.sofka.Bakimi.Domain.routines.events.UsernameCreated;

import java.util.ArrayList;
import java.util.List;

public class CreateUsernameUserCase  extends UseCase<RequestCommand<CreateUsername>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateUsername> createUsernameRequestCommand) {
        var command = createUsernameRequestCommand.getCommand();
        new Username(command.IdUsuario(), command.Name(), command.Email(), command.TypeSkin());
        List<DomainEvent> ListEvents;
        ListEvents=new ArrayList<>();
        ListEvents.add(new UsernameCreated(command.Name(), command.Email(), command.TypeSkin(), command.IdUsuario()));
        emit().onResponse(new ResponseEvents(ListEvents));

    }
}
