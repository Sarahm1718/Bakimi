package com.co.sofka.Bakimi.Domain.routines.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.routines.commands.CreatePublication;
import com.co.sofka.Bakimi.Domain.routines.entity.Blog;
import com.co.sofka.Bakimi.Domain.routines.events.PublicationCreated;

import java.util.ArrayList;

import java.util.List;



public class CreatePublicationUseCase extends UseCase<RequestCommand<CreatePublication>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreatePublication> createPublicationRequestCommand) {
        var command = createPublicationRequestCommand.getCommand();
        new Blog(command.IdPublication(), command.IdUsuario(), command.Contents(), command.Tittle(), command.IdCommentary());
        List<DomainEvent> ListEvents;
        ListEvents= new ArrayList<>();
        ListEvents.add(new PublicationCreated(command.IdCommentary(), command.IdUsuario(), command.Tittle(), command.Contents(), command.IdPublication()));
        emit().onResponse(new ResponseEvents(ListEvents));

    }
}
