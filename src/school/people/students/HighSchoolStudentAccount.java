package school.people.students;

import school.base.StudentAccount;
import school.subjects.Grade;

public final class HighSchoolStudentAccount extends StudentAccount {

    public HighSchoolStudentAccount(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, Grade.HIGH_SCHOOL);
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
