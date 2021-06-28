package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.Identity;

public class IdPublication extends Identity{
    public IdPublication(String idpublication){
        super(idpublication);
    }
    public static IdPublication of(String idpublication){
        return  new IdPublication(idpublication);
    }

}
