package school.people.employees;

import school.base.EmployeeAccount;

import static school.subjects.Position.PRINCIPAL;

public final class PrincipalAccount extends EmployeeAccount {


    public PrincipalAccount(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, PRINCIPAL, salary, experience);
    }
}
