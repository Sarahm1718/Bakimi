package com.co.sofka.Bakimi.Domain.routines.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.routines.values.Contents;
import com.co.sofka.Bakimi.Domain.routines.values.IdCommentary;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.routines.values.Tittle;

public class PublicationCreated extends DomainEvent {
    private final IdCommentary idCommentary;
    private final IdUsuario idUsuario;
    private final Tittle tittle;
    private final Contents contents;

    public PublicationCreated(IdCommentary idCommentary, IdUsuario idUsuario, Tittle tittle, Contents contents) {
        super("Bakimi.publication.created");
        this.idCommentary = idCommentary;
        this.idUsuario = idUsuario;
        this.tittle = tittle;
        this.contents = contents;
    }

    public IdCommentary IdCommentary() {
        return idCommentary;
    }

    public IdUsuario IdUsuario() {
        return idUsuario;
    }

    public Tittle Tittle() {
        return tittle;
    }

    public Contents Contents() {
        return contents;
    }
}
