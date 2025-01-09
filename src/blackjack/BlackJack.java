package blackjack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class Game {
    private Hand player = new Hand();
    private Hand dealer = new Hand();
    private Deck d = new Deck();
    private static int decision;
    Scanner sc = new Scanner(System.in);

    public void start() {
        d.shuffle();
        System.out.println("////////////////////////////////////////");
        System.out.println("WELCOME TO BLACK JACK");
        System.out.println("////////////////////////////////////////");
        System.out.println("DO YOU WANT TO PLAY? (1)-YES (0)-NO");
        System.out.println("////////////////////////////////////////");
        decision = sc.nextInt();
        System.out.println("////////////////////////////////////////");

        if (decision != 1) {
            System.out.println("THANK YOU FOR YOUR TIME");
        } else {
            System.out.println("\nPlayer:");
            player.getHand(d);
            player.getHand(d);
            player.display();

            System.out.println("\nDealer:");
            dealer.getHand(d);
            dealer.display();

            while (decision == 1) {
                System.out.println("////////////////////////////////////////");
                System.out.println("DO YOU WANT TO HIT OR STAY? (1)-HIT (0)-STAY");
                System.out.println("////////////////////////////////////////");
                decision = sc.nextInt();
                System.out.println("////////////////////////////////////////");

                if (decision == 1) {
                    System.out.println("Player (HIT):");
                    player.getHand(d);
                    player.display();

                    if (player.getTotal() > 21) {
                        System.out.println("\nDealer:");
                        dealer.display();
                        break;
                    }
                } else {
                    while (decision == 0) {
                        System.out.println("\nDealer:");
                        dealer.display();

                        if (dealer.getTotal() < 17) {
                            System.out.println("\nDealer (HIT):");
                            dealer.getHand(d);
                            dealer.display();
                        } else {
                            break;
                        }
                    }
                }
            }

            if (dealer.getTotal() > player.getTotal() && dealer.getTotal() <= 21) {
                System.out.println("////////////////////////////////////////");
                System.out.println("DEALER WINS");
                System.out.println("////////////////////////////////////////");
            } else if (player.getTotal() > 21) {
                System.out.println("////////////////////////////////////////");
                System.out.println("Player BUST");
                System.out.println("DEALER WINS");
                System.out.println("////////////////////////////////////////");
            } else if (dealer.getTotal() > 21 && player.getTotal() <= 21) {
                System.out.println("////////////////////////////////////////");
                System.out.println("PLAYER WINS");
                System.out.println("////////////////////////////////////////");
            } else if (dealer.getTotal() == player.getTotal()) {
                System.out.println("////////////////////////////////////////");
                System.out.println("DRAW");
                System.out.println("////////////////////////////////////////");
            } else if (dealer.getTotal() < player.getTotal()) {
                System.out.println("////////////////////////////////////////");
                System.out.println("PLAYER WINS");
                System.out.println("////////////////////////////////////////");
            }
        }
    }
}

public class BlackJack {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
