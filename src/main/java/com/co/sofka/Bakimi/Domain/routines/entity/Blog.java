package com.co.sofka.Bakimi.Domain.routines.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.routines.values.*;

public class Blog extends Entity<IdPublication>{
    protected IdCommentary idCommentary;
    protected IdUsuario idUsuario;
    protected Tittle tittle;
    protected Contents contents;

    public Blog(IdPublication entityId) {
        super(entityId);
    }
}
