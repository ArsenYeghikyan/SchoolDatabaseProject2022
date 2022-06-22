package school.people.employees;

import school.base.EmployeeAccount;


import static school.subjects.Position.SECURITY;

public final class SecurityAccount extends EmployeeAccount {
    public SecurityAccount(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, SECURITY, salary, experience);
    }
}
