package school.people;

import school.people.Employee;
import school.subjects.Position;

import static school.subjects.Position.NURSE;

public final class Nurse extends Employee {
    public Nurse(String name, String lastName, int age, int salary, int experience) {
        super(name, lastName, age, NURSE, salary, experience);
    }
}
