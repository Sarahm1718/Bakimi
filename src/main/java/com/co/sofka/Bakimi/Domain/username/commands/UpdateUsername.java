package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;

public class UpdateUsername implements Command {
    private final IdUsuario idUsuario;
    private final Name name;
    private final Email email;
    private final TypeSkin typeSkin;

    public UpdateUsername(IdUsuario idUsuario, Name name, Email email, TypeSkin typeSkin) {
        this.idUsuario = idUsuario;
        this.name = name;
        this.email = email;
        this.typeSkin = typeSkin;
    }

    public IdUsuario idUsuario() {
        return idUsuario;
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }

    public TypeSkin typeSkin() {
        return typeSkin;
    }
}
