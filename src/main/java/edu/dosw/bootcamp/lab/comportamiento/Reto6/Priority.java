package edu.dosw.bootcamp.lab.comportamiento.Reto6;

public enum Priority {
    LOW("Baja", 1),
    MEDIUM("Media", 2),
    HIGH("Alta", 3);

    private final String label;
    private final int value;

    Priority(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public int getValue() {
        return value;
    }

    public static Priority fromString(String input) throws EmergencyException {
        String normalized = input.trim().toLowerCase();
        for (Priority priority : values()) {
            if (priority.name().equalsIgnoreCase(normalized) || priority.label.equalsIgnoreCase(normalized)) {
                return priority;
            }
        }
        if (normalized.startsWith("b") || normalized.contains("low")) return LOW;
        if (normalized.startsWith("m") || normalized.contains("med")) return MEDIUM;
        if (normalized.startsWith("a") || normalized.contains("high") || normalized.contains("alt")) return HIGH;
        throw new EmergencyException(EmergencyException.INVALID_PRIORITY + input);
    }
}
