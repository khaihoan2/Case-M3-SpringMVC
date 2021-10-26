package com.chinhpc.model.constant;

public enum PaymentName {
    CASH_ON_DELIVERY("Cash on delivery"),
    BANK_TRANSFER("Bank transfer"),
    CHEQUE("Cheque"),
    PAYPAL("Paypal");

    private final String stringValue;

    PaymentName(String stringValue) {
        this.stringValue = stringValue;
    }

    public String get() {
        return stringValue;
    }
}
