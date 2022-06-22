package school.people.employees;

import school.base.EmployeeAccount;

import static school.subjects.Position.NURSE;

public final class NurseAccount extends EmployeeAccount {
    public NurseAccount(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, NURSE, salary, experience);
    }
}
