package com.co.sofka.Bakimi.Domain.username;

import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.Name;

public final class UsernameBuilder {
    protected String usuarioId;
    protected Name name;
    protected Email email;

    private UsernameBuilder() {
    }

    public static UsernameBuilder anUsername() {
        return new UsernameBuilder();
    }

    public UsernameBuilder withUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
        return this;
    }

    public UsernameBuilder withName(Name name) {
        this.name = name;
        return this;
    }

    public UsernameBuilder withEmail(Email email) {
        this.email = email;
        return this;
    }

    public Username build() {
        Username username = new Username(null, name, email);
        username.setUsuarioId(usuarioId);
        return username;
    }
}
