package com.co.sofka.Bakimi.Domain.routines;

import com.co.sofka.Bakimi.Domain.routines.values.Email;
import com.co.sofka.Bakimi.Domain.routines.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.routines.values.Name;
import com.co.sofka.Bakimi.Domain.routines.values.TypeSkin;

public final class UsernameBuilder {
    protected Name name;
    protected Email email;
    protected TypeSkin typeSkin;
    protected IdUsuario idUsuario;

    private UsernameBuilder() {
    }

    public static UsernameBuilder anUsername() {
        return new UsernameBuilder();
    }

    public UsernameBuilder withName(Name name) {
        this.name = name;
        return this;
    }

    public UsernameBuilder withEmail(Email email) {
        this.email = email;
        return this;
    }

    public UsernameBuilder withTypeSkin(TypeSkin typeSkin) {
        this.typeSkin = typeSkin;
        return this;
    }

    public UsernameBuilder withIdUsuario(IdUsuario idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public Username build() {
        return new Username(null, name, email, typeSkin, idUsuario);
    }
}
