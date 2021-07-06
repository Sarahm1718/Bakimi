package com.co.sofka.Bakimi.Domain.username.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Blog")
public class Blog extends Entity<IdPublication> {
    @Id
    protected String publicationId;
    protected Tittle tittle;
    protected IdUsuario idUsuario;
    protected Contents contents;

    public Blog(IdPublication entityId, Tittle tittle, IdUsuario idUsuario, Contents contents) {
        super(entityId);
        this.publicationId = entityId.value();
        this.tittle = tittle;
        this.idUsuario = idUsuario;
        this.contents = contents;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public Tittle getTittle() {
        return tittle;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public Contents getContents() {
        return contents;
    }
}