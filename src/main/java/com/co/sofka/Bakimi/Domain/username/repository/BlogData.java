package com.co.sofka.Bakimi.Domain.username.repository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Blog")
public class BlogData {
    @Id
    protected String publicationId;
    protected String idUsuario;
    protected String tittle;
    protected String idCommentary;
    protected String contents;

    public BlogData(String publicationId, String idUsuario, String tittle, String idCommentary, String contents) {
        publicationId = publicationId;
        this.idUsuario = idUsuario;
        this.tittle = tittle;
        this.idCommentary = idCommentary;
        this.contents = contents;
    }

    public BlogData(){

    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        publicationId = publicationId;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getIdCommentary() {
        return idCommentary;
    }

    public void setIdCommentary(String idCommentary) {
        this.idCommentary = idCommentary;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
