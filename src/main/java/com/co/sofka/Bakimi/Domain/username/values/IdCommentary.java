package com.co.sofka.Bakimi.Domain.username.values;

import co.com.sofka.domain.generic.Identity;

public class IdCommentary extends Identity {
    public IdCommentary(String id){ super(id);}
    public static IdCommentary of(String id){
        return new IdCommentary(id);
    }

}
