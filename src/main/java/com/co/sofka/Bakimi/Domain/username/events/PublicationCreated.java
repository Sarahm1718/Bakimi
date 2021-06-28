package com.co.sofka.Bakimi.Domain.username.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.username.values.*;

public class PublicationCreated extends DomainEvent {
    private final IdCommentary idCommentary;
    private final IdUsuario idUsuario;
    private final Tittle tittle;
    private final Contents contents;
    private final IdPublication idPublication;

    public PublicationCreated(IdCommentary idCommentary, IdUsuario idUsuario, Tittle tittle, Contents contents, IdPublication idPublication) {
        super("Bakimi.publication.created");
        this.idCommentary = idCommentary;
        this.idUsuario = idUsuario;
        this.tittle = tittle;
        this.contents = contents;
        this.idPublication = idPublication;
    }

    public IdCommentary IdCommentary() {
        return idCommentary;
    }

    public IdPublication IdPublication() {
        return idPublication;
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
