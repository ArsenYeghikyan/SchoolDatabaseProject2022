package school.accounts.employees_accounts;

import school.base.EmployeeAccount;

import static school.employe_position.Position.CLEANER;

public final class CleanerAccount extends EmployeeAccount {


    public CleanerAccount(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, CLEANER, salary, experience);
    }


}
