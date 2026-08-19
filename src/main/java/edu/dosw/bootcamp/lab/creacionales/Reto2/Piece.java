package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

public final class Piece {

    private final String name;
    private final String description;
    private final int price;

    public Piece(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("%-12s %-14s $%,d", name + ":", description, price);
    }
}


