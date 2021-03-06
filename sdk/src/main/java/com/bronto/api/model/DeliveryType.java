package com.bronto.api.model;

public enum DeliveryType implements ApiValue {
    NORMAL,
    TEST,
    TRANSACTIONAL,
    SPLIT,
    TRIGGERED,
    AUTOMATED;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
