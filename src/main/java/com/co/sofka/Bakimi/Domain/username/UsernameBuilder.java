package com.co.sofka.Bakimi.Domain.username;
import com.co.sofka.Bakimi.Domain.username.values.Email;
import com.co.sofka.Bakimi.Domain.username.values.Name;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;

public final class UsernameBuilder {
    protected Name name;
    protected Email email;
    protected TypeSkin typeSkin;

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

    public Username build() {
        return new Username(null, email, typeSkin, name);
    }
}
