package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.*;


public class CreateRoutines implements Command {
    private  final RoutinesId routinesId;
    private final RoutinesName routinesName;
    private final DescriptionRoutines descriptionRoutines;
    private final IdUsuario idUsuario;
    private final TypeSkin typeSkin;

    public CreateRoutines(RoutinesId routinesId, RoutinesName routinesName, DescriptionRoutines descriptionRoutines, IdUsuario idUsuario, TypeSkin typeSkin) {
        this.routinesId = routinesId;
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.idUsuario = idUsuario;
        this.typeSkin = typeSkin;
    }

    public RoutinesId getRoutinesId() {
        return routinesId;
    }

    public RoutinesName getRoutinesName() {
        return routinesName;
    }

    public DescriptionRoutines getDescriptionRoutines() {
        return descriptionRoutines;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public TypeSkin getTypeSkin() {
        return typeSkin;
    }
}