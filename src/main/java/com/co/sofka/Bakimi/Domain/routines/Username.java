package com.co.sofka.Bakimi.Domain.routines;

import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.routines.values.Email;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.routines.values.Name;
import com.co.sofka.Bakimi.Domain.routines.values.TypeSkin;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "Usuario")
public class Username extends AggregateRoot<IdUsuario> {
    protected Name name;
    protected Email email;
    protected TypeSkin typeSkin;
    protected IdUsuario idUsuario;


    public Username(IdUsuario entityId, Name name, Email email, TypeSkin typeSkin, IdUsuario idUsuario) {
        super(entityId);
        this.name = name;
        this.email = email;
        this.typeSkin = typeSkin;
        this.idUsuario = idUsuario;
    }

    public Username(IdUsuario entityId, Name name, Email email, TypeSkin typeSkin) {
        super(entityId);
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public TypeSkin getTypeSkin() {
        return typeSkin;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }
}