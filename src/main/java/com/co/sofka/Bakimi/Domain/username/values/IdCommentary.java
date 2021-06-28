package com.co.sofka.Bakimi.Domain.username.values;

import co.com.sofka.domain.generic.Identity;

public class IdCommentary extends Identity {
    public IdCommentary(String idcommentary){ super(idcommentary);}
    public static IdCommentary of(String idcommentary){
        return new IdCommentary(idcommentary);
    }

}
