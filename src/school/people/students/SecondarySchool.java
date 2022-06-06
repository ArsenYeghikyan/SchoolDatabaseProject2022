package school.people.students;

import school.base.Student;
import school.subjects.Grade;

import java.io.File;

public final class SecondarySchool extends Student {
    public SecondarySchool(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, Grade.SECONDARY_SCHOOL,new File("src//school//files//", "secondary_school_student.txt"));
    }
}
