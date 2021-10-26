package com.chinhpc.model.constant;

public enum ColourName {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private final String stringValue;

    ColourName(String stringValue) {
        this.stringValue = stringValue;
    }

    public String get(){
        return stringValue;
    }
}
