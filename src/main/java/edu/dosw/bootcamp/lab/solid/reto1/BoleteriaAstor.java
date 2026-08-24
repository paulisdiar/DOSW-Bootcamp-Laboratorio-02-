package edu.dosw.bootcamp.lab.solid.reto1;
import java.util.Scanner;
public class BoleteriaAstor {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Cine Astor!");
        System.out.print("Espectador: ");
        String tipo = sc.nextLine();

        Espectador espectador = switch (tipo) {
            case "Estudiante" -> new Estudiante();
            case "Tercera edad" -> new TerceraEdad();
            default -> new EspectadorGeneral();
        };

        System.out.println("Cartelera y precios:");
        System.out.println("  Boleta 2D $14.000");
        System.out.println("  Boleta 3D $22.000");
        System.out.println("  Crispetas $9.000");
        System.out.println("  Gaseosa $4.500");

        System.out.println("Ingrese su orden:");

        Boleta boleta3D = new Boleta("Boleta 3D", 22000);
        Confiteria crispetas = new Confiteria("Crispetas", 9000);
        Confiteria gaseosa = new Confiteria("Gaseosa", 4500);

        System.out.print("Boleta 3D: ");
        boleta3D.setCantidad(sc.nextInt());

        System.out.print("Crispetas: ");
        crispetas.setCantidad(sc.nextInt());

        System.out.print("Gaseosa: ");
        gaseosa.setCantidad(sc.nextInt());

        Orden orden = new Orden();
        orden.agregarItem(boleta3D);
        orden.agregarItem(crispetas);
        orden.agregarItem(gaseosa);

        double subtotal = Calculadora.subtotal(orden);
        double descuento = Calculadora.descuento(orden, espectador);
        double total = Calculadora.total(orden, espectador);

        orden.getItems().stream()
                .filter(item -> item.getCantidad() > 0)
                .forEach(item -> System.out.printf(
                        "%s: %d unidades agregadas a la orden.%n",
                        item.getNombre(),
                        item.getCantidad()
                ));

        System.out.println("------ FACTURA DE TAQUILLA -----");
        System.out.println("Espectador: " + espectador.getTipo());
        System.out.println("Ítems:");

        orden.getItems().stream()
                .filter(item -> item.getCantidad() > 0)
                .forEach(item -> System.out.printf(
                        "  %s - $%,.0f%n",
                        item.getNombre(),
                        item.getSubtotal()
                ));

        System.out.printf("Subtotal: $%,.0f%n", subtotal);
        System.out.printf("Descuento (%.0f%%): $%,.0f%n",
                espectador.getDescuento() * 100, descuento);
        System.out.printf("Total a pagar: $%,.0f%n", total);
        System.out.println("--------------------------------");
        System.out.println("¡Disfrute la función!");
    }
}