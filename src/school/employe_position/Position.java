package school.employe_position;

public enum Position {

    PRINCIPAL("PRINCIPAL"),
    TEACHER("TEACHER"),
    CLEANER("TEACHER"),
    SECURITY("SECURITY"),
    NURSE("NURSE"),
    ACCOUNTANT("ACCOUNTANT");

    Position(String position) {

    }


    @Override
    public String toString() {
        return name();
    }
}
