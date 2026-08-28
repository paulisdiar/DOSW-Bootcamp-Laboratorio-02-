package edu.dosw.bootcamp.lab.comportamiento.Reto6;

import java.util.List;
import java.util.Scanner;

public class HospitalEmergency {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        run(new Scanner(System.in));
    }

    public static void run(Scanner scanner) {
        try {
            EmergencyRoom room = new EmergencyRoom(scanner);
            List<AttendanceResult> results = room.processTriage();
            room.displayReport(results);
        } catch (EmergencyException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
