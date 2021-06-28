package com.co.sofka.Bakimi.Domain.username.values;

import co.com.sofka.domain.generic.ValueObject;

public class RoutinesName implements ValueObject<String> {
    private  final String value;

    public RoutinesName(String value){
        this.value = value;
    }


    @Override
    public String value() {
        return value;
    }
}
