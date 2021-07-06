package com.co.sofka.Bakimi.Domain.username.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.username.values.*;

public class RoutinesCreated extends DomainEvent {
    private  final RoutinesId routinesId;
    private final RoutinesName routinesName;
    private final DescriptionRoutines descriptionRoutines;
    private final IdUsuario idUsuario;
    private final TypeSkin typeSkin;


    public RoutinesCreated(RoutinesId routinesId, RoutinesName routinesName, DescriptionRoutines descriptionRoutines, IdUsuario idUsuario, TypeSkin typeSkin) {
        super("routines.created");
        this.routinesId = routinesId;
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.idUsuario = idUsuario;
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

    public IdUsuario idUsuario() {
        return idUsuario;
    }

    public TypeSkin typeSkin() {
        return typeSkin;
    }
}
