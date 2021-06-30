package com.co.sofka.Bakimi.Domain.username.entity;

import com.co.sofka.Bakimi.Domain.username.values.DescriptionRoutines;
import com.co.sofka.Bakimi.Domain.username.values.IdUsuario;
import com.co.sofka.Bakimi.Domain.username.values.RoutinesName;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;

public final class RoutinesBuilder {
    protected RoutinesName routinesName;
    protected DescriptionRoutines descriptionRoutines;
    protected IdUsuario idUsuario;
    protected TypeSkin typeSkin;

    private RoutinesBuilder() {
    }

    public static RoutinesBuilder aRoutines() {
        return new RoutinesBuilder();
    }

    public RoutinesBuilder withRoutinesName(RoutinesName routinesName) {
        this.routinesName = routinesName;
        return this;
    }

    public RoutinesBuilder withDescriptionRoutines(DescriptionRoutines descriptionRoutines) {
        this.descriptionRoutines = descriptionRoutines;
        return this;
    }

    public RoutinesBuilder withIdUsuario(IdUsuario idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public RoutinesBuilder withTypeSkin(TypeSkin typeSkin) {
        this.typeSkin = typeSkin;
        return this;
    }

    public Routines build() {
        return new Routines(null, routinesName, descriptionRoutines, idUsuario, typeSkin);
    }
}
