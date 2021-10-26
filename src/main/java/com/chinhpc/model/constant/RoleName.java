package com.chinhpc.model.constant;

public enum RoleName {
    ADMINISTRATOR("Administrator"),
    USER("User");

    private final String stringValue;

    RoleName(String stringValue) {
        this.stringValue = stringValue;
    }

    public String get() {
        return stringValue;
    }
}