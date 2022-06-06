package school.people;

import school.people.Employee;
import school.subjects.Position;

import static school.subjects.Position.ACCOUNTANT;

public final class Accountant extends Employee {
    public Accountant(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, ACCOUNTANT, salary, experience);
    }
}
