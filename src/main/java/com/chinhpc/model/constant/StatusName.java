package com.chinhpc.model.constant;

public enum StatusName {
    STATUS_PENDING("Pending"),
    STATUS_PROCESSING("Processing"),
    STATUS_SHIPPING("Shipping"),
    STATUS_DELIVERED("Delivered");

    private final String stringValue;

    StatusName(String stringValue){
        this.stringValue = stringValue;
    }

    public String get() {
        return stringValue;
    }
}
