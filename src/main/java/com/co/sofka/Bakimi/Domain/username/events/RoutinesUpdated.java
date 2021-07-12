package com.co.sofka.Bakimi.Domain.username.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.username.values.*;

public class RoutinesUpdated extends DomainEvent {
    private  final RoutinesId routinesId;
    private final RoutinesName routinesName;
    private final DescriptionRoutines descriptionRoutines;
    private final TypeSkin typeSkin;

    public RoutinesUpdated(RoutinesId routinesId, RoutinesName routinesName, DescriptionRoutines descriptionRoutines,  TypeSkin typeSkin) {
        super("routines.updated");
        this.routinesId = routinesId;
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.typeSkin = typeSkin;
    }

    public RoutinesId getRoutinesId() {
        return routinesId;
    }

    public RoutinesName routinesName() {
        return routinesName;
    }

    public DescriptionRoutines descriptionRoutines() {
        return descriptionRoutines;
    }

    public TypeSkin typeSkin() {
        return typeSkin;
    }
}
