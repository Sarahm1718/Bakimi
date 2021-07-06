package com.co.sofka.Bakimi.Domain.username.repository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Blog")
public class BlogData {
    @Id
    protected String id;
    protected String tittle;
    protected String idUsuario;
    protected String contents;

    public BlogData(String id, String tittle, String idUsuario, String contents) {
        this.id = id;
        this.tittle = tittle;
        this.idUsuario = idUsuario;
        this.contents = contents;
    }

    public BlogData(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
