/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author keown
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.rank + "-" + this.suit;
    }

    public int value() {
        if ("A".equals(rank)) {
            return 1;
        } else if (rank == "J" || rank == "Q" || rank == "K") {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }
}
