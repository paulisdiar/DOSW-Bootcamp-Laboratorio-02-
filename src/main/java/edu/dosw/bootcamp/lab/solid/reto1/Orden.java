package edu.dosw.bootcamp.lab.solid.reto1;

import java.util.List;
import java.util.ArrayList;

public class Orden {

    private final List<ItemOrden> items;

    public Orden() {
        items = new ArrayList<>();
    }

    public void agregarItem(ItemOrden item) {
        items.add(item);
    }

    public List<ItemOrden> getItems() {
        return items;
    }
}

