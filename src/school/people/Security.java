package school.people;

import school.people.Employee;
import school.subjects.Position;


import static school.subjects.Position.SECURITY;

public final class Security extends Employee {
    public Security(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, SECURITY, salary, experience);
    }
}
