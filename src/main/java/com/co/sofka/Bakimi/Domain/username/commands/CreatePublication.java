package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.*;

public class CreatePublication implements Command {
    private final IdPublication idPublication;
    private final IdUsuario idUsuario;
    private final Tittle tittle;
    private final IdCommentary idCommentary;
    private final Contents contents;

    public CreatePublication(IdPublication idPublication, IdUsuario idUsuario, Tittle tittle, IdCommentary idCommentary, Contents contents) {
        this.idPublication = idPublication;
        this.idUsuario = idUsuario;
        this.tittle = tittle;
        this.idCommentary = idCommentary;
        this.contents = contents;
    }

    public IdPublication getIdPublication() {
        return idPublication;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public Tittle getTittle() {
        return tittle;
    }

    public IdCommentary getIdCommentary() {
        return idCommentary;
    }

    public Contents getContents() {
        return contents;
    }
}