package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

import java.util.List;
import java.util.Scanner;

public class HospitalEmergency {

    public static void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            EmergencyRoom room = new EmergencyRoom(scanner);
            List<AttendanceResult> results = room.processTriage();
            room.displayReport(results);
        } catch (EmergencyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
