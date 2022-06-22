package school.people.employees;

import school.base.EmployeeAccount;
import school.subjects.AcademicSubjects;

import java.util.Arrays;

import static school.subjects.Position.*;

public final class TeacherAccount extends EmployeeAccount {


    private  final AcademicSubjects[] academicSubjects;
/// napisat logiku , skolko predmetow mojet prepodawat


    public TeacherAccount(String name, String lastName, int age, int salary, int experience, AcademicSubjects... academicSubjects) {
        super(name, lastName, age, TEACHER, salary, experience);
        this.academicSubjects = academicSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherAccount teacher = (TeacherAccount) o;
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
        return '\n'+ super.getPersonInfo()+'\n'+"Academic subjects: "+Arrays.toString(academicSubjects)+'\n';



    }


}
