package com.co.sofka.Bakimi.Domain.routines;

import co.com.sofka.domain.generic.EventChange;
import com.co.sofka.Bakimi.Domain.routines.events.RoutinesCreated;

    public class RoutinesChange extends EventChange {
        public  RoutinesChange(Routines routines){
            apply((RoutinesCreated event)->{
                routines.descriptionRoutines= event.DescriptionRoutines();
                routines.routinesName= event.RoutinesName();
                routines.typeSkin= event.TypeSkin();
                routines.idUsuario= event.IdUsuario();
                routines.products= event.Products();
            });
        }
    }


