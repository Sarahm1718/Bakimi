package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.ValueObject;

public class Contents implements ValueObject<String> {
    private  final String value;

    public Contents(String value){
        this.value = value;
    }


    @Override
    public String value() {
        return null;
    }
}
