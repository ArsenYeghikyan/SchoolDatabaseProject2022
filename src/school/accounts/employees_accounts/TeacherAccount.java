package school.accounts.employees_accounts;

import school.base.EmployeeAccount;
import school.acadmic_subjects.AcademicSubjects;

import java.util.Arrays;

import static school.employe_position.Position.*;

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
    public String getAccountInfo() {
        return "\nAcademic subjects: "+Arrays.toString(academicSubjects)+ super.getAccountInfo();



    }


}
