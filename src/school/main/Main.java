package school.main;

import school.account_manager.AccountManager;
import school.base.StudentAccount;
import school.accounts.employees_accounts.*;
import school.accounts.students_accounts.*;

import static school.acadmic_subjects.AcademicSubjects.*;

public class Main {

    public static void main(String[] args) {


        TeacherAccount teacher = new TeacherAccount("Armen", "Kirakosyan", 36, 5, 20000, HISTORY);
        CleanerAccount cleanerAccount = new CleanerAccount("Z", "K", 36, 5, 30000);
        TeacherAccount teacher1 = new TeacherAccount("Z", "K", 36, 5, 50000, GEOMETRY, DRAWING);
        TeacherAccount teacher2 = new TeacherAccount("4", "K", 36, 5, 10000,  DRAWING);

        Accountant accountant = new Accountant("Arsen1", "Y", 34, 99, 25);
        SecurityAccount securityAccount = new SecurityAccount("Milena", "H", 25, 79, 5);
        PrincipalAccount principalAccount = new PrincipalAccount("Milena", "H", 25, 79, 7);

        NurseAccount nurseAccount = new NurseAccount("Milena Nurse", "H2", 25, 79, 7);

        StudentAccount student2 = new PrimarySchoolStudentAccount("Ivan", "P", 19, 8.9);
        SecondarySchoolAccount student3 = new SecondarySchoolAccount("Ivan2", "P2", 29, 8.9);
        HighSchoolStudentAccount student4 = new HighSchoolStudentAccount("Armen", "Petrov", 19, 8.9);
        PreschoolStudentAccount student = new PreschoolStudentAccount("Arsen", "Y", 34, 9.9);

        AccountManager manager = new AccountManager();

        manager.CreateAccountInfo(cleanerAccount);
        manager.CreateAccountInfo(student4);
        manager.CreateAccountInfo(nurseAccount);
        manager.CreateAccountInfo(teacher);
        manager.CreateAccountInfo(teacher1);
        manager.CreateAccountInfo(teacher2);
        manager.CreateAccountInfo(student);
        manager.CreateAccountInfo(securityAccount);
        manager.CreateAccountInfo(student2);
        manager.CreateAccountInfo(student3);
        manager.CreateAccountInfo(accountant);
        manager.CreateAccountInfo(principalAccount);

//        manager.deleteAccount(student);


    }


}
