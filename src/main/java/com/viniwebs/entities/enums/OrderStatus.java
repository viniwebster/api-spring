package com.viniwebs.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int value;

    OrderStatus(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    public static OrderStatus getOrderStatus(int value) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getValue() == value) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus: " + value);
    }

}
