package edu.dosw.bootcamp.lab.comportamiento.reto7;

import java.util.Scanner;

public class RoverExplorador {

    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        Motor motor = new Motor();
        Brazo brazo = new Brazo();
        Camara camara = new Camara();
        Taladro taladro = new Taladro();

        Historial historial = new Historial();

        System.out.println("Rover Chibchombo");

        System.out.print("¿Cuántas acciones desea registrar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("\nOperador: ");
            String operador = scanner.nextLine();

            System.out.println("Acción " + i);

            System.out.print("Módulo: ");
            String modulo = scanner.nextLine();

            System.out.print("Acción: ");
            String accion = scanner.nextLine();

            Accion comando = crearAccion(
                    operador,
                    modulo,
                    accion,
                    scanner,
                    motor,
                    brazo,
                    camara,
                    taladro
            );

            comando.ejecutar();
            historial.agregar(comando);
        }

        System.out.print(
                "\n¿Desea deshacer alguna acción? (si/no): "
        );

        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {

            System.out.print("Número de acción: ");
            int numero = scanner.nextInt();

            Accion accion = historial.obtener(numero);

            accion.deshacer();

            System.out.println(
                    "Acción deshecha: "
                            + accion.getDescripcion()
            );
        }

        System.out.println();

        historial.mostrar();
    }

    private static Accion crearAccion(
            String operador,
            String modulo,
            String accion,
            Scanner scanner,
            Motor motor,
            Brazo brazo,
            Camara camara,
            Taladro taladro) {

        if (modulo.equalsIgnoreCase("Motor")) {

            System.out.print("Metros: ");
            int metros = scanner.nextInt();
            scanner.nextLine();

            if (accion.equalsIgnoreCase("Avanzar")) {

                return new Accion(
                        operador,
                        "Motor Avanzar(" + metros + "m)",
                        () -> motor.avanzar(metros),
                        () -> motor.retroceder(metros)
                );
            }

            return new Accion(
                    operador,
                    "Motor Retroceder(" + metros + "m)",
                    () -> motor.retroceder(metros),
                    () -> motor.avanzar(metros)
            );
        }

        if (modulo.equalsIgnoreCase("Brazo")) {

            if (accion.equalsIgnoreCase("Recoger")) {

                return new Accion(
                        operador,
                        "Brazo Recoger",
                        brazo::recoger,
                        brazo::soltar
                );
            }

            return new Accion(
                    operador,
                    "Brazo Soltar",
                    brazo::soltar,
                    brazo::recoger
            );
        }

        if (modulo.equalsIgnoreCase("Cámara")) {

            System.out.print("Segundos: ");
            int segundos = scanner.nextInt();
            scanner.nextLine();

            if (accion.equalsIgnoreCase("Grabar")) {

                return new Accion(
                        operador,
                        "Cámara Grabar(" + segundos + "s)",
                        () -> camara.grabar(segundos),
                        camara::detener
                );
            }

            return new Accion(
                    operador,
                    "Cámara Detener",
                    camara::detener,
                    () -> camara.grabar(segundos)
            );
        }

        if (modulo.equalsIgnoreCase("Taladro")) {

            System.out.print("Profundidad (cm): ");
            int profundidad = scanner.nextInt();
            scanner.nextLine();

            if (accion.equalsIgnoreCase("Perforar")) {

                return new Accion(
                        operador,
                        "Taladro Perforar(" + profundidad + "cm)",
                        () -> taladro.perforar(profundidad),
                        taladro::retraer
                );
            }

            return new Accion(
                    operador,
                    "Taladro Retraer",
                    taladro::retraer,
                    () -> taladro.perforar(profundidad)
            );
        }

        throw new IllegalArgumentException("Módulo no válido");
    }
}
