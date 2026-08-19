package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

import java.util.ArrayList;
import java.util.List;

public class SuitBuilder {

    private Piece fabric;
    private Piece jacket;
    private Piece trousers;
    private Piece vest;
    private Piece lining;
    private Piece embroidery;

    public void withItalianWoolFabric() {
        this.fabric = new Piece("Fabric", "Italian wool", 320_000);
    }

    public void withNationalClothFabric() {
        this.fabric = new Piece("Fabric", "National cloth", 150_000);
    }

    public void withDoubleBreastJacket() {
        this.jacket = new Piece("Jacket", "Double-breast", 250_000);
    }

    public void withSingleBreastJacket() {
        this.jacket = new Piece("Jacket", "Single-breast", 200_000);
    }

    public void withSlimTrousers() {
        this.trousers = new Piece("Trousers", "Slim fit", 180_000);
    }

    public void withClassicTrousers() {
        this.trousers = new Piece("Trousers", "Classic fit", 160_000);
    }

    public void withVest() {
        this.vest = new Piece("Vest", "Classic", 90_000);
    }

    public void withSilkLining() {
        this.lining = new Piece("Lining", "Silk", 70_000);
    }

    public void withEmbroidery() {
        this.embroidery = new Piece("Embroidery", "Initials", 35_000);
    }

    public Suit build() {
        if (fabric == null)   throw new IllegalStateException("Fabric is required.");
        if (jacket == null)   throw new IllegalStateException("Jacket is required.");
        if (trousers == null) throw new IllegalStateException("Trousers are required.");

        List<Piece> pieces = new ArrayList<>();
        pieces.add(fabric);
        pieces.add(jacket);
        pieces.add(trousers);
        if (vest != null)       pieces.add(vest);
        if (lining != null)     pieces.add(lining);
        if (embroidery != null) pieces.add(embroidery);

        return new Suit(pieces);
    }
}
