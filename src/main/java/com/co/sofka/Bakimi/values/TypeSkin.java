package com.co.sofka.Bakimi.values;

import co.com.sofka.domain.generic.ValueObject;

public class TypeSkin  implements ValueObject<String> {
    private  final String value;

    public TypeSkin(String value){
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
