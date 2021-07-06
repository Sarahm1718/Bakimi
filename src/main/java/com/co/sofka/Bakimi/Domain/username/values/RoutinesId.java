package com.co.sofka.Bakimi.Domain.username.values;

import co.com.sofka.domain.generic.Identity;

public class RoutinesId extends Identity {
    private RoutinesId(String idr){
        super(idr);
    }
    public static RoutinesId of(String idr){
        return  new RoutinesId(idr);
    }
}
