package school.people.students;

import school.base.Student;
import school.subjects.Grade;

import java.io.*;

public final class SecondarySchool extends Student {


    public SecondarySchool(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, Grade.SECONDARY_SCHOOL);
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
