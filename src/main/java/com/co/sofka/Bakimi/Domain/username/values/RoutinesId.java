package com.co.sofka.Bakimi.Domain.username.values;

import co.com.sofka.domain.generic.Identity;

public class RoutinesId extends Identity {
    private RoutinesId(String idroutines){
        super(idroutines);
    }
    public static RoutinesId of(String idroutines){
        return  new RoutinesId(idroutines);
    }
}
