package school.accounts.students_accounts;

import school.base.StudentAccount;
import school.students_grade.Grade;

import static school.students_grade.Grade.SECONDARY_SCHOOL;

public final class SecondarySchoolAccount extends StudentAccount {


    public SecondarySchoolAccount(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, SECONDARY_SCHOOL);
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
