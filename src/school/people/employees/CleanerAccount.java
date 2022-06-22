package school.people.employees;

import school.base.EmployeeAccount;
import school.subjects.Position;

import static school.subjects.Position.CLEANER;

public final class CleanerAccount extends EmployeeAccount {


    public CleanerAccount(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, CLEANER, salary, experience);
    }


}
