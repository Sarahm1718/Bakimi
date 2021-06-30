package com.co.sofka.Bakimi.Domain.username.entity;

import com.co.sofka.Bakimi.Domain.username.values.Contents;
import com.co.sofka.Bakimi.Domain.username.values.IdCommentary;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Tittle;

public final class BlogBuilder {
    protected String publicationId;
    protected IdUsuario idUsuario;
    protected Tittle tittle;
    protected IdCommentary idCommentary;
    protected Contents contents;

    private BlogBuilder() {
    }

    public static BlogBuilder aBlog() {
        return new BlogBuilder();
    }

    public BlogBuilder withPublicationId(String publicationId) {
        this.publicationId = publicationId;
        return this;
    }

    public BlogBuilder withIdUsuario(IdUsuario idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public BlogBuilder withTittle(Tittle tittle) {
        this.tittle = tittle;
        return this;
    }

    public BlogBuilder withIdCommentary(IdCommentary idCommentary) {
        this.idCommentary = idCommentary;
        return this;
    }

    public BlogBuilder withContents(Contents contents) {
        this.contents = contents;
        return this;
    }

    public Blog build() {
        Blog blog = new Blog(null, idUsuario, tittle, idCommentary, contents);
        blog.setPublicationId(publicationId);
        return blog;
    }
}
