package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class IdCommentary extends Identity {
    public IdCommentary(String idcommentary){ super(idcommentary);}
    public static IdCommentary of(String idcommentary){
        return new IdCommentary(idcommentary);
    }

}
