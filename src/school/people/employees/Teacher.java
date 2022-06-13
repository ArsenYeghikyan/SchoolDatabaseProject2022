package school.people.employees;

import school.base.Employee;
import school.subjects.AcademicSubjects;

import java.util.Arrays;

import static school.subjects.Position.*;

public final class Teacher extends Employee {


    private  final AcademicSubjects[] academicSubjects;
/// napisat logiku , skolko predmetow mojet prepodawat


    public Teacher(String name, String lastName, int age, int salary, int experience, AcademicSubjects... academicSubjects) {
        super(name, lastName, age, TEACHER, salary, experience);
        this.academicSubjects = academicSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Arrays.equals(academicSubjects, teacher.academicSubjects);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(academicSubjects);
    }

    public AcademicSubjects[] getAcademicSubjects() {
        return academicSubjects;
    }


    @Override
    public String getPersonInfo() {
        return '\n'+ super.getPersonInfo()+'\n'+"Academic subjects: "+Arrays.toString(academicSubjects);



    }

    @Override
    public String toString() {
        return getPersonInfo();
    }
}
