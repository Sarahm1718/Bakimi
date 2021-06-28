package com.co.sofka.Bakimi.Domain.username.values;

import co.com.sofka.domain.generic.Identity;

public class IdUsuario extends Identity {
    public IdUsuario(String id){
        super(id);
    }
    public static IdUsuario of(String id){
        return new IdUsuario(id);
    }

}
