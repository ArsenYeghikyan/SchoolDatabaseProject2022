package school.accounts.students_accounts;

import school.base.StudentAccount;
import school.students_grade.Grade;

public final class SecondarySchoolAccount extends StudentAccount {


    public SecondarySchoolAccount(String name, String lastName, int age, double averageRating) {
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
