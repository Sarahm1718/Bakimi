package com.co.sofka.Bakimi.Domain.username.entity;


import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Bakimi.Domain.username.values.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Rutinas")
public  class Routines extends Entity<RoutinesId> {
    @Id
    protected String idRoutines;
    protected RoutinesName routinesName;
    protected DescriptionRoutines descriptionRoutines;
    protected IdUsuario idUsuario;
    protected TypeSkin typeSkin;

    public Routines(RoutinesId entityId, RoutinesName routinesName, DescriptionRoutines descriptionRoutines, IdUsuario idUsuario, TypeSkin typeSkin) {
        super(entityId);
        this.idRoutines= entityId.value();
        this.routinesName = routinesName;
        this.descriptionRoutines = descriptionRoutines;
        this.idUsuario = idUsuario;
        this.typeSkin = typeSkin;
    }

    public String getIdRoutines() {
        return idRoutines;
    }

    public void setIdRoutines(String idRoutines) {
        this.idRoutines = idRoutines;
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
