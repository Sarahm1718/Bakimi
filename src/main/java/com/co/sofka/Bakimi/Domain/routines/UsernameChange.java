package com.co.sofka.Bakimi.Domain.routines;

import co.com.sofka.domain.generic.EventChange;
import com.co.sofka.Bakimi.Domain.routines.events.RoutinesCreated;
import com.co.sofka.Bakimi.Domain.routines.events.UsernameCreated;

public class UsernameChange extends EventChange{
    public UsernameChange(Username username){
        apply((UsernameCreated event)->{
            username.name= event.Name();
            username.idUsuario= event.IdUsuario();
            username.email= event.Email();
            username.typeSkin= event.TypeSkin();
        });
    }
}



