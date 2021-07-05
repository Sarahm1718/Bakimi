package com.co.sofka.Bakimi.Domain.username.repository;

import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuario")
public class UsernameData {
    @Id
    protected String id;
    protected String name;
    protected String email;
    protected String typeSkin;

    public UsernameData(String id, String name, String email, String typeSkin) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.typeSkin = typeSkin;
    }
    public UsernameData(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeSkin() {
        return typeSkin;
    }

    public void setTypeSkin(String typeSkin) {
        this.typeSkin = typeSkin;
    }
}
