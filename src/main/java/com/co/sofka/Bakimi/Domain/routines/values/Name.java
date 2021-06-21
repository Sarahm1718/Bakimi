package com.co.sofka.Bakimi.Domain.routines.values;

import co.com.sofka.domain.generic.ValueObject;

public class Name implements ValueObject {
    private  final String value;

    public Name(String value){
        this.value = value;
    }

    @Override
    public  String value(){
        return value;
    }
}
