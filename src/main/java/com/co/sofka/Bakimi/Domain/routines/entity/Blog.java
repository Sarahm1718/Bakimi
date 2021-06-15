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

    public Blog(IdPublication entityId) {
        super(entityId);
    }


    public Blog(IdPublication entityId, IdUsuario idUsuario, Contents contents, Tittle tittle, IdCommentary idCommentary) {
        super(entityId);
    }
}
