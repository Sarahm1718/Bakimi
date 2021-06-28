package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.*;


public class CreateRoutines implements Command {
    private  final RoutinesId routinesId;
    private final RoutinesName routinesName;
    private final IdUsuario idUsuario;
    private final DescriptionRoutines descriptionRoutines;
    private final TypeSkin typeSkin;

    public CreateRoutines(RoutinesId routinesId, RoutinesName routinesName, IdUsuario idUsuario, DescriptionRoutines descriptionRoutines, TypeSkin typeSkin) {
        this.routinesId = routinesId;
        this.routinesName = routinesName;
        this.idUsuario = idUsuario;
        this.descriptionRoutines = descriptionRoutines;
        this.typeSkin = typeSkin;
    }

    public RoutinesId RoutinesId() {
        return routinesId;
    }

    public DescriptionRoutines getDescriptionRoutines() {
        return descriptionRoutines;
    }

    public RoutinesName RoutinesName() {
        return routinesName;
    }

    public IdUsuario IdUsuario() {
        return idUsuario;
    }

    public TypeSkin TypeSkin() {
        return typeSkin;
    }
}