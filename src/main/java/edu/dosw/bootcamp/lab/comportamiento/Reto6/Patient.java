package edu.dosw.bootcamp.lab.comportamiento.Reto6;

public final class Patient {

    private final String id;
    private final String symptom;
    private final SeverityLevel severity;
    private final Priority priority;

    public Patient(String id, String symptom, SeverityLevel severity, Priority priority) {
        this.id = id;
        this.symptom = symptom;
        this.severity = severity;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getSymptom() {
        return symptom;
    }

    public SeverityLevel getSeverity() {
        return severity;
    }

    public Priority getPriority() {
        return priority;
    }
}
