package com.co.sofka.Bakimi.Domain.username.entity;

import com.co.sofka.Bakimi.Domain.username.values.DescriptionRoutines;
import com.co.sofka.Bakimi.Domain.username.values.RoutinesName;
import com.co.sofka.Bakimi.Domain.username.values.TypeSkin;

public final class RoutinesBuilder {
    protected String idRoutines;
    protected RoutinesName routinesName;
    protected DescriptionRoutines descriptionRoutines;
    protected TypeSkin typeSkin;

    private RoutinesBuilder() {
    }

    public static RoutinesBuilder aRoutines() {
        return new RoutinesBuilder();
    }

    public RoutinesBuilder withIdRoutines(String idRoutines) {
        this.idRoutines = idRoutines;
        return this;
    }

    public RoutinesBuilder withRoutinesName(RoutinesName routinesName) {
        this.routinesName = routinesName;
        return this;
    }

    public RoutinesBuilder withDescriptionRoutines(DescriptionRoutines descriptionRoutines) {
        this.descriptionRoutines = descriptionRoutines;
        return this;
    }

    public RoutinesBuilder withTypeSkin(TypeSkin typeSkin) {
        this.typeSkin = typeSkin;
        return this;
    }

    public Routines build() {
        Routines routines = new Routines(null, routinesName, descriptionRoutines, typeSkin);
        routines.setIdRoutines(idRoutines);
        return routines;
    }
}
