package com.co.sofka.Bakimi.Domain.username.values;

import co.com.sofka.domain.generic.Identity;

public class IdPublication extends Identity{
    public IdPublication(String idPublication){
        super(idPublication);
    }
    public static IdPublication of(String idPublication){
        return new IdPublication(idPublication);
    }

}
