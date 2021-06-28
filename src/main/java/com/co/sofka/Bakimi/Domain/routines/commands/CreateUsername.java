package com.co.sofka.Bakimi.Domain.routines.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.routines.values.Email;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.routines.values.Name;
import com.co.sofka.Bakimi.Domain.routines.values.TypeSkin;

public class CreateUsername implements Command {
    private final Name name;
    private final Email email;
    private final TypeSkin typeSkin;
    private final IdUsuario idUsuario;

    public CreateUsername(Name name, Email email, TypeSkin typeSkin, Name idUsuario) {
        this.name = name;
        this.email = email;
        this.typeSkin = typeSkin;
        this.idUsuario = idUsuario;
    }

    public Name Name() {
        return name;
    }

    public Email Email() {
        return email;
    }

    public TypeSkin TypeSkin() {
        return typeSkin;
    }

    public IdUsuario IdUsuario() {
        return idUsuario;
    }
}
