package com.co.sofka.Bakimi.Domain.routines;

import co.com.sofka.domain.generic.AggregateRoot;

import com.co.sofka.Bakimi.Domain.routines.values.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "Rutinas")
public  class Routines extends AggregateRoot<RoutinesId> {
    protected RoutinesName routinesName;
    protected Products products;
    protected DescriptionRoutines descriptionRoutines;
    protected IdUsuario idUsuario;
    protected TypeSkin typeSkin;

    public Routines(RoutinesId routinesId, RoutinesName routinesName, Products products, DescriptionRoutines descriptionRoutines, IdUsuario idUsuario, TypeSkin typeSkin) {
        super(routinesId);
        this.routinesName = routinesName;
        this.products = products;
        this.descriptionRoutines = descriptionRoutines;
        this.idUsuario = idUsuario;
        this.typeSkin = typeSkin;

    }

    public Routines(RoutinesId routinesId, RoutinesName routinesName, IdUsuario idUsuario, TypeSkin typeSkin) {
        super(routinesId);

    }

    public RoutinesName getRoutinesName() {
        return routinesName;
    }

    public Products getProducts() {
        return products;
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
