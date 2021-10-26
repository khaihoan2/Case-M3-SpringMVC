package com.chinhpc.model.constant;

public enum CityName {
    CITY_NEW_YORK("New York"),
    CITY_LAS_VEGAS("Las Vegas"),
    CITY_WASHINGTON("Washington"),
    CITY_MOSCOW("Moscow"),
    CITY_LONDON("London"),
    CITY_PARIS("Paris"),
    CITY_BEIJING("Beijing");

    private final String stringValue;

    CityName(String stringValue) {
        this.stringValue = stringValue;
    }

    public String get() {
        return stringValue;
    }
}
