package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class CardTrick {
    public static ArrayList<Card> readFromFile(String file) {
            try{
            Scanner scanner = new Scanner(new File(file));
            ArrayList<Card> cards = new ArrayList<>();
            while(scanner.hasNext()) {
                int num = scanner.nextInt();
                String suit = scanner.next();
                if (Objects.equals(suit, CardSuit.CLUBS.getTitle())) cards.add(new Card(num,CardSuit.CLUBS));
                else
                    if (Objects.equals(suit, CardSuit.DIAMOND.getTitle())) cards.add(new Card(num,CardSuit.DIAMOND));
                    else
                        if (Objects.equals(suit, CardSuit.HEART.getTitle())) cards.add(new Card(num,CardSuit.HEART));
                        else
                            if (Objects.equals(suit, CardSuit.SPADES.getTitle())) cards.add(new Card(num,CardSuit.SPADES));
            }
            return cards;
            }
            catch (Exception e){return null;}
    }
    public static ArrayList<Card> sortCards(ArrayList<Card> cards){
       cards.sort(Comparator.comparingInt(Card::getNum));
       return cards;
    }
}
