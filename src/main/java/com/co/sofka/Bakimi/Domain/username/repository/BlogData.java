package com.co.sofka.Bakimi.Domain.username.repository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Blog")
public class BlogData {
    @Id
    protected String idb;
    protected String tittle;
    protected String idUsuario;
    protected String contents;

    public BlogData(String idb, String tittle, String idUsuario, String contents) {
        this.idb = idb;
        this.tittle = tittle;
        this.idUsuario = idUsuario;
        this.contents = contents;
    }

    public BlogData(){
    }

    public String getIdb() {
        return idb;
    }

    public void setId(String id) {
        this.idb = idb;
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
