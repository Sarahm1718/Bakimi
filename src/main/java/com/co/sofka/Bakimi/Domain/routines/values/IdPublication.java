package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.Identity;

public class IdPublication extends Identity{
    public IdPublication(String id){
        super(id);
    }
    public static IdPublication of(String id){
        return  new IdPublication(id);
    }

}
