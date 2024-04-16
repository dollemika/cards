package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestCardTricks {
    @Test
    public void testRead() {
        String fname = "cards.txt";
        Card c1 = new Card(3,CardSuit.CLUBS);
        Card c2 = new Card(3,CardSuit.SPADES);
        Card c3 = new Card(5,CardSuit.DIAMOND);
        ArrayList<Card> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        Assertions.assertEquals(c,CardTrick.readFromFile(fname));
    }
    @Test
    public void testSortCard(){
        Card c1 = new Card(3,CardSuit.CLUBS);
        Card c2 = new Card(3,CardSuit.SPADES);
        Card c3 = new Card(5,CardSuit.DIAMOND);
        ArrayList<Card> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        ArrayList<Card> b = new ArrayList<>();
        b.add(c1);
        b.add(c3);
        b.add(c2);
        Assertions.assertIterableEquals(c,CardTrick.sortCards(b));
    }
}
