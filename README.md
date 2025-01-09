# Blackjack Game - Java Console Application

## Overview
This is a console-based implementation of the classic card game **Blackjack** written in Java. The game allows a single player to compete against the dealer in a simplified version of the popular casino game.

## Features
- A shuffled deck of 52 cards.
- Ability for the player to **Hit** (draw another card) or **Stay** (keep the current hand).
- Dealer follows standard Blackjack rules:
  - Dealer must hit until their total is at least 17.
  - Dealer stays if their total is 17 or higher.
- Automatic detection of game outcomes:
  - Player **Bust** (goes over 21).
  - **Dealer Wins**, **Player Wins**, or **Draw**.

## Gameplay
1. **Start**: The game prompts the player to decide whether to play.
2. **Initial Deal**:
   - The player and dealer are each dealt two cards.
   - One of the dealer’s cards remains hidden initially.
3. **Player’s Turn**:
   - The player decides to **Hit** or **Stay**.
   - If the player’s total exceeds 21, the player **Busts** and the dealer wins.
4. **Dealer’s Turn**:
   - The dealer automatically draws cards until their total is at least 17.
5. **Endgame**:
   - The winner is determined based on the totals of the player and the dealer.

## Prerequisites
- **Java Development Kit (JDK)** installed on your system.
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a terminal with Java installed.

## How to Run
1. Clone or download the repository.
2. Compile the Java files:
   ```bash
   javac Q3.java
