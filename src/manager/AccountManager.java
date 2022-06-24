package manager;

import school.base.StudentAccount;
import school.functions.SchoolInfoManagerMethods;
import school.base.EmployeeAccount;
import school.base.Account;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public final class AccountManager implements SchoolInfoManagerMethods {

    private final TreeSet<EmployeeAccount> employees = new TreeSet<>(Comparator.comparing(Account::getName));

    private final TreeSet<StudentAccount> students = new TreeSet<>(Comparator.comparing(Account::getName));


    public void addAccount(Account account) {


            if (account instanceof StudentAccount) {
                students.add((StudentAccount) account);

            } else if (account instanceof EmployeeAccount) {
                employees.add((EmployeeAccount) account);
            }



    }


    public TreeSet<? extends Account> checkAccount(Account account) {

        if (account instanceof StudentAccount) {
            return students;
        }
        return employees;

    }


    @Override
    public void WriteAccountsInfo(Account account) {

    addAccount(account);



        try (FileOutputStream fos = new FileOutputStream(account.getAccountFile())) {

            checkAccount(account).forEach(account1 -> {
                try {
                    fos.write(account1.getPersonInfo().getBytes());

                    fos.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });

        } catch (NullPointerException exception){
            System.out.println("You entered an empty value, please try again");
        }
        catch (Exception e) {
            System.out.println("oops!");

        }

    }


    @Override
    public void deletePerson(Account personForDelete, File personFile) {


    }

    @Override
    public void findPerson(Account peronForFind, File personFile) {


    }


    @Override
    public void sortPersonByName(LinkedList<Account> people, File personFile) {

    }

    @Override
    public void replacePerson(Account personForReplace, Account newPerson, File personFile) {

    }
}
