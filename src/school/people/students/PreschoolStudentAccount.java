package school.people.students;

import school.base.StudentAccount;
import school.subjects.Grade;

public final class PreschoolStudentAccount extends StudentAccount {

    public PreschoolStudentAccount(String name, String lastName, int age, double averageRating) {
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
