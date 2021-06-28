package com.co.sofka.Bakimi.Domain.username.entity;


import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "Rutinas")
public  class Routines extends Entity<RoutinesId> {
    protected RoutinesName routinesName;
    protected DescriptionRoutines descriptionRoutines;
    protected IdUsuario idUsuario;
    protected TypeSkin typeSkin;

    public Routines(RoutinesId routinesId, RoutinesName routinesName, DescriptionRoutines descriptionRoutines, IdUsuario idUsuario, TypeSkin typeSkin) {
        super(routinesId);
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.idUsuario = idUsuario;
        this.typeSkin = typeSkin;

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
