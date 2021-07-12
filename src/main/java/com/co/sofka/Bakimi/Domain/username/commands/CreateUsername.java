package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Name;

public class CreateUsername implements Command {
    private final IdUsuario idUsuario;
    private final Name name;
    private final Email email;


    public CreateUsername(IdUsuario idUsuario, Name name, Email email) {
        this.idUsuario = idUsuario;
        this.name = name;
        this.email = email;
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
}
