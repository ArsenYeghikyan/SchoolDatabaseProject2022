package school.people.students;

import school.base.StudentAccount;
import school.subjects.Grade;

public final class PrimarySchoolStudentAccount extends StudentAccount {
    public PrimarySchoolStudentAccount(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, Grade.PRIMARY_SCHOOL);
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
