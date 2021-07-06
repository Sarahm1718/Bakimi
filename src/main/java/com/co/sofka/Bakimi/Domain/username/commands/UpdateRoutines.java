package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.*;

public class UpdateRoutines implements Command {

    private  final RoutinesId routinesId;
    private final RoutinesName routinesName;
    private final DescriptionRoutines descriptionRoutines;
    private final IdUsuario idUsuario;
    private final TypeSkin typeSkin;

    public UpdateRoutines(RoutinesId routinesId, RoutinesName routinesName, DescriptionRoutines descriptionRoutines, IdUsuario idUsuario, TypeSkin typeSkin) {
        this.routinesId = routinesId;
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.idUsuario = idUsuario;
        this.typeSkin = typeSkin;
    }

    public RoutinesId routinesId() {
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
