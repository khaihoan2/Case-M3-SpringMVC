package com.chinhpc.model.constant;

public enum ShipmentName {
    FEDEX("Fedex"),
    DHL("DHL");

    private final String stringValue;

    ShipmentName(String stringValue) {
        this.stringValue = stringValue;
    }

    public String get() {
        return stringValue;
    }
}
