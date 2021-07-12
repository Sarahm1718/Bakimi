package com.co.sofka.Bakimi.Domain.username.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;

public class UsernameUpdated extends DomainEvent {
    private final IdUsuario idUsuario;
    private final Name name;
    private final Email email;


    public UsernameUpdated(IdUsuario idUsuario, Name name, Email email) {
        super("username.updated");
        this.idUsuario = idUsuario;
        this.name = name;
        this.email = email;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }

}
