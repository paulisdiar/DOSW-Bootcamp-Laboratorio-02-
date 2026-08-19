package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        System.out.println("\n-------- Your Suit --------");
        pieces.forEach(p -> System.out.println("  " + p));
        System.out.printf("%nTotal:    $%,d%n", getTotalPrice());
        System.out.println("We look forward to your fitting!");
    }
}
