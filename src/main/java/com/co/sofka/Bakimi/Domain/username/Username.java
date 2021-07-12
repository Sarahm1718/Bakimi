package com.co.sofka.Bakimi.Domain.username;
import co.com.sofka.domain.generic.AggregateRoot;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Usuario")
public class Username extends AggregateRoot<IdUsuario> {
    @Id
    protected String usuarioId;
    protected Name name;

    protected Email email;

    public Username(IdUsuario entityId, Name name, Email email) {
        super(entityId);
        this.usuarioId = entityId.value();
        this.name = name;
        this.email = email;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}