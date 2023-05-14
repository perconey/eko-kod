package com.konkursing.greencode.atm.model;

public enum RequestType {
    STANDARD(3),
    PRIORITY(1),
    SIGNAL_LOW(2),
    FAILURE_RESTART(0);

    private final int value;

    RequestType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}