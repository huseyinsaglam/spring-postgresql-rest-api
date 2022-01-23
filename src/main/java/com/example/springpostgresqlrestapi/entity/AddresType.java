package com.example.springpostgresqlrestapi.entity;

public enum AddresType {
    EV_ADRESI(0),
    IS_ADRESI(1),
    DIGER(2);

    private int value;

     AddresType (int value){
         this.value=value;
    }

    // AddresType.EV_ADRESI.value => 0
    // AddresType.IS_ADRESI.value => 1
    // AddresType.DIGER.value => 2

}
