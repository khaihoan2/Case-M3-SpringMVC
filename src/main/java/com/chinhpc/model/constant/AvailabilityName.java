package com.chinhpc.model.constant;

public enum AvailabilityName {
    IN_STOCK("In stock"),
    OUT_OF_STOCK("Out of stock");

    private final String stringValue;

    AvailabilityName(String stringValue) {
        this.stringValue = stringValue;
    }

    public String get() {
        return stringValue;
    }
}
