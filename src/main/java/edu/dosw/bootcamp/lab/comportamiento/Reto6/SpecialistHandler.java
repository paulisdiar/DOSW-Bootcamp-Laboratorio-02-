package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

public class SpecialistHandler extends StaffHandler {

    @Override
    public AttendanceResult handle(Patient patient, String trace) {
        if (patient.getSeverity() == SeverityLevel.SEVERE || patient.getSeverity() == SeverityLevel.MODERATE) {
            String currentTrace = (trace != null ? trace : "") + "Especialista atendió.";
            return new AttendanceResult(patient, currentTrace, true, SeverityLevel.SEVERE);
        }
        return passToNext(patient, trace);
    }
}

