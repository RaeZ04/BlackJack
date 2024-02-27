package blackjack;

import java.util.HashMap;

public class game {

    public void generarCarta() {
        HashMap<String, Integer> baraja = new HashMap<>();
        baraja.put("A♠", 1);
        baraja.put("2♠", 2);
        baraja.put("3♠", 3);
        baraja.put("4♠", 4);
        baraja.put("5♠", 5);
        baraja.put("6♠", 6);
        baraja.put("7♠", 7);
        baraja.put("8♠", 8);
        baraja.put("9♠", 9);
        baraja.put("10♠", 10);
        baraja.put("J♠", 10);
        baraja.put("Q♠", 10);
        baraja.put("K♠", 10);

    }
}