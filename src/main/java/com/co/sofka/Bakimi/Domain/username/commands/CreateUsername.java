package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;

public class CreateUsername implements Command {
    private final IdUsuario idUsuario;
    private final Email email;
    private final TypeSkin typeSkin;
    private final Name name;

    public CreateUsername(IdUsuario idUsuario, Email email, TypeSkin typeSkin, Name name) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.typeSkin = typeSkin;
        this.name = name;
    }

    public IdUsuario IdUsuario() {
        return idUsuario;
    }

    public Email Email() {
        return email;
    }

    public TypeSkin TypeSkin() {
        return typeSkin;
    }

    public Name Name() {
        return name;
    }
}
