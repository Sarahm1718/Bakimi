package com.co.sofka.Bakimi.Domain.routines.entity;

import com.co.sofka.Bakimi.Domain.routines.values.*;

public final class BlogBuilder {
    protected IdCommentary idCommentary;
    protected IdUsuario idUsuario;
    protected IdPublication idPublication;
    protected Tittle tittle;
    protected Contents contents;

    private BlogBuilder() {
    }

    public static BlogBuilder Blog() {
        return new BlogBuilder();
    }

    public BlogBuilder withIdCommentary(IdCommentary idCommentary) {
        this.idCommentary = idCommentary;
        return this;
    }

    public BlogBuilder withIdUsuario(IdUsuario idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public BlogBuilder withIdPublication(IdPublication idPublication) {
        this.idPublication = idPublication;
        return this;
    }

    public BlogBuilder withTittle(Tittle tittle) {
        this.tittle = tittle;
        return this;
    }

    public BlogBuilder withContents(Contents contents) {
        this.contents = contents;
        return this;
    }

    public Blog build() {
        return new Blog(null, idCommentary, idUsuario, idPublication, tittle, contents);
    }
}
