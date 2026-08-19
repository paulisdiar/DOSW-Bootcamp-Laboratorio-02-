package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

public final class AttendanceResult {

    private final Patient patient;
    private final String handlerTrace;
    private final boolean attended;
    private final SeverityLevel attendedLevel;

    public AttendanceResult(Patient patient, String handlerTrace, boolean attended, SeverityLevel attendedLevel) {
        this.patient = patient;
        this.handlerTrace = handlerTrace;
        this.attended = attended;
        this.attendedLevel = attendedLevel;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getHandlerTrace() {
        return handlerTrace;
    }

    public boolean isAttended() {
        return attended;
    }

    public SeverityLevel getAttendedLevel() {
        return attendedLevel;
    }

    @Override
    public String toString() {
        if (attended) {
            return String.format("%s: %s", patient.getId(), handlerTrace);
        }
        return String.format("%s: Sin profesional disponible.%n    Paciente remitido a otra institución.", patient.getId());
    }
}
