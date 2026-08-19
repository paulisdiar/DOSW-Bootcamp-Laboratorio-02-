package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

public class NurseHandler extends StaffHandler {

    @Override
    public AttendanceResult handle(Patient patient, String trace) {
        if (patient.getSeverity() == SeverityLevel.MILD && patient.getPriority() == Priority.LOW) {
            return new AttendanceResult(patient, "Enfermero atendió.", true, SeverityLevel.MILD);
        }
        return passToNext(patient, trace);
    }
}


