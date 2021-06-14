package com.co.sofka.Bakimi.Domain.routines.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Bakimi.Domain.routines.values.*;


public class CreateRoutines implements Command {
    private  final RoutinesId routinesId;
    private final RoutinesName routinesName;
    private final Products products;
    private final IdUsuario idUsuario;
    private final DescriptionRoutines descriptionRoutines;
    private final TypeSkin typeSkin;

    public CreateRoutines(RoutinesId routinesId, RoutinesName routinesName, Products products, IdUsuario idUsuario, DescriptionRoutines descriptionRoutines, TypeSkin typeSkin) {
        this.routinesId = routinesId;
        this.routinesName = routinesName;
        this.products = products;
        this.idUsuario = idUsuario;
        this.descriptionRoutines = descriptionRoutines;
        this.typeSkin = typeSkin;
    }

    public RoutinesId RoutinesId() {
        return routinesId;
    }

    public RoutinesName RoutinesName() {
        return routinesName;
    }

    public Products Products() {
        return products;
    }

    public IdUsuario IdUsuario() {
        return idUsuario;
    }

    public DescriptionRoutines DescriptionRoutines() {
        return descriptionRoutines;
    }

    public TypeSkin TypeSkin() {
        return typeSkin;
    }
}