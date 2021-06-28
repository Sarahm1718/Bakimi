package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.ValueObject;

public class Email implements ValueObject {
    private  final String value;

    public Email(String value){
        this.value = value;
    }


    @Override
    public String value() {
        return null;
    }
}
