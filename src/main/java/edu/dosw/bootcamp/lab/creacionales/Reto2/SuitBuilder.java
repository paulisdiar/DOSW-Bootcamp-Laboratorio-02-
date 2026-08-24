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
        this.fabric = new Piece("Tela", "Lana ital.", 320_000);
    }

    public void withNationalClothFabric() {
        this.fabric = new Piece("Tela", "Paño nac.", 150_000);
    }

    public void withDoubleBreastJacket() {
        this.jacket = new Piece("Saco", "Cruzado", 250_000);
    }

    public void withSingleBreastJacket() {
        this.jacket = new Piece("Saco", "Recto", 200_000);
    }

    public void withSlimTrousers() {
        this.trousers = new Piece("Pantalón", "Slim", 180_000);
    }

    public void withClassicTrousers() {
        this.trousers = new Piece("Pantalón", "Clásico", 160_000);
    }

    public void withVest() {
        this.vest = new Piece("Chaleco", "Clásico", 90_000);
    }

    public void withSilkLining() {
        this.lining = new Piece("Forro", "Seda", 70_000);
    }

    public void withEmbroidery() {
        this.embroidery = new Piece("Bordado", "Iniciales", 35_000);
    }

    public Suit build() throws SuitException {
        if (fabric == null)   throw new SuitException(SuitException.FABRIC_REQUIRED);
        if (jacket == null)   throw new SuitException(SuitException.JACKET_REQUIRED);
        if (trousers == null) throw new SuitException(SuitException.TROUSERS_REQUIRED);

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
