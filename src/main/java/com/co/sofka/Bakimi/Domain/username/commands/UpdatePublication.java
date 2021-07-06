package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.Contents;
import com.co.sofka.Bakimi.Domain.username.values.IdPublication;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Tittle;

public class UpdatePublication implements Command {
    private final IdPublication idPublication;
    private final Tittle tittle;
    private final IdUsuario idUsuario;
    private final Contents contents;

    public UpdatePublication(IdPublication idPublication, Tittle tittle, IdUsuario idUsuario, Contents contents) {
        this.idPublication = idPublication;
        this.tittle = tittle;
        this.idUsuario = idUsuario;
        this.contents = contents;
    }

    public IdPublication idPublication() {
        return idPublication;
    }

    public Tittle tittle() {
        return tittle;
    }

    public IdUsuario idUsuario() {
        return idUsuario;
    }

    public Contents contents() {
        return contents;
    }
}
