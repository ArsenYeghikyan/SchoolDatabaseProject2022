package school.main;

import school.account_manager.AccountManager;
import school.base.StudentAccount;
import school.accounts.employees_accounts.*;
import school.accounts.students_accounts.*;

import static school.acadmic_subjects.AcademicSubjects.*;

public class Main {

    public static void main(String[] args) {


        TeacherAccount teacher = new TeacherAccount("ZZ", "K", 36, 5, 20000, HISTORY);
        CleanerAccount cleanerAccount = new CleanerAccount("Z", "K", 36, 5, 20000);
        TeacherAccount teacher1 = new TeacherAccount("Z", "K", 36, 5, 20000, HISTORY);

        Accountant accountant = new Accountant("Arsen1", "Y", 34, 99, 25);
        SecurityAccount securityAccount = new SecurityAccount("Milena", "H", 25, 79, 5);
        PrincipalAccount principalAccount = new PrincipalAccount("Milena", "H", 25, 79, 7);

        NurseAccount nurseAccount = new NurseAccount("Milena Nurse", "H2", 25, 79, 7);

        StudentAccount student2 = new PrimarySchoolStudentAccount("Ivan", "P", 19, 8.9);
        SecondarySchoolAccount student3 = new SecondarySchoolAccount("Ivan2", "P2", 29, 8.9);
        HighSchoolStudentAccount student4 = new HighSchoolStudentAccount("Ivan2", "P2", 29, 8.9);
        PreschoolStudentAccount student = new PreschoolStudentAccount("Arsen", "Y", 34, 9.9);

        AccountManager infoManager = new AccountManager();

        infoManager.WriteAccountsInfo(cleanerAccount);
        infoManager.WriteAccountsInfo(student4);
        infoManager.WriteAccountsInfo(nurseAccount);
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
