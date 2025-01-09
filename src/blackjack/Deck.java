/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author keown
 */
public class Deck {
     private final ArrayList<Card> deck;
    private final int numOfcards = 52;
    private static int currentCard;

    public Deck() {
        String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suit = {"Heart", "Diamonds", "Spades", "Clubs"};

        deck = new ArrayList<>();
        currentCard = 0;

        for (int i = 0; i < numOfcards; i++) {
            deck.add(new Card(rank[i % 13], suit[i / 13]));
        }
    }

    public void shuffle() {
        Random rand = new Random();
        int num = rand.nextInt(numOfcards);

        for (int i = 0; i < numOfcards; i++) {
            Card temp = deck.get(i);
            Card sec = deck.get(num);
            deck.set(i, sec);
            deck.set(num, temp);

            num = rand.nextInt(numOfcards);
        }
    }

    public Card drawCard() {
        if (currentCard < deck.size()) {
            return deck.get(currentCard++);
        } else {
            currentCard = 0;
            return null;
        }
    }
}
