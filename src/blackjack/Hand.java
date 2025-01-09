/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author keown
 */
public class Hand {
     private final ArrayList<Card> hand;
    private Card card;
    private int current = 0;
    private int sum = 0;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void display() {
        int size = 0;
        while (size < hand.size()) {
            System.out.println(hand.get(size++));
        }
        System.out.println("Total hand: " + sum);
    }

    public int getTotal() {
        return sum;
    }

    public int getHand(Deck d) {
        hand.add(d.drawCard());
        card = hand.get(current++);

        if (card.value() == 1 && sum < 21) {
            return sum += 11;
        } else {
            return sum += card.value();
        }
    }
}
