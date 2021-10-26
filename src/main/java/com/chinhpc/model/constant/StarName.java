package com.chinhpc.model.constant;

public enum StarName {
    STAR_ONE(1),
    STAR_TWO(2),
    STAR_THREE(3),
    STAR_FOUR(4),
    STAR_FIVE(5);

    private final int intValue;

    StarName(int intValue) {
        this.intValue = intValue;
    }

    public int get() {
        return intValue;
    }
}
