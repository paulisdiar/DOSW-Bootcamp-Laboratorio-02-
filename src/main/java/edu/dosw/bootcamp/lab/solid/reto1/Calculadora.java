package edu.dosw.bootcamp.lab.solid.reto1;

public class Calculadora {

    public static double subtotal(Orden orden) {
        return orden.getItems()
                .stream()
                .mapToDouble(ItemOrden::getSubtotal)
                .sum();
    }

    public static double descuento(Orden orden, Espectador espectador) {
        return subtotal(orden) * espectador.getDescuento();
    }

    public static double total(Orden orden, Espectador espectador) {
        return subtotal(orden) - descuento(orden, espectador);
    }
}
