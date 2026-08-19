package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

public abstract class StaffHandler {

    protected StaffHandler nextHandler;

    public StaffHandler setNext(StaffHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract AttendanceResult handle(Patient patient, String trace);

    protected AttendanceResult passToNext(Patient patient, String trace) {
        if (nextHandler != null) {
            return nextHandler.handle(patient, trace);
        }
        return new AttendanceResult(patient, null, false, null);
    }
}
