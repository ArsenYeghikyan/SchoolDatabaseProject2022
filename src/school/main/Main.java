package school.main;

import school.base.EmployeeAccount;
import school.base.StudentAccount;
import school.people.employees.*;
import school.people.students.*;

import java.security.Security;

import static school.subjects.AcademicSubjects.*;

public class Main {

    public static void main(String[] args) {


        TeacherAccount teacher = new TeacherAccount("T", "S", 56, 25, 1000, RUSSIAN, ENGLISH);
        CleanerAccount cleanerAccount = new CleanerAccount("Z", "K", 36, 5, 20000);
        TeacherAccount teacher1 = new TeacherAccount("Z", "K", 36, 5, 20000, HISTORY);
        PreschoolStudentAccount student = new PreschoolStudentAccount("Arsen", "Y", 34, 9.9);
        Accountant accountant = new Accountant("Arsen1", "Y", 34, 99, 25);
        SecurityAccount securityAccount = new SecurityAccount("Milena", "H", 25, 79, 5);
        PrincipalAccount principalAccount = new PrincipalAccount("Milena", "H", 25, 79, 7);
        StudentAccount student2 = new PrimarySchoolStudentAccount("Ivan", "P", 19, 8.9);
        StudentAccount student3 = new SecondarySchoolAccount("Ivan2", "P2", 29, 8.9);

        AccountManager infoManager = new AccountManager();

        infoManager.WriteAccountsInfo(cleanerAccount);
        infoManager.WriteAccountsInfo(teacher);
        infoManager.WriteAccountsInfo(teacher1);
        infoManager.WriteAccountsInfo(student);
        infoManager.WriteAccountsInfo(securityAccount);
        infoManager.WriteAccountsInfo(student2);
        infoManager.WriteAccountsInfo(student3);
        infoManager.WriteAccountsInfo(accountant);
        infoManager.WriteAccountsInfo(principalAccount);


    }


}
