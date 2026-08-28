package edu.dosw.bootcamp.lab.comportamiento.Reto6;

public class GeneralDoctorHandler extends StaffHandler {

    @Override
    public AttendanceResult handle(Patient patient, String trace) {
        if ((patient.getSeverity() == SeverityLevel.MILD || patient.getSeverity() == SeverityLevel.MODERATE)
                && patient.getPriority().getValue() <= Priority.MEDIUM.getValue()) {
            return new AttendanceResult(patient, "Médico General atendió.", true, patient.getSeverity());
        }
        return passToNext(patient, trace);
    }
}
