package com.co.sofka.Bakimi.Domain.username;

import co.com.sofka.domain.generic.EventChange;
import com.co.sofka.Bakimi.Domain.username.events.UsernameCreated;

public class UsernameChange extends EventChange{
    public UsernameChange(Username username){
        apply((UsernameCreated event)->{
            username.name= event.Name();
            username.email= event.Email();
            username.typeSkin= event.TypeSkin();
        });
    }
}



