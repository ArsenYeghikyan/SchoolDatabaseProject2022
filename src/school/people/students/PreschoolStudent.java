package school.people.students;

import school.base.Student;
import school.subjects.Grade;

import java.io.File;

public final class PreschoolStudent extends Student {

    public PreschoolStudent(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, Grade.PRESCHOOL);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
