package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tittle implements ValueObject<String> {
    private  final String value;

    public Tittle(String value){
        this.value = value;
    }


    @Override
    public String value() {
        return null;
    }
}
