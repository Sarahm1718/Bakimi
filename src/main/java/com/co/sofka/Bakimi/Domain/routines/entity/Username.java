package com.co.sofka.Bakimi.Domain.routines.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.routines.values.Email;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.routines.values.Name;
import com.co.sofka.Bakimi.Domain.routines.values.TypeSkin;

public class Username extends Entity<IdUsuario> {
    protected Name name;
    protected Email email;
    protected TypeSkin typeSkin;
    protected IdUsuario idUsuario;

    public Username(IdUsuario entityId) {
        super(entityId);
    }

    public Username(IdUsuario entityId, Name name, Email email, TypeSkin typeSkin) {
        super(entityId);
    }
}