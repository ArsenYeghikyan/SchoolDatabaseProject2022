package school.accounts.employees_accounts;

import school.base.EmployeeAccount;

import static school.employe_position.Position.ACCOUNTANT;

public final class Accountant extends EmployeeAccount {
    public Accountant(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, ACCOUNTANT, salary, experience);
    }
}
