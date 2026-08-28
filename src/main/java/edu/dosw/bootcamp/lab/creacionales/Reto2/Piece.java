package edu.dosw.bootcamp.lab.creacionales.Reto2;

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
        String col1 = padRight(name + ":", 10);
        String col2 = padRight(description, 12);
        return col1 + col2 + "$" + formatPrice(price);
    }

    private String padRight(String text, int length) {
        StringBuilder sb = new StringBuilder(text);
        while (sb.length() < length) {
            sb.append(" ");
        }
        return sb.toString();
    }

    private String formatPrice(int price) {
        String num = String.valueOf(price);
        if (num.length() <= 3) return num;
        String first = num.substring(0, num.length() - 3);
        String last = num.substring(num.length() - 3);
        return first + "." + last;
    }
}


