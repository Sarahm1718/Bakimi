package com.co.sofka.Bakimi.Domain.routines.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.routines.values.*;

public class CreatePublication implements Command {
    private final IdCommentary idCommentary;
    private final IdUsuario idUsuario;
    private final Tittle tittle;
    private final Contents contents;
    private final IdPublication idPublication;

    public CreatePublication(IdCommentary idCommentary, IdUsuario idUsuario, Tittle tittle, Contents contents, IdPublication idPublication) {
        this.idCommentary = idCommentary;
        this.idUsuario = idUsuario;
        this.tittle = tittle;
        this.contents = contents;
        this.idPublication = idPublication;
    }

    public IdCommentary IdCommentary() {
        return idCommentary;
    }

    public IdPublication IdPublication() {
        return idPublication;
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
