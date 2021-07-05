package com.co.sofka.Bakimi.Domain.username;

import ch.qos.logback.core.joran.spi.DefaultClass;
import co.com.sofka.domain.generic.AggregateRoot;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Usuario")
public class Username extends AggregateRoot<IdUsuario> {
    protected Name name;
    protected Email email;
    protected TypeSkin typeSkin;
    protected IdUsuario idUsuario;

    public Username(IdUsuario idUsuario, Email email, TypeSkin typeSkin, Name name) {
        super(idUsuario);
        this.name = name;
        this.email = email;
        this.typeSkin = typeSkin;
        this.idUsuario=idUsuario;
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