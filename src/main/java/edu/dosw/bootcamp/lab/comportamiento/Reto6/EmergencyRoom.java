package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmergencyRoom {

    private final Scanner scanner;
    private final StaffHandler chain;

    public EmergencyRoom(Scanner scanner) {
        this.scanner = scanner;
        this.chain = buildChain();
    }

    private StaffHandler buildChain() {
        StaffHandler nurse = new NurseHandler();
        StaffHandler doctor = new GeneralDoctorHandler();
        StaffHandler specialist = new SpecialistHandler();

        nurse.setNext(doctor).setNext(specialist);
        return nurse;
    }

    public List<AttendanceResult> processTriage() throws EmergencyException {
        System.out.println("Hospital San Rafael - Sala de Urgencias");
        System.out.print("Ingrese cantidad de pacientes: ");
        int count = Integer.parseInt(scanner.nextLine().trim());

        if (count <= 0) throw new EmergencyException(EmergencyException.INVALID_COUNT);

        List<AttendanceResult> results = new ArrayList<>();

        for (int i = 1; i <= count; i++) {

            System.out.printf("%nPaciente %d:%n", i);
            System.out.print("  Síntoma: ");
            String symptom = scanner.nextLine().trim();

            System.out.print("  Nivel (Leve/Moderado/Grave/Crítico): ");
            SeverityLevel level = SeverityLevel.fromString(scanner.nextLine().trim());

            System.out.print("  Prioridad (Baja/Media/Alta): ");
            Priority priority = Priority.fromString(scanner.nextLine().trim());

            Patient patient = new Patient("P" + i, symptom, level, priority);
            results.add(chain.handle(patient, null));
        }

        return results;
    }

    public void displayReport(List<AttendanceResult> results) {
        System.out.println();
        results.forEach(System.out::println);

        long mildCount = results.stream()
                .filter(AttendanceResult::isAttended)
                .filter(r -> r.getAttendedLevel() == SeverityLevel.MILD)
                .count();

        long moderateCount = results.stream()
                .filter(AttendanceResult::isAttended)
                .filter(r -> r.getAttendedLevel() == SeverityLevel.MODERATE)
                .count();

        long severeCount = results.stream()
                .filter(AttendanceResult::isAttended)
                .filter(r -> r.getAttendedLevel() == SeverityLevel.SEVERE)
                .count();

        long transferredCount = results.stream()
                .filter(r -> !r.isAttended())
                .count();

        double avgPriority = results.stream()
                .filter(AttendanceResult::isAttended)
                .mapToInt(r -> r.getPatient().getPriority().getValue())
                .average()
                .orElse(0.0);

        System.out.println("\n--- Estadísticas ---");
        System.out.printf("Atendidos - Leve: %d  Moder: %d  Grave: %d%n", mildCount, moderateCount, severeCount);
        System.out.printf("Remitidos a otra institución: %d%n", transferredCount);
        System.out.printf("Promedio prioridad atendidos: %.1f%n", avgPriority);
    }
}
