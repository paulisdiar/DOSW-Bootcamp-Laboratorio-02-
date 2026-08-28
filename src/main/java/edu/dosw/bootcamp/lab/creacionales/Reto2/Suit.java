package edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class Suit {

    private final List<Piece> pieces;

    Suit(List<Piece> pieces) {
        this.pieces = Collections.unmodifiableList(new ArrayList<>(pieces));
    }

    public List<Piece> getPieces() { return pieces; }

    public int getTotalPrice() {
        return pieces.stream()
                .mapToInt(Piece::getPrice)
                .sum();
    }

    public void display() {
        System.out.println("\n-------- Tu Traje --------");
        for (Piece p : pieces) {
            System.out.println(p);
        }
        System.out.println("\nTotal:    $" + formatPrice(getTotalPrice()));
        System.out.println("¡Lo esperamos en la prueba!");
    }

    private String formatPrice(int price) {
        String num = String.valueOf(price);
        if (num.length() <= 3) return num;
        String first = num.substring(0, num.length() - 3);
        String last = num.substring(num.length() - 3);
        return first + "." + last;
    }
}
