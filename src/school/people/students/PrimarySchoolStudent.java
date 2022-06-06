package school.people.students;

import school.base.Student;
import school.subjects.Grade;

import java.io.File;

public final class PrimarySchoolStudent extends Student {
    public PrimarySchoolStudent(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, Grade.PRIMARY_SCHOOL,new File("src//school//files//", "primary_school_student.txt"));
    }
}
