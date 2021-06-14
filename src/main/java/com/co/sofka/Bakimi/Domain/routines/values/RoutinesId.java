package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.Identity;

public class RoutinesId extends Identity {
    private RoutinesId(String id){
        super(id);
    }
    public static RoutinesId of(String id){
        return  new RoutinesId(id);
    }
}
