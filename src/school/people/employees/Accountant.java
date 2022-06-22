package school.people.employees;

import school.base.EmployeeAccount;

import static school.subjects.Position.ACCOUNTANT;

public final class Accountant extends EmployeeAccount {
    public Accountant(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, ACCOUNTANT, salary, experience);
    }
}
