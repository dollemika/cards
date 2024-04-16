package org.example;

import java.util.Objects;

public class Card {
    int num;
    CardSuit suit;

    public Card(int num, CardSuit suit) {
        this.num = num;
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", suit=" + suit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return num == card.num && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, suit);
    }
}

