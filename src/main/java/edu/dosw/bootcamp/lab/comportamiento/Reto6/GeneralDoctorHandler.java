package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

public class GeneralDoctorHandler extends StaffHandler {

    @Override
    public AttendanceResult handle(Patient patient, String trace) {
        if (patient.getSeverity() == SeverityLevel.MODERATE) {
            if (patient.getPriority() == Priority.LOW) {
                return new AttendanceResult(patient, "Médico General atendió.", true, SeverityLevel.MODERATE);
            }
            return passToNext(patient, "Médico General -> ");
        }
        return passToNext(patient, trace);
    }
}
