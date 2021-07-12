package com.co.sofka.Bakimi.Domain.username.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.username.values.*;


public class CreateRoutines implements Command {
    private  final RoutinesId routinesId;
    private final RoutinesName routinesName;
    private final DescriptionRoutines descriptionRoutines;
    private final TypeSkin typeSkin;

    public CreateRoutines(RoutinesId routinesId, RoutinesName routinesName, DescriptionRoutines descriptionRoutines,TypeSkin typeSkin) {
        this.routinesId = routinesId;
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
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

    public TypeSkin typeSkin() {
        return typeSkin;
    }
}