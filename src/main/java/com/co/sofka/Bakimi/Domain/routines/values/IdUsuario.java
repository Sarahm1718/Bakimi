package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class IdUsuario extends Identity {
    public IdUsuario(String id){
        super(id);
    }
    public static IdUsuario of(String id){
        return new IdUsuario(id);
    }

}
