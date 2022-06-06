package school.people;

import school.people.Employee;

import static school.subjects.Position.CLEANER;

public final class Cleaner extends Employee {


    public Cleaner(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, CLEANER, salary, experience);
    }
}
