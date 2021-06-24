package com.co.sofka.Bakimi.Domain.routines.entity;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.routines.values.*;

import java.util.List;

public class Blog extends Entity<IdPublication>{
    protected IdCommentary idCommentary;
    protected IdUsuario idUsuario;
    protected IdPublication idPublication;
    protected Tittle tittle;
    protected Contents contents;


    public Blog(IdPublication entityId, IdCommentary idCommentary, IdUsuario idUsuario, IdPublication idPublication, Tittle tittle, Contents contents) {
        super(entityId);
        this.idCommentary = idCommentary;
        this.idUsuario = idUsuario;
        this.idPublication = idPublication;
        this.tittle = tittle;
        this.contents = contents;
    }

    public Blog(IdPublication entityId, IdCommentary idCommentary, IdUsuario idUsuario, Contents contents, Tittle tittle) {
        super(entityId);
    }

    public IdCommentary getIdCommentary() {
        return idCommentary;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public IdPublication getIdPublication() {
        return idPublication;
    }

    public Tittle getTittle() {
        return tittle;
    }

    public Contents getContents() {
        return contents;
    }
}
