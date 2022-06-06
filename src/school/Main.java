package school;

import school.people.InfoManager;
import school.people.students.*;
import school.people.Teacher;
import school.subjects.Grade;

import java.io.FileNotFoundException;

import static school.subjects.AcademicSubjects.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {






        Teacher teacher = new Teacher("T","S",56,25,1000,RUSSIAN, ENGLISH);
        Teacher teacher1 = new Teacher("Z","K",36,5,20000,HISTORY);
        Student  student = new PreschoolStudent("Arsen","Y",34,9.9);
        Student  student4 = new PreschoolStudent("Arsen1","Y",34,9.9);
        Student student1 = new HighSchoolStudent("Milena","H",25,7.9);
        Student student5 = new HighSchoolStudent("Milena2","H",25,7.9);
        Student student2 = new PrimarySchoolStudent("Ivan","P",19,8.9);
        Student student3 = new SecondarySchool("Ivan2","P2",29,8.9);

        InfoManager infoManager =  new InfoManager();

        infoManager.writeEmployeesInfo(teacher1);
        infoManager.writeStudentInfo(student2);
        infoManager.writeStudentInfo(student4);
        infoManager.writeStudentInfo(student5);
        infoManager.writeStudentInfo(student1);
        infoManager.writeStudentInfo(student);
        infoManager.writeStudentInfo(student3);
        infoManager.writeEmployeesInfo(teacher1);
        infoManager.writeEmployeesInfo(teacher);
        infoManager.writeEmployeesInfo(teacher);
        infoManager.writeEmployeesInfo(teacher);
//        infoManager.addTeacher(teacher);
//        infoManager.addStudent(student1,student2);
//School school = new School(students,teachers);





    }


}
