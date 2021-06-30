package com.co.sofka.Bakimi.Domain.username.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Blog")
public class Blog extends Entity<IdPublication>{
    @Id
    protected String publicationId;
    protected IdUsuario idUsuario;
    protected Tittle tittle;
    protected IdCommentary idCommentary;
    protected Contents contents;

    public Blog(IdPublication entityId, IdUsuario idUsuario, Tittle tittle, IdCommentary idCommentary, Contents contents) {
        super(entityId);
        this.publicationId=entityId.value();
        this.idUsuario = idUsuario;
        this.tittle = tittle;
        this.idCommentary = idCommentary;
        this.contents = contents;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
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


