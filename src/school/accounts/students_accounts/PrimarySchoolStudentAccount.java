package school.accounts.students_accounts;

import school.base.StudentAccount;
import school.students_grade.Grade;

import static school.students_grade.Grade.PRIMARY_SCHOOL;

public final class PrimarySchoolStudentAccount extends StudentAccount {
    public PrimarySchoolStudentAccount(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, PRIMARY_SCHOOL);
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
