package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.*;

public class CreatePublication implements Command {
    private final IdCommentary idCommentary;
    private final IdUsuario idUsuario;
    private final IdPublication idPublication;
    private final Tittle tittle;
    private final Contents contents;


    public CreatePublication(IdCommentary idCommentary, IdUsuario idUsuario, IdPublication idPublication, Tittle tittle, Contents contents) {
        this.idCommentary = idCommentary;
        this.idUsuario = idUsuario;
        this.idPublication = idPublication;
        this.tittle = tittle;
        this.contents = contents;
    }

    public IdCommentary getIdCommentary() {
        return idCommentary;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public IdPublication getIdPublication() {
        return idPublication;
    }

    public Tittle getTittle() {
        return tittle;
    }

    public Contents getContents() {
        return contents;
    }
}
