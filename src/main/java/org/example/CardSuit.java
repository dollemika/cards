package org.example;

public enum CardSuit {
    HEART ("HEART"),
    SPADES ("SPADES"),
    CLUBS("CLUBS"),
    DIAMOND("DIAMOND");

    private final String title;

    CardSuit(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
