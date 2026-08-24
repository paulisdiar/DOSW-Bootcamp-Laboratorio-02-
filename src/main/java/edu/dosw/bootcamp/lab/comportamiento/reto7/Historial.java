package edu.dosw.bootcamp.lab.comportamiento.reto7;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    private final List<Accion> acciones = new ArrayList<>();

    public void agregar(Accion accion) {
        acciones.add(accion);
    }

    public Accion obtener(int numero) {
        return acciones.get(numero - 1);
    }

    public void mostrar() {

        System.out.println("--- Historial ---");

        for (int i = 0; i < acciones.size(); i++) {

            Accion accion = acciones.get(i);

            String estado = accion.isDeshecha()
                    ? "[DESHECHO] "
                    : "";

            System.out.println(
                    "#" + (i + 1) + " "
                            + estado
                            + accion.getDescripcion()
                            + " - "
                            + accion.getOperador()
            );
        }
    }
}