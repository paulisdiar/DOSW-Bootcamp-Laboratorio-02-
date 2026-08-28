package edu.dosw.bootcamp.lab.comportamiento.Reto6;

public class SpecialistHandler extends StaffHandler {

    @Override
    public AttendanceResult handle(Patient patient, String trace) {
        if ((patient.getSeverity() == SeverityLevel.MILD || patient.getSeverity() == SeverityLevel.MODERATE || patient.getSeverity() == SeverityLevel.SEVERE)
                && patient.getPriority().getValue() <= Priority.HIGH.getValue()) {
            return new AttendanceResult(patient, "Especialista atendió.", true, patient.getSeverity());
        }
        return passToNext(patient, trace);
    }
}

