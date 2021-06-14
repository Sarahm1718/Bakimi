package com.co.sofka.Bakimi.Domain.routines;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Bakimi.Domain.routines.events.RoutinesCreated;
import com.co.sofka.Bakimi.Domain.routines.values.*;

import java.util.List;

public class Routines extends AggregateEvent<RoutinesId> {
    protected RoutinesName routinesName;
    protected Products products;
    protected DescriptionRoutines descriptionRoutines;
    protected IdUsuario idUsuario;
    protected TypeSkin typeSkin;

    private  Routines(RoutinesId routinesId){
       super(routinesId);
       subscribe(new RoutinesChange(this));
    }
    public Routines(RoutinesId routinesId, RoutinesName routinesName, Products products, DescriptionRoutines descriptionRoutines, IdUsuario idUsuario, TypeSkin typeSkin){
        super(routinesId);
        this.routinesName=routinesName;
        this.products=products;
        this.descriptionRoutines=descriptionRoutines;
        this.idUsuario=idUsuario;
        this.typeSkin=typeSkin;

        appendChange(new RoutinesCreated(entityId, routinesName, products, idUsuario, descriptionRoutines, typeSkin)).apply();
    }
    public static Routines from(RoutinesId routinesId, List<DomainEvent> events){
        var routines = new Routines((routinesId));
        events.forEach(routines::applyEvent);
        return routines;
    }
}
