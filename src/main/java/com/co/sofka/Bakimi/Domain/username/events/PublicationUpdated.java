package com.co.sofka.Bakimi.Domain.username.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.username.values.Contents;
import com.co.sofka.Bakimi.Domain.username.values.IdPublication;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Tittle;

public class PublicationUpdated extends DomainEvent {
    private final IdPublication idPublication;
    private final Tittle tittle;
    private final IdUsuario idUsuario;
    private final Contents contents;


    public PublicationUpdated(IdPublication idPublication, Tittle tittle, IdUsuario idUsuario, Contents contents) {
        super("blog.updated");
        this.idPublication = idPublication;
        this.tittle = tittle;
        this.idUsuario = idUsuario;
        this.contents = contents;
    }

    public IdPublication getIdPublication() {
        return idPublication;
    }

    public Tittle tittle() {
        return tittle;
    }

    public IdUsuario idUsuario() {
        return idUsuario;
    }

    public Contents contents() {
        return contents;
    }
}
