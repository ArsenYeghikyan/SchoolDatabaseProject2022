package school.main;

import school.base.Student;
import school.people.employees.AccountManager;
import school.people.students.*;
import school.people.employees.Teacher;

import java.io.FileNotFoundException;

import static school.subjects.AcademicSubjects.*;

public class Main {

    public static void main(String[] args) {






        Teacher teacher = new Teacher("T","S",56,25,1000,RUSSIAN, ENGLISH);
        Teacher teacher1 = new Teacher("Z","K",36,5,20000,HISTORY);
        Student student = new PreschoolStudent("Arsen","Y",34,9.9);
        Student  student4 = new PreschoolStudent("Arsen1","Y",34,9.9);
        Student student1 = new HighSchoolStudent("Milena","H",25,7.9);
        Student student5 = new HighSchoolStudent("Milena2","H",25,7.9);
        Student student2 = new PrimarySchoolStudent("Ivan","P",19,8.9);
        Student student3 = new SecondarySchool("Ivan2","P2",29,8.9);

        AccountManager infoManager =  new AccountManager();

        infoManager.setPersonInfo(teacher1);
        infoManager.setPersonInfo(student2);
        infoManager.setPersonInfo(student4);
        infoManager.setPersonInfo(student5);
        infoManager.setPersonInfo(student1);
        infoManager.setPersonInfo(student);
        infoManager.setPersonInfo(student3);
        infoManager.setPersonInfo(teacher1);
        infoManager.setPersonInfo(teacher);
infoManager.findPerson(teacher,teacher.getEmployeesFile());
//        infoManager.addTeacher(teacher);
//        infoManager.addStudent(student1,student2);
//School school = new School(students,teachers);


infoManager.findPerson(teacher,teacher.getEmployeesFile());


    }


}
