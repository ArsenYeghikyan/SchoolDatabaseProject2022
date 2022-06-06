package school.subjects;

public enum AcademicSubjects {

    MATHEMATICS("MATHEMATICS"),
    HISTORY("HISTORY"),
    DRAWING("DRAWING"),
    SPORT("SPORT"),
    RUSSIAN("RUSSIAN"),
    ENGLISH("ENGLISH"),
    GEOMETRY("GEOMETRY");


    String subjectName;

    AcademicSubjects(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
