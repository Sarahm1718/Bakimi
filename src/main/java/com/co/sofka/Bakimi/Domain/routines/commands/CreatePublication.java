package com.co.sofka.Bakimi.Domain.routines.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.routines.values.Contents;
import com.co.sofka.Bakimi.Domain.routines.values.IdCommentary;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.routines.values.Tittle;

public class CreatePublication implements Command {
    private final IdCommentary idCommentary;
    private final IdUsuario idUsuario;
    private final Tittle tittle;
    private final Contents contents;

    public CreatePublication(IdCommentary idCommentary, IdUsuario idUsuario, Tittle tittle, Contents contents) {
        this.idCommentary = idCommentary;
        this.idUsuario = idUsuario;
        this.tittle = tittle;
        this.contents = contents;
    }

    public IdCommentary IdCommentary() {
        return idCommentary;
    }

    public IdUsuario IdUsuario() {
        return idUsuario;
    }

    public Tittle Tittle() {
        return tittle;
    }

    public Contents Contents() {
        return contents;
    }
}
