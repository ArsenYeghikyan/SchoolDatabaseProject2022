package school.accounts.students_accounts;

import school.base.StudentAccount;
import school.students_grade.Grade;

import static school.students_grade.Grade.PRESCHOOL;

public final class PreschoolStudentAccount extends StudentAccount {

    public PreschoolStudentAccount(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, PRESCHOOL);
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
